import java.util.linkedlist;
public class tester{

public static void main(String[] args){

// create new linked list
Linklist ll = new Linklist();

// insert 5 data to the list
for(int i=0; i<5; i++)
{
    DataItems data = new DataItems(i,"Data_"+i);
    ll.insertNode(data);
}
System.out.println("\n");

// display the inserted data
System.out.println("5 inserted datas are : \n");
ll.displayList();
System.out.println("\n");

// testing deleting node at the beginning
System.out.println("list after deleting first node data : \n");
ll.deleteNode();
ll.displayList();
System.out.println("\n");

// testing deleting node at the index
System.out.println("list after deleting second index data : \n");
ll.deleteNodeAtIndex(2);
ll.displayList();
System.out.println("\n");

// testing inserting node at the index
System.out.println("list after inserting second index data : \n");
DataItems data = new DataItems(11,"Data_11");
ll.insertNodeAtIndex(2,data);
ll.displayList();
System.out.println("\n");

// testing searching node with key
System.out.println("Searching list for key 11 : \n");
ll.searchKey(11);
System.out.println("\n");
System.out.println("size of list : "+ll.size());
System.out.println("\n");

// testing reversing linked list
System.out.println("list after reversing linked list : \n");
ll.reverseLinkedList();
ll.displayList();
}

}