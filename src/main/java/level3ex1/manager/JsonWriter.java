package level3ex1.manager;

import com.fasterxml.jackson.databind.ObjectMapper;
import level3ex1.annotation.PathToJsonSerializable;
import level3ex1.model.ObjectWithStarsNumber;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
public class JsonWriter {
/*
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
 */
    public static void saveJson(ArrayList<ObjectWithStarsNumber> objects){

        // =========================================================
        //      REFLEXIÓN EXPLÍCITA SOBRE LA ANOTACIÓN
        // =========================================================
        Class<?> clazz = ObjectWithStarsNumber.class;

        System.out.println("\n=== INSPECCIÓN CON REFLECTION ===");

        // 1. Listar todas las anotaciones presentes
        System.out.println("Anotaciones presentes en " + clazz.getSimpleName() + ":");
        for (Annotation annotation : clazz.getAnnotations()) {
            System.out.println("  → " + annotation);
        }

        // 2. Comprobar si tiene tu anotación
        if (!clazz.isAnnotationPresent(PathToJsonSerializable.class)) {
            throw new RuntimeException("La clase NO tiene la anotación PathToJsonSerializable.");
        }

        // 3. Obtener la anotación
        PathToJsonSerializable annotation = clazz.getAnnotation(PathToJsonSerializable.class);

        // 4. Leer el valor del atributo "directory"
        String directory = annotation.directory();
        System.out.println("Valor leído desde la anotación (directory): " + directory);
        System.out.println("=======================================\n");

        // =========================================================
        //      GUARDAR EL JSON EN EL DIRECTORIO DE LA ANOTACIÓN
        // =========================================================
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(directory), objects);
            System.out.println("Archivo JSON generado en: " + directory);
        } catch (IOException e) {
            throw new RuntimeException("Error writing Json file: " + e.getMessage());
        }
    }
}
