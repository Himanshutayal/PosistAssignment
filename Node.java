package posist;

public class Node 
{
	long timestamp;
    Data data;
    int nodeNum;
    String nodeID;
    String refnodeID;
    String childNodeID;
    String refchildNodeID;

    //Default Constructor
    public Node() 
    {
    }

    //Constructor Building
    public Node(long timestamp, Data data, int nodeNum, String nodeID, String refnodeID, String childNodeID, String refchildNodeID)
    {
        this.timestamp = timestamp;
        this.data = data;
        this.nodeNum = nodeNum;
        this.nodeID = nodeID;
        this.refnodeID = refnodeID;
        this.childNodeID = childNodeID;
        this.refchildNodeID = refchildNodeID;
    }
    
    
    //Getter Setter
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(int nodeNum) {
        this.nodeNum = nodeNum;
    }

    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public String getRefnodeID() {
        return refnodeID;
    }

    public void setRefnodeID(String refnodeID) {
        this.refnodeID = refnodeID;
    }

    public String getChildNodeID() {
        return childNodeID;
    }

    public void setChildNodeID(String childNodeID) {
        this.childNodeID = childNodeID;
    }

    public String getRefchildNodeID() {
        return refchildNodeID;
    }

    public void setRefchildNodeID(String refchildNodeID) {
        this.refchildNodeID = refchildNodeID;
    }
}
