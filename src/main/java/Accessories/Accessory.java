package Accessories;

import Interfaces.ISell;

public class Accessory implements ISell {

    private String item;
    private double purchasePrice;
    private double salePrice;

    public Accessory(String item, double purchasePrice, double salePrice) {
        this.item = item;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getItem() {
        return item;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double calculateMarkup() {
        return (((getSalePrice() - getPurchasePrice())/getPurchasePrice()) * 100);
    }
}
