package org.launchcode.java.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<String> menuItems = new ArrayList<String>();
    private Date lastUpdated;


    //1. Add or Remove Menu Item Method
    public void addMenuItem(String addNewItem, boolean b, String s) {
        menuItems.add(addNewItem);
    }
    public void removeMenuItem(String removeItem) {
        menuItems.remove(removeItem);
    }
    //3. Last Updated
    public void printLastUpdated(){
        System.out.println(lastUpdated);
    }

}
