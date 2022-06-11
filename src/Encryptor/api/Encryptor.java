package Encryptor.api;

import Encryptor.internal.variable;

import java.util.Scanner;

public final class Encryptor {

    public static String encrypt (String token, String text) {

        StringBuilder encryptedmessage = new StringBuilder();

        Scanner tokenScanner = new Scanner(token);


        token = String.valueOf(tokenScanner.nextInt());


        encryptedmessage.append(token);
        encryptedmessage.append("#");

        int token1 = token.charAt(0);
        int token2 = token.charAt(1);
        int token3 = token.charAt(2);
        int token4 = token.charAt(3);

        Scanner unencryptedmessage = new Scanner(text);
        String unencryptedmessage2 = unencryptedmessage.nextLine();


        while (variable.i <= unencryptedmessage2.length() - 1) {
            char o = unencryptedmessage2.charAt(variable.i);
            int p = (((((o * token1) * token3) + token4) - token2) - 10);
            encryptedmessage.append(p);


            if (((variable.i + 1) <= unencryptedmessage2.length() - 1)) {
                encryptedmessage.append("-");
            }

            variable.i++;
        }


        return encryptedmessage.toString();
    }


    private Encryptor () { }
}
