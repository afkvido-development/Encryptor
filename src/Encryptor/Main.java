package Encryptor;

import Encryptor.gui.eGuiRunner;
import Encryptor.internal.Decrypt;
import Encryptor.internal.Encrypt;
import Encryptor.internal.variable;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        eGuiRunner.main();



        System.out.println(variable.GRAY + "Running code encryptor " + variable.CYAN + "[Official Release 0.2.0]");
        Scanner run = new Scanner(System.in);
        System.out.print(variable.PURPLE + "Are you encrypting " + variable.GREEN + "[1]" + variable.PURPLE + " or decrypting " + variable.GREEN + "[2]" + variable.PURPLE + "? ");
        String running = run.next();

        switch (running) {
            case "1", "[1]" -> Encrypt.main();
            case "2", "[2]" -> Decrypt.main();
            default -> System.out.println(variable.RED + "Invalid");
        }

    }
}
