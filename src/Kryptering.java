import javax.swing.*;

public class Kryptering {
    public static void main(String[] args) {

        System.out.println(krypto());


    }

    static String krypto(){

        String Mess = JOptionPane.showInputDialog("Skriv ditt meddelande här.");

        String crypt = "";

        String hex = null;

        for (int i = 0; i < Mess.length(); i++) {

            char mess = Mess.charAt(i);
            int key;
            hex = Integer.toHexString(mess);
            if(Mess.length()<10){
                key = 10;
            }
            else{
                key = 10*Mess.length();
            }

            crypt += (char) (mess ^ key);

        }
        System.out.println(hex);
        return crypt;
    }



}