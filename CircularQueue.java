/**
 * Created by LAB on 3/15/2021.
 */
public class CircularQueue<E> implements  CQueue<E> {
    CircularlyLinkedList<E> list= new CircularlyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public void enqueue(E element) {
list.addLast(element);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    @Override
    public void rotate() {
        list.rotate();

    }
}
