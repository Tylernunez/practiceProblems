/**
 * Created by T2000 on 9/28/2016.
 */
public class Main {
    public static void main(String [] args){
        Node node1 = new Node(4);
        node1.setHead(node1);
        Node node2 = new Node(3);
        node2.setHead(node1);

    }
}