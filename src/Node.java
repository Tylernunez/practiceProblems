/**
 * Created by T2000 on 9/28/2016.
 */
public class Node {

    private Node head;

    private Node next;

    private int value;

    private Node current;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node(int value){
        this.value = value;
    }
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node next){
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getCurrent(){
        return this.current;
    }

    public void setCurrent(Node current){
        this.current = current;
    }
    public Node Reverse(){
        return null;
    }

    public Node insert(int value){
        if(head.getNext() == null){
            head.setNext(new Node(value));
            return getHead();
        }else{
            setCurrent(head);
            while(head.getNext() != null){
                current.setNext(getNext());
                if(current.getNext() == null){
                    current.setNext(new Node(value));
                    return getHead();
                }

            }
        }
        return null;
    }
    public void print(){
        this.getHead();
        setCurrent(this.getHead());
        while(this.getCurrent().getNext() != null){
            system.out.println()
        }
    }
}
