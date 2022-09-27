package Clothes;

public class Jacket extends ClothingItem {


    boolean hood;
    String fastening;

    private boolean waterproof;

//constructor


    public Jacket(String name, String season, String material, double sellPrice, int size, double cost) {
        super(name, season, material, sellPrice, size, cost);
        this.hood = hood;
        this.fastening = fastening;
        this.waterproof = false;
    }

    //methods
    public void addWaterproofing() {
        setWaterproof(true);
    }

//    getters and setters

    public boolean getHood() {
        return hood;
    }

    public void setHood(boolean hood) {
        this.hood = hood;
    }

    public String getFastening() {
        return fastening;
    }

    public void setFastening(String fastening) {
        this.fastening = fastening;
    }

    public boolean isHood() {
        return hood;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }
}


