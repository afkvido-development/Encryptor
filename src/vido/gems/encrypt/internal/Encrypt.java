package vido.gems.encrypt.internal;
import java.util.Scanner;

public class Encrypt {

    public static void main() {
        Scanner code = new Scanner(System.in);
        int code2;
        char code3;
        String code4 = "1";
        System.out.print(variable.YELLOW + "Create token: ");
        code2 = code.nextInt();
        code4 = String.valueOf(code2);

        while (code4.length() != 4) {
            System.out.println(variable.RED + "Token must be 4 digits.");
            System.out.print(variable.YELLOW + "Create token: ");
            code2 = code.nextInt();
            code4 = String.valueOf(code2);


        }

        int token1 = code4.charAt(0);
        int token2 = code4.charAt(1);
        int token3 = code4.charAt(2);
        int token4 = code4.charAt(3);
        Scanner unencryptedmessage = new Scanner(System.in);
        System.out.print(variable.YELLOW + "Enter message: ");
        String unencryptedmessage2 = unencryptedmessage.nextLine();
        System.out.println(variable.YELLOW + "Encrypting message...");
        System.out.println(variable.YELLOW + "Attempting to display message...\n");


        while (variable.i <= unencryptedmessage2.length() - 1) {
            char o = unencryptedmessage2.charAt(variable.i);
            int p = (((((o * token1) * token3) + token4) - token2) - 10);
            System.out.print(variable.CYAN + p + ", ");
            variable.i++;
        }
            System.out.println(variable.GREEN + "\n\nMessage successfully encrypted.");
            System.out.print(variable.GREEN + "Exiting EncryptCode...");


    }
}
