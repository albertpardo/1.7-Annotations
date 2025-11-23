package level2ex1.manager;

import com.fasterxml.jackson.databind.ObjectMapper;
import level2ex1.annotation.PathToJsonSerializable;
import level2ex1.model.ObjectWithStarsNumber;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class JsonWriter {

    public static void saveJson(ArrayList<ObjectWithStarsNumber> objects){

        PathToJsonSerializable myannotationPathToJsonSerializable = ObjectWithStarsNumber.class.getAnnotation(PathToJsonSerializable.class);
        String directory = myannotationPathToJsonSerializable.directory();
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(directory), objects);
            System.out.println("A file has been created at: " + directory);
        } catch (IOException e) {
            throw new RuntimeException("Error writing Json file." + e.getMessage());
        }
    }
}
