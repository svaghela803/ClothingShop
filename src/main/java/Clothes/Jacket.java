package Clothes;

public class Jacket extends ClothingItem {

    public Jacket(String name) {
        super(name, stock);
    }

    boolean hood;
    String fastening;

//constructor

    public Jacket(boolean hood, String fastening) {
        super(fastening, stock);
        this.hood = hood;
        this.fastening = fastening;
    }

//    getters and setters

    public boolean getHood() {
        return hood;
    }
    public void setHood (boolean hood) {
        this.hood = hood;
    }

    public String getFastening() {
        return fastening;
    }

    public void setFastening (String fastening) {
        this.fastening = fastening;
    }

//    method to add waterproofing
    public void addWaterproofing(){
        return;
    }

    }

