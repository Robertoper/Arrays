import java.util.Random;

public class Tarea2 {
    public static void main(String[] args) {
        int[] numeros=new int[1000];
        Random numero=new Random();

        for (int contador=0;contador<=numeros.length-1;contador++){
            numeros[contador]=numero.nextInt(89)+10;
            System.out.print(" "+numeros[contador]+"  ");
        }
    }

}
