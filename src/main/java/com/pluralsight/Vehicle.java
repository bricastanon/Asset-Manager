package com.pluralsight;
import java.time.LocalDate;
public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;


    //Todo: check the superclass
    public Vehicle(double originalCost, String description, LocalDate dateAcquired) {
        super(originalCost,description, dateAcquired);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() { return makeModel;
    }

    public void setMakeModel(String makeModel) { this.makeModel = makeModel;
    }

    public int getYear() { return year;
    }

    public void setYear(int year) { this.year = year;
    }

    public int getOdometer() { return odometer;
    }

    public void setOdometer(int odometer) { this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        int yearsOld = currentYear - year;
        double carValue;

        switch (yearsOld) {
            case 0, 1, 2, 3 -> carValue = 0.03;
            case 4, 5, 6 -> carValue = 0.06;
            case 7, 8, 9, 10 -> carValue = 0.08;
            default -> {
                return 1000;
            }
        }

        double depricatedValue = super.originalCost * (1 - carValue * yearsOld);

        if (odometer > 100000 && makeModel.contains("Honda") || makeModel.contains("Toyota")) {
            depricatedValue *= 0.75;
        }

        return depricatedValue;
    }
}








