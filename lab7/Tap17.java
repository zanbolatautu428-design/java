public class Tap17 {

    public static void main(String[] args) {

        String s1 = "Java ";
        String s2 = "Programming";
        String s3 = "Language";
        String s4 = "Hello";
        String s5 = "Hello";

        String result;

        if(s4.equals(s5)){
            result = s1 + s2;
        } else {
            result = s1 + s3;
        }

        System.out.println("Нәтиже: " + result);

    }
}