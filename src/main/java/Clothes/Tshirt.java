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
public String getColour() {
    return colour;
}

    public void setColour (String colour) {
        this.colour = colour;
    }

    public String getNeckline() {
        return neckline;
    }

    public void setNeckline(String neckline) {
        this.neckline = neckline;
    }

    public String getStockImage() {
        return stockImage;
    }

    public void setStockImage(String stockImage) {
        this.stockImage = stockImage;
    }


//method to add image to tshirt
    public String addGraphic(String stockImage){
        return stockImage;
    }
}
