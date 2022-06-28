/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Who goes there? ");
        String name = in.nextLine();
        if (name.toLowerCase().matches("alice|bob")){
            System.out.println("Hello There");
        } else
        {

        }


    }
}
