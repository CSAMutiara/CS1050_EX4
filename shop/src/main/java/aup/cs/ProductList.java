package aup.cs.shop;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * ProductList class: super-class.
 */

public final class ProductList {
    
    ArrayList<Product> productList;
    
    /**
     * ProductList constructor.
     */
    public ProductList() {
        productList = new ArrayList<Product>();
    }
  
    /**
     * init initializes inventory the ShavingProduct array.
     */
    public void init(ShavingProduct[] s, CosmeticProduct[] c) {
        for (int i = 0; i < s.length; i++) {
            productList.add(s[i]);
        }
        for (int j = 0; j < c.length; j++) {
            productList.add(c[j]);
        }
    }
    
}