package Ex_09_SwitchStatement;

import java.util.Scanner;

public class Lab072_SwitchStatement_02 {
    public static void main(String[] args) {

        System.out.println("Enter Days From 1 to 7");
        Scanner scanner= new Scanner(System.in);
        int Day= scanner.nextInt();

        switch (Day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;

        }
    }
}
