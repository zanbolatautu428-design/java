public class Tap13 {
    public static void main(String[] args) {

        int[] C = new int[20];
        int sum = 0;

        for(int i=0;i<20;i++){
            C[i] = (int)(Math.random()*100);
            sum += C[i];
        }

        System.out.println("Орташа мән = "+ (double)sum/20);
    }
}