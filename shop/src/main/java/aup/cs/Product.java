package aup.cs.shop;

import java.util.Arrays;

/**
 * Product: Super-Super Class.
 */

public class Product {
    
    private static int runningID = 0;
    private int id;
    private String title;
    private double price;
    private String category;
    
    /**
     * ShavingProduct constructor.
     */
    public Product(String t, double p, String c) {
        this.title = t;
        this.price = p;
        this.category = c;
        this.id = runningID;
        runningID += 1;
    }
    
    /**
     * returns this' private variables as Strings.
     */
    public String toString() {
        return String.format("%s%60s%15s%15s",
            this.id, this.title, this.price, this.category);
    }
}