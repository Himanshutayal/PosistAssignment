
import java.util.linkedlist;
public class Linklist{

HeadNode head;

public Linklist(){
    head = new HeadNode();
}

// insert node at the beginning of the list
public void insertNode(DataItems _data){
    Node newNode = new Node();
    newNode.setDataItems(_data);
    Node nextNode = head.getNextNode();
    head.setNextNode(newNode);
    newNode.setNextNode(nextNode);
}

// delete node at the beginning of the list
public void deleteNode(){
    Node toBeDeletedNode = head.getNextNode();
    if(toBeDeletedNode!=null) {
        Node nextNode = toBeDeletedNode.getNextNode();
        head.setNextNode(nextNode);
        toBeDeletedNode.setNextNode(null);
    } else {
        System.out.println("No nodes to be deleted");
    }

}

// display all nodes data
public void displayList(){
    Node nodes = head.getNextNode();
    int i=0;
    while(nodes!=null) {
        DataItems data = nodes.getDataItems();
        System.out.println("Node "+i+" : "+data.toString());
        nodes = nodes.getNextNode();
        i++;
    }
}

// reverse order of linked list
public void reverseLinkedList(){
    int sizeOfList = size();
    Node lastNode = nodeAtIndex(sizeOfList-1);
    Node snode, tnode;
    for(int i=sizeOfList-2;i>=0;i--){
        snode = nodeAtIndex(i);
        tnode = snode.getNextNode();
        tnode.setNextNode(snode);
    }
    nodeAtIndex(0).setNextNode(null);
    head.setNextNode(lastNode);
}

// reverse order of linked list
public void searchKey(int _key){
    int i=0;
    DataItems data = dataAtNodeIndex(i);
    while(data!=null){
        if(data.getKey()== _key){
            System.out.println("Node at index : "+i+" has data item : "+data.toString());
        }
        i++;
        data = dataAtNodeIndex(i);
    }
}

// insert a node at index
public void insertNodeAtIndex(int _index, DataItems _data){
    Node newNode = new Node();
    newNode.setDataItems(_data);
    if(_index==0) {
        insertNode(_data);
    } else {
        Node prevNode = nodeAtIndex(_index-1);
        if(prevNode!=null) {
            Node nextNode = prevNode.getNextNode();
            newNode.setNextNode(nextNode);
            prevNode.setNextNode(newNode);
        }
    }
}

// delete a node at index
public void deleteNodeAtIndex(int _index){
    if(_index==0) {
        deleteNode();
    } else {
        Node prevNode = nodeAtIndex(_index-1);
        if(prevNode!=null) {
            Node targetNode = prevNode.getNextNode();
            Node nextNode = targetNode.getNextNode();
            targetNode.setNextNode(null);
            prevNode.setNextNode(nextNode);
        }
    }
}

// return data item at particular node
public DataItems dataAtNodeIndex(int _index){
    Node nodes = nodeAtIndex(_index);
    if(nodes!=null) {
    return nodes.getDataItems();
} else {
    return null;
}
}

// return node at particular index
private Node nodeAtIndex(int _index){
    if(_index<0) {
        return null;
    } else {
        Node nodes = head.getNextNode();
        int i=0;
        while(i<_index && nodes!=null) {
            nodes = nodes.getNextNode();
            i++;
        }
        return nodes;
    }
}

// return the size of linked list
public int size() {
    int count=0;
    Node nodes = nodeAtIndex(count);
    while(nodes!=null) {
        nodes = nodeAtIndex(++count);
    }
    return count;
}

}