package org.launchcode.java.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu(){
        this.lastUpdated = new Date();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    //1. Add or Remove Menu Item Method
    public void addMenuItem(MenuItem item) {
        this.menuItems.add(item);
        this.lastUpdated = new Date();
    }
    public void removeMenuItem(MenuItem item) {
        this.menuItems.remove(item);
        this.lastUpdated = new Date();
    }
//    //3. Print Out Menu
    @Override
    public String toString() {
        String returnString = "";
        for (MenuItem item : this.menuItems){
            returnString += item.toString() + "\n";
        }
        return returnString;
    }
}
