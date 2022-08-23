package Clothes;

public class Trouser extends ClothingItem {

    private String fastening;
    private double legLength;
    private double cutAmount;

//constructor
    public Trouser(String name) {
        super(name);
        this.legLength = legLength;
        this.cutAmount = cutAmount;
    }

//    getters and setters

    public double getLegLength() {
        return legLength;
    }

    public void setLegLength (double legLength) {
        this.legLength = legLength;
    }

    public double getCutAmount() {
        return cutAmount;
    }

    public void setCutAmount (double cutAmount) {
        this.cutAmount = cutAmount;
    }


    //    method to calculate hemming (length of trousers minus amount to be cut)
    public void hemming(){
        double hemming;
        hemming = legLength - cutAmount;
        return;
    }
    

}
