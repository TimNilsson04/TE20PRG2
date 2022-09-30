import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

    class Model {

        public static void main(String[] args) throws IOException {

            String message = "";
            int m;
            int k = '(';
            String crypt = "";
            String hex = "";
            String result = new String();

          /*  int Answer = JOptionPane.showConfirmDialog(null,"Vill du krypteria informationen från minfil.txt?");

            if(Answer == 1) {
                message = JOptionPane.showInputDialog("Skriv din info här:");
            }

*/
            int key = JOptionPane.showConfirmDialog(null,"Vill du välja nyckeln?");

            if (key == 0){
                int k = JOptionPane.showInputDialog("Skriv här?");
            }

            FileReader file = new FileReader("minfil.txt");


            BufferedReader bufferedreader = new BufferedReader(file);
            String line = "";
            Scanner scanner = new Scanner(bufferedreader);

        //    if(Answer != 1) {
                while (scanner.hasNextLine()) {
                    //System.out.println(scanner.nextLine());
                    message = message + scanner.nextLine();
                }
        //    }

            bufferedreader.close();
            System.out.println(message);


            for (int i = 0; i < message.length(); i++) {
                m = message.charAt(i);
                hex = Integer.toHexString(encrypt(k,m));
                crypt += hex;
            }

            char[] charArray = crypt.toCharArray();
            for(int i = 0; i < charArray.length; i=i+2) {
                String st = ""+charArray[i]+""+charArray[i+1];
                char ch = (char)Integer.parseInt(st, 16);
                result = result + ch;
            }


            System.out.println(crypt);
            System.out.println(result);
        }

        private static int encrypt(int m, int k) {
            return (m ^ k);
        }
    }

