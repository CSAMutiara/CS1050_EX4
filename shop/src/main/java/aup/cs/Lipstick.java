package aup.cs.shop;

import java.util.Arrays;

/**
 * Lipstick class: Cosmetic subclass.
 */

public class Lipstick extends CosmeticProduct {
    
    private String color;
    
    /**
     * Soap constructor.
     */
    public Lipstick(String t, double p, String c) {
        super(t, p, "Lipstick");
        this.color = c;
    }
    
    /**
     * returns this' private variables as Strings.
     */
    public String toString() {
        return (super.toString() + String.format("%15s", this.color));
    } 
    
}