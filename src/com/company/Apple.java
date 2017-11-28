package com.demo.enums;

/**
 * Created by Nabeel on 12/17/2016.
 */
public enum Apple {

    Jonatan(10,"Nabeel",500), Golden(10,"Nabeel",500);
    private int id;
    private String name;
    private int price;

    Apple(int id,String name, int price){
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }




}
