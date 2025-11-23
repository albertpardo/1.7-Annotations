package level2ex1.model;

import level2ex1.annotation.PathToJsonSerializable;

@PathToJsonSerializable(directory = "src/main/java/level2ex1/resources/ObjectWithPrice.json")
public class ObjectWithStarsNumber {

    private String name;
    private int starsNumber;

    public ObjectWithStarsNumber(String name, int starsNumber){
        this.name = name;
        this.starsNumber = starsNumber;
    }

    public String getName(){
        return name;
    }

    public int getStarsNumber(){
        return starsNumber;
    }
}
