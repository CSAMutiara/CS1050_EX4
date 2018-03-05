package aup.cs.shop;

import java.util.Arrays;

/**
 * Brush class: Shave subclass.
 */

public class Brush extends Shave {
    
    private String material;
    
    /**
     * Brush constructor.
     */
    public Brush(String t, double p, String m) {
        super(t, p, "Shave > Brush");
        this.material = m;
    }
    
    /**
     * Brush constructor.
     */
    public Brush(String t, double p) {
        super(t, p, "Shave > Brush");
    }
    
    /**
     * returns this' private variables as Strings.
     */
    public String toString() {
        return (super.toString() + String.format("%12s", this.material));
    }   
            
    
}