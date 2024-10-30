package com.pluralsight;
import java.time.LocalDate;

public class Asset {

    protected String description;
    protected LocalDate dateAquired;
    protected double originalCost;

    public Asset(double originalCost, String description, LocalDate dateAcquired) {
        this.description = description;
        this.originalCost = originalCost;
        this.dateAquired = dateAcquired;
    }

    public void constructor() {

    }

    public String getDescription() { return description;
    }

    public void setDescription(String description) { this.description = description;
    }

    public LocalDate getDateAquired() { return dateAquired;
    }

    public void setDateAquired(LocalDate dateAquired) { this.dateAquired = dateAquired;
    }

    public double getOriginalCost() { return originalCost;
    }

    public void setOriginalCost(double originalCost) { this.originalCost = originalCost;
    }
    public double getValue() { return this.originalCost;
    }
}
