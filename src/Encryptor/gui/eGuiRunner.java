package Encryptor.gui;

import java.util.regex.Pattern;

/** Encrypt GUI runner */
public class eGuiRunner {

    public static void main () {

        String Encrypted = encrypt.ShowGUI();

        if (Encrypted == null || Encrypted.equals("")) {
            System.out.println("no");
        } else {
            result.ShowGUI(Encrypted);
        }


    }


}
