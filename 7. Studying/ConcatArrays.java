/** Write a java method which concatenates two arrays */

public class ConcatArrays
{
    public static void main(String[] args) 
    {
        int size = (int)(Math.random() * 5) + 1;
        int[] arrayOne = new int[size];
        int[] newArray;
        
        System.out.println("Array one: ");
        for (int i = 0; i < size; i++) {
            arrayOne[i] = (int) (Math.random() * 100);
            System.out.print(arrayOne[i] + " ");
        }

        size = (int) (Math.random() * 5) + 1;
        int[] arrayTwo = new int[size];

        System.out.println("\nArray two: ");
        for(int i = 0; i < size; i++) {
            arrayTwo[i] = (int) (Math.random() * 100);
            System.out.print(arrayTwo[i] + " ");
        }

        System.out.println();
        newArray = concatArrays(arrayOne, arrayTwo);

        System.out.println("New Array (array one + array two): ");
        for(int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static int[] concatArrays(int[] array1, int[] array2)
    {
        int size = array1.length + array2.length;
        int[] newArray = new int[size];
        int index = 0;

        for(int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
            index++;
        }
        
        for(int i = 0; i < array2.length; i++) {
            newArray[index] = array2[i];
            index++;
        }

        return newArray;
    }
}