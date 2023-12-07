/**
 * PairOfShoes
 * Author: Nicholas Vickery
 * Date: 09/18/2023
 * Program: Basic java concepts
 */

public class PairOfShoes {
    // Private fields
    private String brandName;
    private double sizeOfShoes;
    private String colorOfShoes;

    // Public constructor
    public PairOfShoes() {
        brandName = "";
        sizeOfShoes = 0.0;
        colorOfShoes = "";
    }

    // Getter and Setter methods
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getSizeOfShoes() {
        return sizeOfShoes;
    }

    public void setSizeOfShoes(double sizeOfShoes) {
        this.sizeOfShoes = sizeOfShoes;
    }

    public String getColorOfShoes() {
        return colorOfShoes;
    }

    public void setColorOfShoes(String colorOfShoes) {
        this.colorOfShoes = colorOfShoes;
    }

    // printAll() method to print shoe details
    public void printAll() {
        System.out.print(colorOfShoes + " " + brandName + " size " + sizeOfShoes);
    }
}

