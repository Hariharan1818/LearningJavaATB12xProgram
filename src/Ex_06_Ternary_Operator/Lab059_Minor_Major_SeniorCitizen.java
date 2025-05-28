package Ex_06_Ternary_Operator;

public class Lab059_Minor_Major_SeniorCitizen {
    public static void main(String[] args) {

        int age = 15;
        String Catagory_ = (age<18)? "Minor" : age>65? "SeniorCitizen" : age<=45? "Adult": "Middle Aged";

        System.out.println(Catagory_);
    }
}
