/*
Implement (I did with tail pointer & without):
	size() - returns number of data elements in list
	empty() - bool returns true if empty
	value_at(index) - returns the value of the nth item (starting at 0 for first)
	push_front(value) - adds an item to the front of the list
	pop_front() - remove front item and return its value
	push_back(value) - adds an item at the end
	pop_back() - removes end item and returns its value
	front() - get value of front item
	back() - get value of end item
	insert(index, value) - insert value at index, so current item at that index is pointed to by new item at index
	erase(index) - removes node at given index
	value_n_from_end(n) - returns the value of the node at nth position from the end of the list
	reverse() - reverses the list
	remove_value(value) - removes the first item in the list with this value
*/
package simplelistimplementation;

public class SimpleList {
    private static int size;
    private static SimpleListNode head;
    private static SimpleListNode tail;
    
    public SimpleList(){
        size = 0;
        head = null;
    }
    
    public int size(){
        return size;
    }
    
    public boolean empty(){
        return size == 0;
    }
    
    public int valueAt(int index){
        SimpleListNode n = new SimpleListNode(head);
        int i;
        
        if (index < 0 || index >= this.size()) {
            System.out.print("NOT IN LIST ");
            return 0;
        }
        
        i = 0;
        do {
            n = n.getNext();
            i++;
        } while (i<=index);
        
        return n.getValue();
    }
    
    public void pushFront(int value){
        SimpleListNode n = new SimpleListNode(value,head);
        if (size == 0) {
            tail = n;
        }
       head = n;
       size++;
    }
    
    public int popFront(){
        int a = head.getValue();
        head = head.getNext();
        if (size == 1) {
            tail = head;
        }
        size--;
        return a;
    }
    
    public void pushBack(int value){
        SimpleListNode n = new SimpleListNode(value,null);
        if (size == 0) {
            tail = n;
            head = n;
        }
        else{
            tail.setNext(n);
            tail = tail.getNext();
        }
        size++;
    }
    
    public int popBack(){
        
        
        return 0;
    }
    
    public int front(){
        return 0;
    }
   
    public int back(){
        return 0;
    }
    
    public void insert(int index,int value){}
    
    public void erase(int index){}
   
    public int valueNfromEnd(int n){
        return 0;
    }
    
    public void reverse(){}
    
    public void removeValue(int value){}
}
