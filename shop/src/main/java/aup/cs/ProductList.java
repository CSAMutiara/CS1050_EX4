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
    public void init() {
        productList.add(new PreShave("Truefitt & Hill No.10 Cleansing Scrub",
            10.00));
        productList.add(new PreShave("Taylor of Old Bond Street Sandalwood "
            + "Pre-Shave Oil", 12.95));
        productList.add(new Cream("Truefitt & Hill West Indian Limes Shaving "
            + "Cream Bowl", 17.00));
        productList.add(new Cream("Castle Forbes 1445 Shaving Cream", 22.50));
        productList.add(new Soap("RazoRock Blue Barbershop Shaving Soap Stick",
            6.95));
        productList.add(new Soap("RazoRock “/What the Puck”/ Orange Sunrise "
            + "Shaving Soap", 8.95));
        productList.add(new Razor("Kai Captain Standard Razor", 95.00));
        productList.add(new Razor("Muhle Travel 3-Blade Cartridge Razor",
            32.50));
        productList.add(new Brush("Semogue 820 Boar Hair Shaving Brush – Red",
            16.95, "Boar Hair"));
        productList.add(new Brush("RazoRock Plissoft Synthetic Shaving Brush",
            17.50, "Synthetic"));
        productList.add(new PostShave("Pinaud Clubman Brandy Spice After Shave",
            12.50));
        productList.add(new PostShave("Musgo Real Spiced Citrus Cologne",
            45.00));
            
        productList.add(new Lipstick("Rouge Vertige Lipstick Satiny",
            10.80, "Light Mauve"));
        productList.add(new Lipstick("Grand Rouge Lipstick Satiny",
            12.00, "Splendid Pink"));
        productList.add(new Foundation("Moisturing Nude Foundation", 18.00));
        productList.add(new Foundation("Comfort Cream Foundation", 22.50));
        productList.add(new Mascara("360 Volume Mascara", 9.00));
        productList.add(new Mascara("Vertigo Length Mascara", 12.00));
    }
    
}