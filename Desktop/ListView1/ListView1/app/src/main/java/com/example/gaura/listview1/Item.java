package com.example.gaura.listview1;

/**
 * Created by gaura on 3/25/2017.
 */

public class Item {
    private String details;
    private String name;
    private int price;

    public Item() {

    }

    public Item(String i, String d, int p) {
        this.details = d;
        this.name = i;
        this.price = p;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}