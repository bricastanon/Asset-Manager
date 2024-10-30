package com.pluralsight;

import java.time.LocalDate;

public class House extends Asset {

    private String adress;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(double originalCost, String description, LocalDate dateAcquired, String adress, int condition, int squareFoot, int lotSize) {
        super(originalCost, description, dateAcquired);
        this.adress = adress;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() { return adress;
    }

    public void setAdress(String adress) { this.adress = adress;
    }

    public int getCondition() { return condition;
    }

    public void setCondition(int condition) { this.condition = condition;
    }

    public int getSquareFoot() { return squareFoot;
    }

    public void setSquareFoot(int squareFoot) { this.squareFoot = squareFoot;
    }

    public int getLotSize() { return lotSize;
    }

    public void setLotSize(int lotSize) { this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double  valuePerSquareFoot= switch (condition) {
            case 1 -> 180.00;  // excellent
            case 2 -> 130.00;  // good
            case 3 -> 90.00;   // fair
            default -> 80.00;  // poor
        };

        return (valuePerSquareFoot * squareFoot) + (0.25 * lotSize);
    }
}

