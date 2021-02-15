
import java.util.Arrays;
import java.util.Scanner;

public class Remove {
    int arr[]=new int []{100,200,300,400,500};
int i;
        Scanner s=new Scanner(System.in);
public void remove()
{
    System.out.println(Arrays.toString(arr));
    System.out.println("Enter the elements that you remove");
    int z=s.nextInt();
    for ( i = z; i <arr.length ; i++) {
        if (i==arr.length-1)
        {
            arr[arr.length-1] =0;
        }
        else
            arr[i]=arr[i+1];
    }
}
public void print()
{
    for (i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        Remove r=new Remove();

        r.remove();
        r.print();
    }
    }

