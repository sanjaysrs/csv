import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader1 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File(System.getProperty("user.dir") + "/resources/employees.csv");

        Scanner scanner = new Scanner(file);

//        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            String[] data = scanner.next().split(",");
            for (String str : data) {
                System.out.print(str + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
