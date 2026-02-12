import java.io.File;

public class Main {
    public static void main(String[] args) {
// Относительный путь — от текущей рабочей директории проекта
        File file1 = new File("data.txt");

// Относительный путь с подпапкой
        File file2 = new File("reports/monthly.pdf");

// Абсолютный путь — от корня файловой системы
        File file3 = new File("C:\\Users\\Alex\\Documents\\notes.txt");  // Windows
        File file4 = new File("/home/alex/documents/notes.txt");         // Linux/macOS
    }
}
