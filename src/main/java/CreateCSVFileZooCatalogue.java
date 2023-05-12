import java.io.FileWriter;
import java.io.IOException;

public class CreateCSVFileZooCatalogue {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Animal").append(",").append("Name").append("\n");
        stringBuilder.append("Lion").append(",").append("Alex").append("\n");
        stringBuilder.append("Coyote").append(",").append("Vin").append("\n");
        stringBuilder.append("Penguin").append(",").append("Ola").append("\n");
        stringBuilder.append("Bear").append(",").append("Zen").append("\n");
        stringBuilder.append("Zebra").append(",").append("Eva").append("\n");
        try (FileWriter writer = new FileWriter("zooData.csv")) {
            writer.write(stringBuilder.toString());
            System.out.println("CSV file created.");
        }
    }
}
