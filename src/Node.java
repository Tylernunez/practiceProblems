/**
 * Created by T2000 on 9/28/2016.
 */
public class Node {

    private Node next;

    private int value;

    private Node previous;

    public Node(int value, Node next, Node previous){
        this.value = value;
        this.next = next;
        this.previous = previous;
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


    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }


}
