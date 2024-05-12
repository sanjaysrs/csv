import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader2 {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(System.getProperty("user.dir") + "/resources/employees.csv");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String record;
        while ((record=bufferedReader.readLine())!=null) {
            String[] data = record.split(",");
            for (String str : data) {
                System.out.print(str + '\t');
            }
            System.out.println();
        }

        bufferedReader.close();
        fileReader.close();
    }
}
