package Clothes;

public abstract class ClothingItem {

    private String name;
    private String season;

//    constructor
    public ClothingItem(String name){
        this.name = name;
        this.season = season;
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
}
