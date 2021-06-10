import java.util.Random;
import java.util.Scanner;

public class Tarea66 {
    public static void main(String[] args) {
        Random numero=new Random();
        int[] array=new int[10];
        Scanner teclado=new Scanner(System.in);
        boolean validez=false;
        System.out.print("Array:");
        int i=0;

        for (int contador=0;contador<=array.length-1;contador++){
            array[contador]=numero.nextInt(50);
            System.out.print(" "+array[contador]+" ");
        }
        System.out.println("");
        System.out.print("Valor que quieres buscar :");
        int entrada= teclado.nextInt();


        do {
            if ((array[i]==entrada)&& (!validez)){
                System.out.println(entrada+" está en la array");
                validez=true;
            }
            i++;
        }while (!validez&& i< array.length);
            if (!validez){
                System.out.println(entrada+" no está en la array");
                validez=true;
            }
        }
    }
