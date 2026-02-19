package if_switch;

import java.util.Scanner;

public class if_else1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Оң сан");
        } else if (number < 0) {
            System.out.println("Теріс сан");
        } else {
            System.out.println("Нөл");
        }
    }
}