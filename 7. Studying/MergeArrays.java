public class MergeArrays 
{
    public static void main(String[] args) {
        int[] array1 = {34, 4, 5, 17, 15, 30};
        int[] array2 = {12, 6, 29, 20};
        int[] newArray;

        newArray = merge(array1, array2);

        System.out.println("First array:");
        for(int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\nSecond array:");
        for(int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println("\nMerged array:");
        for(int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }

    public static int[] merge(int[] arr1, int[] arr2)
    {
        int size = arr1.length + arr2.length;
        int[] mergedArray = new int[size];
    
        mergedArray[0] = arr1[0];

        for(int i = 1, j = 2; i < arr1.length - 1; i++) {
            mergedArray[j] = arr1[i];
            j = j + 2;
        }

        // mergedArray[1] = arr2[0];
        // for(int i = 0, j = 1; i < arr2.length; i++) {
        //     mergedArray[i+3] = arr2[i];
        // }

        return mergedArray;
    }
    
}