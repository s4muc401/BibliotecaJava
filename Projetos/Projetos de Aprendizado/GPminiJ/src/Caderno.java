import java.util.Objects;
import java.util.Scanner;

public class Caderno {
    public void Anotacao() {
        Scanner line = new Scanner(System.in);
        String lineOfBook = "";

        System.out.println("\nCADERNO\n");

        while (!lineOfBook.equalsIgnoreCase("FIM")) {
            lineOfBook = line.nextLine();
        }
    }
}
