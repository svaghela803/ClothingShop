package Clothes;

import java.util.ArrayList;

public abstract class ClothingItem {

    private String name;
    private String season;
    private String material;
    private int size;
    private double sellPrice;

    private double cost;

    private ArrayList<ClothingItem> stock;


//    constructor
    public ClothingItem(String name, String season, String material, double sellPrice, int size, double cost){
        this.cost = cost;
        this.name = name;
        this.season = season;
        this.material = material;
        this.sellPrice = sellPrice;
        this.size = size;
    }

    public ClothingItem(String colour) {
    }

    //    method to count stock
    public int stock(){
    return this.stock.size();
}

//calculate margin
public double calculateMargin(){
    double margin = this.sellPrice - this.cost;
    return margin;
}



    //    getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeason(){
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.season = season;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getSellPrice() {
         return sellPrice;
    }

    public void setSellPrice(double sellPrice){
        this.sellPrice = sellPrice;
    }

    public ArrayList<ClothingItem> getStock() {
        return stock;
    }

    public void setCustomerArtwork(ArrayList<ClothingItem> stock) {
        this.stock = stock;
    }


}
