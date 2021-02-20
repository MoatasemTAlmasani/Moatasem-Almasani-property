
public class GenericMarge <C,M> {
        public    C array1[];
        public   M array2[];
    public GenericMarge()
    {}
        public GenericMarge(C[] array1, M[] array2) {
        this.array1 = array1;
        this.array2 = array2;}

            public    <C>  void  Merging( C []array1,M[] array2) {
            Object[] array3 = new Object[array1.length+array2.length];

            for (int i = 0; i <array1.length ; i++) {
            array3[i] = (Object) array1[i];}
            for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = (Object) array2[i];
            }
            for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);}}

             public static void main(String[] args) {
             Integer ar1[]={10,20,30,40,50};
             Integer ar2 []={60,70,80};
             GenericReverse g=new GenericReverse();




        }
}

