import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

    public class Filhantering {

        public static void main(String[] args) throws IOException {
            String message = "";
            int m;
            int k = '(';
            String krypt = "";


            FileReader file = new FileReader("minfil.txt");

            BufferedReader bufferedreader = new BufferedReader(file);
            String line = "";
            Scanner scanner = new Scanner(bufferedreader);

            while (scanner.hasNextLine()) {
                //System.out.println(scanner.nextLine());
                message = message + scanner.nextLine();
            }
            bufferedreader.close();
            System.out.println(message);

            for (int i = 0; i < message.length(); i++) {
                m = message.charAt(i);
                krypt += encrypt(m, k);
            }
            System.out.println(krypt);
        }

        private static int encrypt(int m, int k) {
            int c = m ^ k;
            return c;
        }
    }




