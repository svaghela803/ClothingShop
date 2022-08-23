package Clothes;

public class Tshirt extends ClothingItem {


    private String colour;
    private String neckline;

    private String stockImage;

    public Tshirt(String colour, String neckline) {
        super(colour);
        this.colour = colour;
        this.neckline = neckline;
    }

//    getters and setters



//method to add image to tshirt
    public String addGraphic(String stockImage){
        return stockImage;
    }
}
