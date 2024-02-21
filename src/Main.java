import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = null;
        FileWriter fileWrite = new FileWriter("sum.txt");
        in = new FileInputStream("sonlar.txt");
        Scanner scanner = new Scanner(in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = a + b;

//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(a + b);
            fileWrite.write(""+ sum);

        }
        fileWrite.close();


    }
}
