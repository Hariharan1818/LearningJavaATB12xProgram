package Ex_09_SwitchStatement;

import java.util.Scanner;

public class Lab073_SwitchStatement_03 {
    public static void main(String[] args) {

        System.out.println("Enter The Browser Name Here:");
        Scanner scanner = new Scanner(System.in);
        String Browser = scanner.next();
        Browser = Browser.toLowerCase();


        switch (Browser){

            case "chrome":
                System.out.println("Working with chrome");
                break;
            case "firefox":
                System.out.println("Working with firefox");
                break;
            case "microsoftedge":
                System.out.println("Working with microsoft edge");
                break;
            default:
                System.out.println("Unable to find which web browser it is");
                break;

        }

        System.out.println("End");
    }
}
