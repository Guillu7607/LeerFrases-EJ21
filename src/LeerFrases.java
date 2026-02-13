import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerFrases {
    public static void main(String[] args) {
        try {
            File archivo = new File("frases.txt");
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}
