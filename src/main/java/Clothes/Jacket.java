package Clothes;

public class Jacket extends ClothingItem {

    public Jacket(String name) {
        super(name);
    }

    boolean hood;
    String fastening;

//constructor

    public Jacket(boolean hood, String fastening) {
        super(fastening);
        this.hood = hood;
        this.fastening = fastening;
    }

//    getters and setters

    public boolean gethood() {
        return hood;
    }
    public void sethood (boolean hood) {
        this.hood = hood;
    }

    public String getFastening() {
        return fastening;
    }

    public void setFastening (String fastening) {
        this.fastening = fastening;
    }

    }

