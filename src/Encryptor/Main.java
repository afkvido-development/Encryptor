package Encryptor;
import Encryptor.internal.Encrypt;
import Encryptor.internal.Decrypt;
import Encryptor.internal.variable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(variable.WHITE + "Running code encryptor " + variable.CYAN + "[Official Release 1.1.0]");
        Scanner run = new Scanner(System.in);
        System.out.print(variable.PURPLE + "Are you encrypting " + variable.GREEN + "[1]" + variable.PURPLE + " or decrypting " + variable.GREEN + "[2]" + variable.PURPLE + "? ");
        String running = run.next();

        switch (running) {
            case "1":
            Encrypt.main();
            break;

            case "2":
                Decrypt.main();
            break;

            default:
            System.out.println(variable.RED + "Invalid");
            break;
        }

    }
}
