package com.meetOzan.Entities;

public class Games {
    

    private int id;
    private String gameName;
    private double price;
    private double priceAfterDiscount;


    public Games() {
        this.id = id;
        this.gameName = gameName;
        this.price = price;
        this.priceAfterDiscount = priceAfterDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }


    public void priceAfterDiscount() {
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceAfterDiscount() {
        return priceAfterDiscount;
    }

    public void setPriceAfterDiscount(double priceAfterDiscount) {
        this.priceAfterDiscount = priceAfterDiscount;
    }
}
