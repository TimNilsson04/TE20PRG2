import javax.swing.*;

public class Kryptering {
    public static void main(String[] args) {
        String Mess = JOptionPane.showInputDialog("Skriv ditt meddelande här.");

        String crypt = "";

        for (int i = 0; i<Mess.length(); i++) {

            char mess = Mess.charAt(i);
            char key = '(';
            crypt +=  (char) (mess ^ key);


        }
        System.out.println(crypt);
    }
}

