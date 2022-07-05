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

        Scanner scanner = new Scanner(text);
        String NotEncryptedMessage = scanner.nextLine();


        while (variable.i <= NotEncryptedMessage.length() - 1) {
            char o = NotEncryptedMessage.charAt(variable.i);
            int p = (((((o * token1) * token3) + token4) - token2) - 10);
            encryptedmessage.append(p);


            if (((variable.i + 1) <= NotEncryptedMessage.length() - 1)) {
                encryptedmessage.append("-");
            }

            variable.i++;
        }


        return encryptedmessage.toString();
    }


    private Encryptor () {}
}
