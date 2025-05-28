package Ex_06_Ternary_Operator;

public class Lab056_Max_between_numbers {
    public static void main(String[] args) {

        int n1= 8;
        int n2=28;

       // System.out.println(Math.max(n1,n2)); using Math.max

        int max = n1>n2? n1: n2; // using ternary
        System.out.println(max);
    }
}
