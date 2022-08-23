package Clothes;

public class Tshirt extends ClothingItem {

    private String colour;
    private String neckline;

    private String stockImage;

    public Tshirt(String name, String colour, String neckline) {
        super(name);
        this.colour = colour;
        this.neckline = neckline;
    }

    public String addGraphic(String stockImage){
        return stockImage;
    }
}
