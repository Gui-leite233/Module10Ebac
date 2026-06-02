import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao=0;
        Scanner in = new Scanner(System.in);

        DynamicArray dynamicArray = new DynamicArray(3);


        System.out.println("o que deseja fazer?\n 1 para usar bubbleSort\n 2 para multiplicar os numeros pares da string");
        opcao = in.nextInt();

        if (opcao == 1){
            sorted(in, dynamicArray);
        } else{
            oddEven(in, dynamicArray);
        }
        in.close();
    }


    private static void oddEven(Scanner in, DynamicArray dynamicArray){

        System.out.println("How many numbers? ");
        int n = in.nextInt();
        System.out.println("Enter the numbers:");


        for (int i = 0; i < n; i++) {
            dynamicArray.insert(in.nextInt());
        }


        int[] original = dynamicArray.toArray();


        int[] resultado = new int[original.length];


        for (int i = 0; i < original.length; i++) {

            if (original[i] % 2 == 0) {

                resultado[i] = resultado[i] = original[i] * 2;

            } else {

                resultado[i] = original[i] * 2;
            }
        }

        System.out.println("New array:");
        printArray(resultado);
    }

    private static void sorted(Scanner in, DynamicArray dynamicArray) {
        System.out.println("How many numbers? ");
        int n = in.nextInt();

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            dynamicArray.insert(in.nextInt());
        }

        int[] array = dynamicArray.toArray();

        System.out.println("Original array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    public static void printArray(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
    }
}
