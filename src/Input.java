import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Input {
    // Variable to store the content of the file
    private final String content;

    // Constructor that reads the file content from the given file path
    public Input(String filePath) throws IOException {
        // Read all bytes from the file and convert them to a string
        content = new String(Files.readAllBytes(Paths.get(filePath)));
    }

    // Method to get the content of the file
    public String getContent() {
        return content;
    }
}
