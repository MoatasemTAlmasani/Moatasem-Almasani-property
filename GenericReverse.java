import java.util.Arrays;
public class  GenericReverse<T> {
public static  <T> void reverse(T[] array){
    int s=array.length-1;
    for (int i = 0;  i < array.length/2;  i++) {
        T temp=(T) array[i];
        array [i]=array[s];
        array[s]=temp;
        s--;
    }System.out.println(Arrays.toString(array));
    for (int i = 0; i <array.length ; i++)
    {}}

    public static void main(String[] args) {
        String arr1[]={"Moatasem","Almasani"};
        Integer arr2[]={20,19,10,1,26,12};
        reverse(arr1);
        reverse(arr2);}


}

