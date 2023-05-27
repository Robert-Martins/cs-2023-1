import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Teste {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] arrays = {
                new int[100],
                new int[1000],
                new int[10000]
        };

        // Preenchendo os vetores com valores gerados randomicamente
        for (int[] arr : arrays) {
            Arrays.setAll(arr, i -> random.nextInt());
        }

        // Teste do MergeSort Iterativo
        testMergeSort(MergeSortTypes.ITERATIVE, arrays);

        // Teste do MergeSort Recursivo
        testMergeSort(MergeSortTypes.RECURSIVE, arrays);
    }

    private static void testMergeSort(MergeSortTypes mergeSortTypes, int[][] arrays) {
        String methodType = mergeSortTypes == MergeSortTypes.ITERATIVE ? "Iterativo" : "Recursivo";
        System.out.println("MergeSort " + methodType + ":");

        for (int[] arr : arrays) {
            int[] copy = Arrays.copyOf(arr, arr.length); // Criar uma cópia do array original para manter o mesmo estado inicial
            long startTime = System.nanoTime();

            if (mergeSortTypes.equals(MergeSortTypes.ITERATIVE)) {
                MergeSort.mergeSortIterative(copy);
            } else if (mergeSortTypes.equals(MergeSortTypes.RECURSIVE)) {
                MergeSort.mergeSortRecursive(copy);
            }

            long endTime = System.nanoTime();
            System.out.println("Tamanho do vetor: " + arr.length + " Tempo de execução: " + (endTime - startTime) + " ns");
        }
    }

}
