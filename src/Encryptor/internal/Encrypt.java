package Encryptor.internal;

import java.util.Scanner;

public class Encrypt {

    public static void main () {


        StringBuilder encryptedmessage = new StringBuilder();



        Scanner tokenScanner = new Scanner(System.in);
        String token;
        System.out.print(variable.YELLOW + "Create token: ");
        token = String.valueOf(tokenScanner.nextInt());

        while (token.length() != 4) {
            System.out.println(variable.RED + "Token must be 4 digits.");
            System.out.print(variable.YELLOW + "Create token: ");
            token = String.valueOf(tokenScanner.nextInt());
        }

        encryptedmessage.append(token);
        encryptedmessage.append("#");

        int token1 = token.charAt(0);
        int token2 = token.charAt(1);
        int token3 = token.charAt(2);
        int token4 = token.charAt(3);

        Scanner unencryptedmessage = new Scanner(System.in);
        System.out.print(variable.YELLOW + "Enter message: ");
        String unencryptedmessage2 = unencryptedmessage.nextLine();
        System.out.println(variable.YELLOW + "Encrypting message...");
        System.out.println(variable.YELLOW + "Attempting to display message...\n");


        while (variable.i <= unencryptedmessage2.length() - 1) {
            char o = unencryptedmessage2.charAt(variable.i);
            int p = (((((o * token1) * token3) + token4) - token2) - 10);
            encryptedmessage.append(p);


            if (((variable.i + 1) <= unencryptedmessage2.length() - 1)) {
                encryptedmessage.append("-");
            }

            variable.i++;
        }

            System.out.println(variable.GRAY + "Encrypted message: " + variable.CYAN + encryptedmessage);

            System.out.println(variable.GREEN + "\n\nMessage successfully encrypted.");
            System.out.print(variable.GREEN + "Exiting EncryptCode...");


    }
}
