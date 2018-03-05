package aup.cs.shop;

import java.util.Arrays;

/**
 * Soap class: Shave subclass.
 */

public class Soap extends Shave {
    
    /**
     * Soap constructor.
     */
    public Soap(String t, double p) {
        super(t, p, "Shave > Soap");
    }
    
    /**
     * Soap constructor.
     */
    public Soap(String t) {
        super(t, -1, "Shave > Soap");
    }
    
}