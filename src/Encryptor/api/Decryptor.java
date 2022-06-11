package Encryptor.api;

import java.util.Scanner;

public final class Decryptor {

    public static String decrypt (String toDecrypt) {


        Scanner fragment = new Scanner(toDecrypt);
        fragment.useDelimiter("\\Z");


        String PastedMessage = fragment.nextLine();

        Scanner tokenScanner = new Scanner(PastedMessage);
        tokenScanner.useDelimiter("#");
        String token = tokenScanner.next();



        int tokenQ1 = token.charAt(0);
        int tokenQ2 = token.charAt(1);
        int tokenQ3 = token.charAt(2);
        int tokenQ4 = token.charAt(3);

        int frag;
        StringBuilder Decrypted = new StringBuilder();



        Scanner fragmentScanner = new Scanner(PastedMessage.substring(token.length() + 1, PastedMessage.length()));
        fragmentScanner.useDelimiter("-");


        while (fragmentScanner.hasNext()) {
            frag = fragmentScanner.nextInt();
            int frag1 = (((((frag + 10) + tokenQ2) - tokenQ4) / tokenQ3) / tokenQ1);
            char frag2 = (char)frag1;
            Decrypted.append(frag2);
        }



        return Decrypted.toString();
    }

}
