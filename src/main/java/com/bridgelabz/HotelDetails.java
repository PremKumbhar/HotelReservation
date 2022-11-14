package com.bridgelabz;

public class HotelDetails {
    private String name;
    private int price;

    public HotelDetails() {
    }

    public HotelDetails(String name, int price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "HotelDetails{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
