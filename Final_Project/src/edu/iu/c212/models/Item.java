package edu.iu.c212.models;

import java.text.DecimalFormat;

public class Item {
    private String name;
    private double price;
    private int quantity;
    private int aisleNum;

    public Item(String name, double price, int quantity, int aisleNum){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.aisleNum = aisleNum;
    }

    private static String getDoubleString(double number) {
        String numberStr;
        if (((int) number * 1000) == (int) (number * 1000)) {
            numberStr = String.valueOf((int) number);
        } else {
            DecimalFormat df = new DecimalFormat("######0.00");
            numberStr = df.format(number);
        }
        return numberStr;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getAisleNum() {
        return aisleNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAisleNum(int aisleNum) {
        this.aisleNum = aisleNum;
    }

    public String toString(){
        return "'"+this.name+"',"+getDoubleString(this.price)+","+this.quantity+","+this.aisleNum;
    }
}
