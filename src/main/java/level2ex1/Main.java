package level2ex1;

import level2ex1.manager.JsonWriter;
import level2ex1.model.ObjectWithStarsNumber;

import java.util.ArrayList;

public class Main{
    public static void main(String [] args){

        ArrayList<ObjectWithStarsNumber> objectList = new ArrayList<>();
        objectList.add(new ObjectWithStarsNumber("carOne", 5));
        objectList.add(new ObjectWithStarsNumber("camelOne", 7));
        objectList.add(new ObjectWithStarsNumber("bookOne", 2));

        JsonWriter.saveJson(objectList);
    }
}
