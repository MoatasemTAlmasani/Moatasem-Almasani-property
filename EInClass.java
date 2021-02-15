import java.util.Scanner;
public class EInClass {
        int[] ary= new int[5];
        int num=0;
    public void ptint (){

        System.out.print("[");
        for (int i = 0; i <ary.length ; i++)
            if (i == ary.length - 1)
                System.out.print(ary[i]);
            else {
                System.out.print(ary[i] + ",");

            }
        System.out.println("]");
    }
    public void add ()
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Heloo world");
        for (int i = 0; i <ary.length; i++) {
            ary[i] = S.nextInt();
        }
    }
    public void reverse()
    {
        int n= ary.length-1;
        for (int i = 0; i <ary.length/2 ; i++) {
            int t= ary[i];
            ary[i]=ary[n];
            ary[n]=t;
            n--;
        }
    }
    public void shiftRight()
    {
        int i;
        for ( i = ary.length-1; i>0 ; i--) {
            ary[i]=ary[i-1];
        }
        ary[i]=0;
    }
    public void shiftLeft()
    {
        int i;
        for ( i = 0; i <ary.length-1 ; i++) {
            ary[i]=ary[i+1];
        }
        ary[i]=0;
    }
    public void add(int newE)
    {
        if(num<ary.length)
        {
            ary[num++]=newE;
        }
        else
            System.out.println("array is full");
    }
    public static void main(String[] args) {
        EInClass i= new EInClass();

        Scanner s= new Scanner(System.in);
        i.ptint();
        while(true) {
            i.add(s.nextInt());
            i.ptint();
        }
    }
}