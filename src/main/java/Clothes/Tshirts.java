package Clothes;

public class Tshirts extends ClothesShop {

    private String colour;
    private String neckline;

    public Tshirts(String name, String colour, String neckline) {
        super(name);
        this.colour = colour;
        this.neckline = neckline;
    }
}
