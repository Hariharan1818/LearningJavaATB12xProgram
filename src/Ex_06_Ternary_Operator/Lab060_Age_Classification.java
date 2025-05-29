package Ex_06_Ternary_Operator;

public class Lab060_Age_Classification {
    public static void main(String[] args) {

        // We use command line arguments below for input

        String User_Input = args[2];

        int age = Integer.parseInt(User_Input);

        String Age_Classification = (age<18)? "Minor" : (age<65)? "Middle age" : "Senior Citizen";
        System.out.println(Age_Classification);




    }
}
