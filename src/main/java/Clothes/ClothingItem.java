package Clothes;

public abstract class ClothingItem {

    private String name;
    private String season;
    private String material;
    private int size;
    private double sellPrice;


//    constructor
    public ClothingItem(String name){
        this.name = name;
        this.season = season;
        this.material = material;
        this.sellPrice = sellPrice;
        this.size = size;
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



}
