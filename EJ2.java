public class EJ2 {
    public static void main(String[] args) {
        int[] array = {-2, 45, -29, 77, 56, 31};
        int [] array1 = {3, 23, 32, 45};
        int [] array2 = {2, 14, 42, 18};
        ArrayOperations.print(array);
        ArrayOperations.reverse(array);
        EJ1.reverse(array);
        ArrayOperations.max(array);
        ArrayOperations.min(array);
        ArrayOperations.sum(array);

        System.out.println(""+ArrayOperations.equals(array1, array2) );

        System.out.println("" + ArrayOperations.equalsWithoutOrder(array1, array2));

        System.out.println("" + ArrayOperations.isArrayOn(array));



    }

}
