package Clothes;

public class Trouser extends ClothingItem {

    private String fastening;
    private double legLength;

//constructor
    public Trouser(String name) {
        super(name);
        this.legLength = legLength;
    }

//    getters and setters

    public double getLegLength() {
        return legLength;
    }

    public void setColour (double legLength) {
        this.legLength = legLength;
    }

//    method

}
