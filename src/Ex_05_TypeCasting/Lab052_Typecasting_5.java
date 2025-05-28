package Ex_05_TypeCasting;

public class Lab052_Typecasting_5 {
    public static void main(String[] args) {

        int course_fee = 10000;
        float GST= 18.45f;
      //  int totol_fee= course_fee+(int)GST;
        float totol_fee= course_fee+GST;
        System.out.println(totol_fee);

    }
}
