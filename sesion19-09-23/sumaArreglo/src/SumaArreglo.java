import java.util.Scanner;

public class SumaArreglo{

public static void main(String[]args){
    Scanner lector = new Scanner(System.in);
    System.out.println("Ingrese el tamaño de los arreglos: ");
    int tamaño = lector.nextInt();

    while (tamaño <= 0){
        System.out.println("El tamaño de los arreglos no puede ser: ");
        System.out.println("Ingrese el tamaño de los arreglos: ");
        tamaño = lector.nextInt();

    }
    //Declarar los arreglos
    int[] arregloA = new int[tamaño];
    int[] arregloB = new int[tamaño];
    int[] arregloSuma = new int[tamaño];
    
    //pedir los elementos de los arreglos al usuario
    System.out.println("Elementos del arreglo A");
    for (int i = 0; i < tamaño; i++){
    System.out.println("Elementos[" + (i+1) + "] = ");
    arregloA[i] = lector.nextInt();

}

System.out.println("Elementos del arreglo B");
 for (int i = 0; i < tamaño; i++){
 System.out.println("Elementos[" + (i+1) + "] = ");
  arregloB[i] = lector.nextInt();

 }
    //sumar ambos arreglos elementos a elementos
    for (int i = 0; i < arregloSuma.length; i++){
     arregloSuma[i] = arregloA[i] + arregloB[i];

    }
    //mostrar resultados de arreglo a 
    System.out.println("Elementos del arreglo A :");
    System.out.print("ArregloA=[]");
    for (int i= 0; i < arregloSuma.length; i++){
    System.out.println(arregloA[i] + ".");

}
//mostrar resultados de arreglo b

    System.out.println("Elementos del arreglo B :");
    System.out.print("ArregloB=[]");
    for (int i= 0; i < arregloSuma.length; i++){
    System.out.println(arregloB[i] + ".");
}
      System.out.println("]\n");

       System.out.println("Elementos de suma: ");
        System.out.println("Arreglo Suma=[ ");
         for (int i= 0; i < arregloSuma.length; i++){
    System.out.println(arregloA[i] + ",");
}
  
    System.out.println( "]");
     lector.close();

}
}