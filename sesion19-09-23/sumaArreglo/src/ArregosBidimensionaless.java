import java.util.Scanner;
public class ArregosBidimensionaless {
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);

        int[][]matrizA = new int[3][];
       // int matrizB[][] = new int[2][2];
        int matrizB[][] = 
        {
            {1,2},
        {3,4}

        };
        System.out.println("Cantidad de filas: ");
        int cantFilas = lector.nextInt();

        System.out.println("Cantidasd de columnas: ");
        int  cantidadColumnas = lector.nextInt();

        for(int i = 0; i < matrizA.length; i++){//para las filas
            for(int j = 0; j < matrizA[i].length; j++){//para las columnas 
                System.out.print("ArregloA[ " + i+ "," + j + "]=");
                matrizA[i][j] = lector.nextInt();

            }

        }
    }
    
}
