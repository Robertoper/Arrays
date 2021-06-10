public class Tarea1 {
    public static void main(String[] args) {
        int [] numeros=new int[10];
        System.out.println(numeros.length);
        for (int contador=0 ; contador<=numeros.length-1;contador++){
            numeros[contador]=211;
        }

        for (int contador=0;contador<=numeros.length-1; contador++){
            System.out.println("Posición "+contador+" contiene el valor "+numeros[contador]);
        }
    }
}
