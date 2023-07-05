package com.trigyn.instrumentService.model;

public class Instrument {

    private String itemName;
    private int itemPrice;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
