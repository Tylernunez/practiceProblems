/**
 * Created by T2000 on 10/2/2016.
 */
public class List {

    private Node head;
    private Node current;
    private String name;

    public List(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getCurrent(){
        return this.current;
    }

    public void setCurrent(Node current){
        this.current = current;
    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node reverse(){
        //still not working...
        //prev = null
        head.setPrevious(null);
        //cur = head
        setCurrent(head);
        //while(cur != null)
        while(current != null){
            //next = cur.next;
            setHead(current.getNext());
            //cur.next = prev;
            current.getNext().setPrevious(current.getNext());
            //prev = cur;
            head.setPrevious(current);
            //cur = next;
            setCurrent(current.getNext());
        }
        setHead(current.getPrevious());
        return head;
    }

    public Node insertBack(int value){
        if(getHead().getNext() == null){
            getHead().setNext(new Node(value,null,getHead()));
            return getHead();
        }else{
            setCurrent(getHead());
            while(head.getNext() != null){
                setCurrent(getCurrent().getNext());
                if(current.getNext() == null){
                    current.setNext(new Node(value,null,current));
                    return getHead();
                }

            }
        }
        return null;
    }
    public Node insertFront(int value){
        if(head == null){
            setHead(new Node(value,null,null));
        }else{
            head.setPrevious(new Node(value,head,null));
            setHead(head.getPrevious());
            return getHead();
        }

        return null;
    }
    public Node insertSorted(int value){
        //if(head==null)
        if(this.head == null){
            //return node;
            return new Node(value);
        }
        //cur==head;
        setCurrent(head);
        //prev==null;
        current.setPrevious(null);
        //While(cur!=null)
        while (current != null) {
            //if(node.data<=cur.data){
           // if()
                //node.next=cur;
            //if(cur==head){
                //return node;
            //}
        }

    }
    public void print(){
        this.getHead();
        setCurrent(this.getHead());
        System.out.println("These are the contents of " + this.name + ": ");
        while(this.getCurrent() != null){
            System.out.println("================================================");
            System.out.println("value: " + this.getCurrent().getValue());
            if(this.getCurrent().getNext() != null){
                System.out.println("next: " + this.getCurrent().getNext().getValue());
            }
            if(this.getCurrent().getPrevious() != null){
                System.out.println("previous: " + this.getCurrent().getPrevious().getValue());
            }
            System.out.println("================================================");
            setCurrent(getCurrent().getNext());
        }
    }
}
