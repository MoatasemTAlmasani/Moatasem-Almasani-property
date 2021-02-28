
// The answer of (R-3.6)

public class Node<E>  {
  int data;
     Node next;
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int d)
            
    {
        this.data = d;
        this.next = null;}}
class LinkedList<E>
{
    Node start;
    LinkedList()
    {
        start = null;
    }
    public void push(int data)
    {
        if(this.start == null)
        {
            Node temp = new Node(data);
            this.start = temp;
        }
        else
        {
            Node temp = new Node(data);
            temp.next = this.start;
            this.start = temp;}}
    public int findSecondL(Node ptr)
    {
        Node temp = ptr;
        if(temp == null || temp.next == null)
            return -1;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        return temp.data;}
    public static void main(String[] args){
        LinkedList a=new LinkedList();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
        System.out.println(a.findSecondL(a.start));}}

////////////////////////////////////////////////////////////////////////////////////////
//The answer of (R-3.9)

//    public int sizes()
//    {
//        Node<String> t=head;
//        int s=0;
//        if (head==null)
//        {
//            return s;
//        }else
//        {
//            while (t.next!=null)
//            {
//                t=t.next;
//                s++;
//            }
//        }return s;
//    }

////////////////////////////////////////////////////////////////////////////////////////
//The answer of (R-3.25)

//node = L.header;
//
//    while( node.getNext() != null ) {
//            node = node.getNext();
//            }
//            node.setNext( M.header.getNext());
//
//            L.size = L.size + M.size;
//
//            return L;
////////////////////////////////////////////////////////////////////////////////////////

//28- Describe in detail an algorithm for reversing a singly linked list L using only a constant amount of additional space?
//        Answer:

//Algorithm reverse(LinlylinkedList  M)
//    Input: A singly linked list M
//Output : The reverse singly linked list of M
//            {
//            if M.head!=null
//            {
//            currentNode=M.head
//            previousNode=null
//            while (currentNode!=null)
//            do{
//            temp=currentNode.getNext();
//            currentNode.setNext(previousNode);
//            previousNode=currentNode;
//            currentNode=temp
//            }
//            M.head=previousNode
//            }
//            }
