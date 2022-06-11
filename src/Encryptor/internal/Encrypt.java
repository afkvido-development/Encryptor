package Encryptor.internal;

import Encryptor.api.Encryptor;

import java.util.Scanner;

public class Encrypt {

    public static void main () {



        Scanner tokenScanner = new Scanner(System.in);
        String token;
        System.out.print(variable.YELLOW + "Create token: ");
        token = String.valueOf(tokenScanner.nextInt());

        while (token.length() != 4) {
            System.out.println(variable.RED + "Token must be 4 digits.");
            System.out.print(variable.YELLOW + "Create token: ");
            token = String.valueOf(tokenScanner.nextInt());
        }



        Scanner MsgScanner = new Scanner(System.in);
        System.out.print(variable.YELLOW + "Enter message: ");
        String NonEncrypted = MsgScanner.nextLine();
        System.out.println(variable.YELLOW + "Encrypting message...");
        System.out.println(variable.YELLOW + "Attempting to display message...\n");

        String encryptedmessage = Encryptor.encrypt(token, NonEncrypted);


        System.out.println(variable.GRAY + "Encrypted message: " + variable.CYAN + encryptedmessage);

        System.out.println(variable.GREEN + "\n\nMessage successfully encrypted.");
        System.out.print(variable.GREEN + "Exiting EncryptCode...");
    }
}
