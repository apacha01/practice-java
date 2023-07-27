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
        SimpleListNode n = head;
        int i;
        
        if (index < 0 || index >= size) {
            System.out.print("NOT IN LIST ");
            return -1;
        }
        else if (size == 0) {
            System.out.println("EMPTY LIST ");
            return 0;
        }
        
        i = 0;
        while (i<index){
            n = n.getNext();
            i++;
        }
        
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
        int a;
        if (size == 0) {
            System.out.println("EMPTY LIST ");
            return 0;
        }
        else{
            a = head.getValue();
            head = head.getNext();
            if (size == 1) {
                tail = head;
            }
            size--;
        }
        
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
        if (size == 0) {
            System.out.println("EMPTY LIST ");
            return 0;
        }
        
        SimpleListNode aux = head;
        int a = tail.getValue(), i;
        
        i = 0;
        while (i < size - 2){
            aux = aux.getNext();
            i++;
        }
        
        tail = aux;
        aux.setNext(null);
        
        size--;
        
        return a;
    }
    
    public int front(){
        return head.getValue();
    }
   
    public int back(){
        return tail.getValue();
    }
    
    public void insert(int index,int value){
        if (index < 0 || index >= size) {
            System.out.println("INDEX OUT OF BOUNDS ");
	}
	else if (index == 0) {
		this.pushFront(value);
	}
	else if(index == size-1){
		this.pushBack(value);
	}
	else {
            SimpleListNode n = new SimpleListNode(value,head);
            SimpleListNode aux = head;
            int i;
            
            i = 0;
            do {
                if (i == index-1) {
                    aux = n.getNext();
                }
                n.setNext(n.getNext().getNext());
                i++;
            } while (i < index);
            aux.setNext(n);
            size++;
	}
    }
    
    public void erase(int index){
        if (index < 0 || index >= size) {
            System.out.println("INDEX OUT OF BOUNDS ");
	}
	else if (index == 0) {
		this.popFront();
	}
	else if(index == size-1){
		this.popBack();
	}
	else {
            SimpleListNode aux = head;
            int i;
            
            i = 0;
            do {
                if (i == index-1) {
                    aux.setNext(aux.getNext().getNext());
                }
                aux = aux.getNext();
                i++;
            } while (i < index);
            size--;
        }
    }
   
    public int valueNfromEnd(int n){
        int valueNfromHead;
	valueNfromHead = size - n - 1;
        
        if (n < 0 || n >= size) {
            System.out.print("INDEX OUT OF BOUNDS ");
            return 0;
	}
	else if (n == 0) {
            return this.back();
	}
	else if(n == size-1){
            return this.front();
	}
	else {
            return this.valueAt(valueNfromHead);
        }
    }
    
    public void reverse(){
        for (int i = 0; i < size-1; i++) {
            this.pushFront(valueAt(i+1));
            erase(i+2);
	}
    }
    
    public void removeValue(int value){
        SimpleListNode aux = head;
        
        for (int i = 0; i < size-1; i++) {
            if (aux.getValue() == value) {
                erase(i);
                break;
            }
            aux = aux.getNext();
	}
    }
}
