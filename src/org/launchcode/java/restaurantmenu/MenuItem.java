package org.launchcode.java.restaurantmenu;

import java.time.LocalDate;
import java.util.Date;

public class MenuItem {
    // first declare fields
    private String name;
    private String description;
    private Double price;
    private String category;
    private boolean isNew;


    // 2 constructors
    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = "Not Category";
        this.isNew = false;
    }

    public MenuItem(String name, String description, double price, String category, boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    // create getter/setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void  setIsNew() {
        this.isNew = isNew;
    }

    //4th add methods

    @Override
    public String toString() {
        String returnMenuItem = "";
        returnMenuItem += "Item Name:" + this.name + "\n";
        returnMenuItem += "Description:" + this.description + "\n";
        returnMenuItem += "Price:" + this.price + "\n";
        returnMenuItem += "Category:" + this.category + "\n";
        returnMenuItem += "Item is new:" + this.isNew + "\n";

        return returnMenuItem;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return  true;
        if (!(obj instanceof MenuItem)){
            return false;
        }
        MenuItem menuItem = (MenuItem) obj;
        if (menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)
                && menuItem.price.equals(this.price)
                && menuItem.category.equals(this.category))
            return true;
        else return false;

    }

}
