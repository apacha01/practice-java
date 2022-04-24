
package simplelistimplementation;

public class SimpleListNode {
    private int value;
    private SimpleListNode next;

    public SimpleListNode(int value, SimpleListNode next) {
        this.value = value;
        this.next = next;
    }
    
    public SimpleListNode(SimpleListNode next) {
        value = 0;
        this.next = next;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SimpleListNode getNext() {
        return next;
    }

    public void setNext(SimpleListNode next) {
        this.next = next;
    }
    
    
}
