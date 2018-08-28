package posist;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Scanner;


public class NodeCreation 
{
	

	public static Data setData()
    {
        
        System.out.println("Enter the name of owner : ");
        String name=scan.next();
        System.out.println("Enter the address of owner : ");
        String address=scan.next();
        System.out.println("Enter the mobile no of owner : ");
        String mobileno=scan.next();
        System.out.println("Enter the value : ");
        float value=scan.nextFloat();
        Data data=new Data(name, address, mobileno, value);
        return data;
    }
	
	
	public static Node setNode()
	{
		Data data=setData();
		int nodenum=count+1;
		count++;
		String nodeid;
		String refnodeid;
		String childnodeid;
		String refchildnodeid;
        System.out.println("Enter the unique id of node : ");
        nodeid=scan.next();
        System.out.println("Enter the RefNode id of node : ");
        refnodeid=scan.next();
        System.out.println("Enter the unique id of child node : ");
        childnodeid=scan.next();
        System.out.println("Enter the child RefNode id of node : ");
        refchildnodeid=scan.next();
        Node node=new Node();
        Date date=new Date();
        node.setTimestamp(date.getTime());
        node.setData(data);
        node.setNodeNum(nodenum);
        node.setNodeID(nodeid);
        node.setRefnodeID(refnodeid);
        node.setChildNodeID(childnodeid);
        node.setRefchildNodeID(refchildnodeid);
        return node;
	}
	}

}
