package org.launchcode.java.restaurantmenu;

public class Restaurant {
    public static void main(String[] args){
        MenuItem entree1 = new MenuItem("Carne Asada Tacos","Steak with corn tortilla",3.50, "Entree",true);
        MenuItem item1 = new MenuItem("Carne Asada Tacos","Steak with corn tortilla",3.50, "Entree",true);
        MenuItem entree2 = new MenuItem("Enchiladas","Savory filled tortilla ",5.50, "Entree",true);

        Menu newMenu = new Menu();
        newMenu.addMenuItem(entree1);
        newMenu.addMenuItem(entree2);
        newMenu.addMenuItem(item1);

        //remove an item
        newMenu.removeMenuItem(item1);

        // print menu with all items
        System.out.println(newMenu.toString());

        //print one item
//        System.out.println(entree2.toString());


//        //test toString method
//        System.out.println(entree1.toString());
//
//        // comparing items
//        System.out.println(entree1.equals(entree2));

    }
}
