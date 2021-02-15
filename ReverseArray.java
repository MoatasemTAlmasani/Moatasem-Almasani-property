import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int z, r, i, j = 0;
        System.out.println("Enter the size of array : ");
        z = s.nextInt();
        int arr1[] = new int[z];
        int arr2[] = new int[z];
        System.out.println("Enter " + z +" "+ "elements");
        for (i = 0; i < z; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("reverse the elemnts of array");
        for (i = z; i > 0; i--, j++) {
            arr2[j] = arr1[i - 1];
            System.out.print(arr2[j]+" ");}}}
