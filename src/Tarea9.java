import java.util.Random;

public class Tarea9 {
    public static void main(String[] args) {
        Random numero=new Random();
        int[] array=new int[10];
        System.out.print("Array:");
        int numeroMayor = 0;
        int posición=0;


        for (int contador=0;contador<=array.length-1;contador++){
            array[contador]=numero.nextInt(100);
            System.out.print(" "+array[contador]+" ");
        }
        System.out.println("");

        for (int contador=0;contador<=array.length-1;contador++){
            if (array[contador]>numeroMayor){
                numeroMayor=array[contador];
                posición=contador;
            }
        }
        System.out.println("El valor más grande es "+numeroMayor+", que se encuentra en la posición "+posición);
    }
}
