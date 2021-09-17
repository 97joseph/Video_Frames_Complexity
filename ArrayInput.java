import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static int remove_duplicate_values(int arr[], int size)
    {
        int[] aux = new int[size];
        aux[0] = arr[0];
        int new_size = 1;
        for(int i=1;i<size;i++)
        {
            if(arr[i] != arr[i-1])
                aux[new_size++] = arr[i];
        }
        for(int i=0;i<new_size;i++)
        arr[i] = aux[i];
        return new_size;
    }
    
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();
            int[] ARRAY = new int[size];
            System.out.print("Enter the elements of the array: ");
            for(int i=0;i<size;i++)
                ARRAY[i] = sc.nextInt();
            size = remove_duplicate_values(ARRAY,size);
        for(int i=0;i<size;i++)
        {
            System.out.print(ARRAY[i] + " ");
        }
        }
}