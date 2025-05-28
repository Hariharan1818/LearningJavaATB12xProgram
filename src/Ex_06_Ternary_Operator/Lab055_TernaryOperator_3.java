package Ex_06_Ternary_Operator;

public class Lab055_TernaryOperator_3 {
    public static void main(String[] args) {

        // Nested Ternary

        int age = 10;
        String Allowed_Or_Notallowed = (age >18)? (age>21? "You're allowed and have Alcohol": "You're allowed and have soft drinks"): "sorry you're not allowed";
        System.out.println(Allowed_Or_Notallowed);
    }
}
