
public class CopyArray {
    int arr1[]={5,6,7,8,9,10,11};
    int arr2[];
    public void printArray()
    {
        System.out.println("element of array1  coping to array2 :");
        arr2=arr1;
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }}
    public static void main(String[] args) {
        CopyArray c=new CopyArray();
        c.printArray();  }}



