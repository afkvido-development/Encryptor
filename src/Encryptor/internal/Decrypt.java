/**

yo



 **/

package Encryptor.internal;

import java.util.Scanner;

public class Decrypt {
    public static void main() {
        Scanner codeQ = new Scanner(System.in);
        int codeQ2;
        char codeQ3;
        String codeQ4 = "1";
        System.out.print(variable.YELLOW + "Enter token: ");
        codeQ2 = codeQ.nextInt();
        codeQ4 = String.valueOf(codeQ2);

        while (codeQ4.length() != 4) {
            System.out.println(variable.RED + "Invalid token");
            System.out.print(variable.YELLOW + "Enter token: ");
            codeQ2 = codeQ.nextInt();
            codeQ4 = String.valueOf(codeQ2);


        }
        int tokenQ1 = codeQ4.charAt(0);
        int tokenQ2 = codeQ4.charAt(1);
        int tokenQ3 = codeQ4.charAt(2);
        int tokenQ4 = codeQ4.charAt(3);
        int frag = 5;
        String frag3 = "";
        while (frag != 0) {
            Scanner fragment = new Scanner(System.in);
            System.out.print(variable.YELLOW + "Enter one fragment, when done type 0: ");
            frag = fragment.nextInt();
            int frag1 = (((((frag + 10) + tokenQ2) - tokenQ4) / tokenQ3) / tokenQ1);
            char frag2 = (char)frag1;
            frag3 = frag3 + frag2;
        }
        System.out.println("\n\n" + variable.CYAN + frag3 + " \n");
        System.out.println(variable.GREEN + "Message successfully decrypted.");
    }
}
