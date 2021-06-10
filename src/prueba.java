public class prueba {
    public static void main(String[] args) {
        int[] lista=new int[10];
        lista[0]=1;
        lista[1]=11;
        lista[2]=21;
        lista[3]=14;
        lista[4]=2;
        lista[5]=4;
        lista[6]=11;
        lista[7]=21;
        lista[8]=24;
        lista[9]=251;
        int contador=0;
        for (int i =0; i<10;i++){
            if (lista[i]>5){
                contador++;
            }
        }
        System.out.println("Hay "+contador+" números mayores a 5");
    }
}
