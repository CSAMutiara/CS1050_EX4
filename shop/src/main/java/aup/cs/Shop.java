package aup.cs.shop;

import java.util.Arrays;

/**
 * Shop class: super-class.
 */

public final class Shop {
    
    ProductList inventory;
    ShavingProduct[] ShavingInventory;
    CosmeticProduct[] CosmeticInventory;
    
    /**
     * main method.
     */
    public static void main(String[] args) {
        Shop myshop = new Shop();
        myshop.init();
        System.out.println(myshop.createMenFeed());
        System.out.println(myshop.createWomenFeed());
    }
    
    /**
     * Shop constructor.
     */
    public Shop() {
        inventory = new ProductList();
        ShavingInventory = new ShavingProduct[12];
        CosmeticInventory = new CosmeticProduct[6];
    }
  
    /**
     * createFeed creates the feed.
     */
    public String createMenFeed() {
        String ret = "";
        ret += "ID\tTITLE\t\t\t\t\t\t\t\tPRICE\tCATEGORY\tMATERIAL/COLOR\n";
        for (int i = 0; i < this.inventory.size(); i++) {
            ret += this.inventory.get(i).toString() + "\n";
        }
        return ret;
    }
    
    /**
     * createFeed creates the feed.
     */
    public String createWomenFeed() {
        String ret = "";
        ret += "ID\tTITLE\t\t\t\t\t\t\t\tPRICE\tCATEGORY\tCOLOR\n";
        for (int i = 0; i < this.CosmeticInventory.length; i++) {
            ret += this.CosmeticInventory[i].toString() + "\n";
        }
        return ret;
    }
    
    /**
     * init initializes inventory the productList.
     */
    public void init() {
        ShavingInventory[0] = new PreShave("Truefitt & Hill No.10 Cleansing Scrub",
            10.00);
        ShavingInventory[1] = new PreShave("Taylor of Old Bond Street Sandalwood "
            + "Pre-Shave Oil", 12.95);
        ShavingInventory[2] = new Cream("Truefitt & Hill West Indian Limes Shaving "
            + "Cream Bowl", 17.00);
        ShavingInventory[3] = new Cream("Castle Forbes 1445 Shaving Cream", 22.50);
        ShavingInventory[4] = new Soap("RazoRock Blue Barbershop Shaving Soap Stick",
            6.95);
        ShavingInventory[5] = new Soap("RazoRock “/What the Puck”/ Orange Sunrise "
            + "Shaving Soap", 8.95);
        ShavingInventory[6] = new Razor("Kai Captain Standard Razor", 95.00);
        ShavingInventory[7] = new Razor("Muhle Travel 3-Blade Cartridge Razor", 32.50);
        ShavingInventory[8] = new Brush("Semogue 820 Boar Hair Shaving Brush – Red",
            16.95, "Boar Hair");
        ShavingInventory[9] = new Brush("RazoRock Plissoft Synthetic Shaving Brush",
            17.50, "Synthetic");
        ShavingInventory[10] = new PostShave("Pinaud Clubman Brandy Spice After Shave",
            12.50);
        ShavingInventory[11] = new PostShave("Musgo Real Spiced Citrus Cologne",
            45.00);
            
        CosmeticInventory[0] = new Lipstick("Rouge Vertige Lipstick Satiny",
            10.80, "Light Mauve");
        CosmeticInventory[1] = new Lipstick("Grand Rouge Lipstick Satiny",
            12.00, "Splendid Pink");
        CosmeticInventory[2] = new Foundation("Moisturing Nude Foundation",
            18.00);
        CosmeticInventory[3] = new Foundation("Comfort Cream Foundation",
            22.50);
        CosmeticInventory[4] = new Mascara("360 Volume Mascara", 9.00);
        CosmeticInventory[5] = new Mascara("Vertigo Length Mascara", 12.00);
        inventory.init(ShavingInventory, CosmeticInventory);
    }
    
}