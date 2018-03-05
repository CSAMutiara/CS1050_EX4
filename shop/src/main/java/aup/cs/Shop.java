package aup.cs.shop;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Shop class: super-class.
 */

public final class Shop {
    
    ProductList inventory;
    
    /**
     * main method.
     */
    public static void main(String[] args) {
        Shop myshop = new Shop();
        myshop.init();
        System.out.println(myshop.createFeed());
        System.out.println(myshop.createMenFeed());
        System.out.println(myshop.createWomenFeed());
    }
    
    /**
     * Shop constructor.
     */
    public Shop() {
        inventory = new ProductList();
    }
  
    /**
     * createFeed creates the feed of all products in shop.
     * @returns feed the String output
     */
    public String createFeed() {
        String ret = "";
        ret += this.createMenFeed() + this.createWomenFeed();
        return ret;
    }
    
    /**
     * createMenFeed creates the feed of shaving products.
     * @returns feed the String output
     */
    public String createMenFeed() {
        String ret = "Shaving Products\n";
        ArrayList<Product> feed = inventory.productList;
        ret += "ID\tTITLE\t\t\t\t\t\t\t\tPRICE\tCATEGORY\tMATERIAL/COLOR\n";
        for (int i = 0; i < feed.size(); i++) {
            if (feed.get(i) instanceof ShavingProduct) {
                ret += feed.get(i).toString() + "\n";
            }
        }
        return ret += "\n";
    }
    
    /**
     * createWomenFeed creates the feed of cosmetic products.
     * @returns feed the String output
     */
    public String createWomenFeed() {
        String ret = "Cosmetics Products\n";
        ArrayList<Product> feed = inventory.productList;
        ret += "ID\tTITLE\t\t\t\t\t\t\t\tPRICE\tCATEGORY\tCOLOR\n";
        for (int i = 0; i < feed.size(); i++) {
            if (feed.get(i) instanceof CosmeticProduct) {
                ret += feed.get(i).toString() + "\n";
            }    
        }
        return ret += "\n";
    }
    
    /**
     * init initializes inventory the productList.
     */
    public void init() {
        inventory.init();
    }
    
}