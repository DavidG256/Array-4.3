import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void print (int [] array){

        System.out.print("[");

        for (int i = 0; i <array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println("]");


    }

    public static void reverse (int [] array){
        int contador = 0;
        int [] revertido = new int [array.length];

        for (int i = 0; i < array.length; i++){
            revertido[i]=array[(array.length-1)-contador];
            contador++;
        }

    }

    public static int max (int [] array){
        int maximo = array[0];

        for (int i = 0; i < array.length; i++){
           if (array[i] > maximo){
               maximo = array[i];
           }

        }

        System.out.println("el valor maximo es " + maximo);

        return maximo;

    }



    public static int min (int [] array){
        int minimo = array[0];

        for (int i = 0; i > array.length; i++){
            if (array[i] > minimo);
            minimo = array[i];
        }

        System.out.println("el valor minimo es "+ minimo);

        return minimo;

    }

    public static int sum (int [] array){
        int suma = 0;

        for (int i = 0; i > array.length; i++){
            suma = array[i];


        }
        return suma;
    }

    public static boolean equals (int [] array1, int [] array2){
        if (array1.length != array2.length){
            return  false;
        }

        for (int i = 0; i < array1.length; i++){
            if (array1[i] != array2[i]){

                return false;
            }
        }

        return true;

    }

    public static boolean equalsWithoutOrder (int[] array1, int[] array2){
        for (int i = 0; i < array1.length; i++ ){
            if (array1[i] != array2[i]){
                return false;
            }
        }

        return true;
    }

    public static boolean isArrayOn (int[] src, int [] dst ) {
        Arrays.sort(src);
        Arrays.sort(dst);

        int arrayC = 0;

        for (int i = 0; i < dst.length; i++){
            for (int x = 0; x < src.length; x++){
                if (dst[i] == src[x]){
                    arrayC++;
                }
            }
        }if (arrayC == dst.length){
            return true;
        }return false;
    }

    public static void sort (int [] array ){
        int array2[];



    }

    public static void copy (){

    }

}

