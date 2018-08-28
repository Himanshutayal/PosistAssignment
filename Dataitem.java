
import java.util.linkedlist;
public class Dataitem{

private int key;
private String value;

public Dataitem(int _key, String _value){
    this.key=_key;
    this.value=_value;
}

public int getKey() {
    return key;
}

public String getValue() {
    return value;
}

public String toString() {
    return "("+getKey()+","+getValue()+")";
}

}