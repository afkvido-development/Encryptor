/**

yo



 **/

package Encryptor.internal;

import Encryptor.api.Decryptor;

import java.util.Scanner;

public class Decrypt {

    public static void main() {

        Scanner fragment = new Scanner(System.in);


        System.out.println(variable.YELLOW + "Paste in the encrypted message: \n" + variable.BLUE + "[");
        String PastedMessage = fragment.nextLine();
        System.out.println(variable.BLUE + "]");

        String Decrypted = Decryptor.decrypt(PastedMessage);

        System.out.println(variable.YELLOW + "\nDecrypted message:" + variable.BLUE + "\n[\n" + variable.CYAN + Decrypted + variable.BLUE + "\n]\n");
        System.out.println(variable.GREEN + "Message successfully decrypted.");
    }

}
