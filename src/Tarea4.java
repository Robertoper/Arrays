import java.util.Random;
import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        Random numero=new Random();
        int[] array=new int[10];
        Scanner teclado=new Scanner(System.in);


        System.out.print("Array:");


        for (int contador=0;contador<=array.length-1;contador++){
            array[contador]=numero.nextInt(50);
            System.out.print(" "+array[contador]+" ");
        }
        System.out.println("");
        System.out.print("Valor que quieres buscar :");
        int entrada= teclado.nextInt();


        for (int contador=0;contador<=array.length-1;contador++){
            if (array[contador] == entrada){
                System.out.print(array[contador]+" está en la array");
            }
        }



    }
}
