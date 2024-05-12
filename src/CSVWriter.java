import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter(System.getProperty("user.dir") + "/resources/employees.csv");

        fileWriter.append("id,first_name,last_name,doj\n");
        fileWriter.append("1,John,Doe,12-05-2024\n");
        fileWriter.append("2,Mary,Jane,13-05-2024\n");
        fileWriter.append("3,Peter,Pan,14-05-2024\n");

        fileWriter.close();
    }
}
