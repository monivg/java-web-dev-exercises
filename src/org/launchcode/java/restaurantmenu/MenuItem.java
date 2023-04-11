package org.launchcode.java.restaurantmenu;

import java.util.Date;

public class MenuItem {
    // first declare fields
    private String name;

    private boolean newMenuItem = true;
    private String description;
    private double price;
    private String category;
    private Date dateAdded;


    // second constructors
    public MenuItem(String name, boolean newMenuItem, String description, double price, String category) {
        this.name = name;
        this.newMenuItem = newMenuItem;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date ();
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

    public Date getDateAdded() {

        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {

        this.dateAdded = dateAdded;
    }

    //4th add methods

    //2. New Item Method
    public void notNewItem(){
        newMenuItem = false;
        System.out.println(this.name);
    }
    public void newItem(){
        newMenuItem = true;
        System.out.println(this.name + "New");
    }

    //4. Print Out Single Menu Item or Full Menu Item
    //5. Determine if two menu items are equal

}
