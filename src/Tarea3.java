import java.util.Random;

public class Tarea3 {
    public static void main(String[]args){
        Random numero=new Random();
        int[] array1=new int[10];

        System.out.print("Array 1:");

        for (int contador=0;contador<=array1.length-1;contador++){
            array1[contador]=numero.nextInt(100);
            System.out.print(" "+array1[contador]+" ");
        }
        array1[9]=-7;

        int[] array2=new int[10];
        System.out.println(" ");

        System.out.print("Array 2:");
        for (int contador=0;contador<=array2.length-1;contador++){
            array2[contador]=numero.nextInt(100);
            System.out.print(" "+array1[contador]+" ");
        }
    }
}
