import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileInput implements InputStrategy {
    @Override
    public int getNumber() {
        try {
            String content = new String(Files.readAllBytes(Paths.get("NS.txt")));
            return
                    Integer.parseInt(content.trim());
        } catch (IOException | NumberFormatException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return -1;
        }
    }
}
