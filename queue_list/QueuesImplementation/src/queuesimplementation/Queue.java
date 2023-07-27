/*
Implement using linked-list, with tail pointer:
	enqueue(value) - adds value at position at tail
	dequeue() - returns value and removes least recently added element (front)
	empty()
Implement using fixed-sized array:
	enqueue(value) - adds item at end of available storage
	dequeue() - returns value and removes least recently added element
	empty()
	full()
Cost:
	a bad implementation using linked list where you enqueue at head and dequeue at tail would be O(n) because you'd need the next to last element, causing a full traversal each dequeue
	enqueue: O(1) (amortized, linked list and array [probing])
	dequeue: O(1) (linked list and array)
	empty: O(1) (linked list and array)
*/
package queuesimplementation;

import java.util.LinkedList;

public class Queue {
    private LinkedList l;
    
    public Queue(){
        l = new LinkedList();
    }

    public void enqueue(int value){
        l.add(value);
    } 
    
    public Object dequeue(){
        return l.pop();
    }
    
    public boolean empty(){
        return l.isEmpty();
    }

}
