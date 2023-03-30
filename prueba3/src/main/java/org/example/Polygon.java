package org.example;

public class Polygon {
    private final int numberOfSides;

    // Codigo con error
    //public Polygon(int numberOfSides) {
     //   this.numberOfSides = numberOfSides;
   // }

    public Polygon(int numberOfSides) {
        if (numberOfSides <= 2) {
            throw new TooFewSidesException("You can't have fewer than 3 sides for a polygon", numberOfSides);
        }
        this.numberOfSides = numberOfSides;
    }



}
