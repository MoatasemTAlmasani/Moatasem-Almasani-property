
public class Josephus {
     public static <E> E Josephus(CircularQueue<E> queue, int k)
     { if (queue.isEmpty()) return null;
         while (queue.size() > 1)
         {  for (int i=0; i < k-1; i++)
               queue.rotate();
             E e = queue.dequeue();
               System.out.println(" " + e + " is out"); }
               return queue.dequeue();}

               private static <E> CircularQueue<E> buildQueue(E a[ ]) {
            CircularQueue<E> queue1 =new CircularQueue<E>();
               for (int i=0; i<a.length; i++)  queue1.enqueue(a[i]);
                   return queue1; }

               public static void main(String[ ] args)
              { String[ ] a1 = {"Moatasem", "Mohammed", "Ali", "Rabee", "Amjad", "Klaleel"};
                  String[ ] a2 = {"Mustafa", "Hisham", "Waleed", "Sultan", "Belal", "Nadeem"};
               String[ ] a3 = {"Khalid", "Adel"};
                  System.out.println("First winner is " + Josephus(buildQueue(a1), 3));
               System.out.println("Second winner is " + Josephus(buildQueue(a2), 10));
                  System.out.println("Third winner is " + Josephus(buildQueue(a3), 7));}}

