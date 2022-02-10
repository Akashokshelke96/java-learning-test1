import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Bc");
        InputStreamReader cin = null;
        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter Character Q to quit");
            char c;
            do {
                c = (char) cin.read();
                System.out.println(c);
            } while (c != 'q');
        } finally {
            if (cin != null) {
                cin.close();
                System.out.println("You have Exited");
            }
        }
    }
}
