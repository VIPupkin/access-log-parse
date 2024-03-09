import java.io.File;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Main {
    public static void main(String[] args) {

        int cnt =1;
        while (true){
            System.out.println("Введите имя файла с полным путём:");
            String path=  new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory=file.isDirectory();
            if (!fileExists){
                System.out.println("Файл не существует.");
                continue;
            }
            if (isDirectory){
                System.out.println("Это не файл, а каталог.");
                continue;
            }
            {
                System.out.println("Путь указан верно.");
                System.out.println("Это файл номер "+cnt);
                cnt++;
            }
        }
    }
}
