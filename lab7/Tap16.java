public class Tap16  {
    public static short maxX(){
        short x;
        short[] array = new short[10];

        System.out.print("Негізгі массив: ");

        for(int i=0;i<10;i++){
            array[i] = (short)Math.round(50*Math.random());
            System.out.print(array[i] + " ");
        }

        x = array[0];

        for(int i=1;i<10;i++){
            if(x < array[i]){
                x = array[i];
            }
        }

        return x;
    }

    public static void main(String[] args) {

        System.out.println("\nМаксималды элемент: " + maxX());

    }
}
