

import java.util.linkedlist:
public class Node{ 

            // immutable class representing head node of linked list

            private DataItems dataItems;
            private Node nextNode;

            public void setNextNode(Node _nextNode){
                this.nextNode=_nextNode;
            }

            public Node getNextNode(){
                return nextNode;
            }

            public DataItems getDataItems(){
                return dataItems;
            }

            public void setDataItems(DataItems _dataItems){
                this.dataItems=_dataItems;
            }

            }