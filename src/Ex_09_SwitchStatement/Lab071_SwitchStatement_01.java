package Ex_09_SwitchStatement;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Lab071_SwitchStatement_01 {
    public static void main(String[] args) {

        System.out.println("Enter Days from 1 to 7 Here: ");
        Scanner scanner = new Scanner(System.in);
        int Day = scanner.nextInt();

        switch (Day){

            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Please enter valid number from 1 to 7 only");
        }
        System.out.println("End");
    }
}
