package Ex_08_If_Else_Conditions;

import java.util.Scanner;

public class Lab070_If_Else_Scanner {
    public static void main(String[] args) {

        System.out.println("Please Enter Your Age Here:");
        Scanner scanner= new Scanner(System.in);

        int age = scanner.nextInt();

        if(age>=18){
            System.out.println("You can vote");
        }else {
            System.out.println("You can't vote");
        }

    }
}
