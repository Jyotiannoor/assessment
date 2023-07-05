package com.trigyn.paymentService.model;

public class Payment {

    public String itemName;
    public int itemPrice;

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
        return "Payment{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
