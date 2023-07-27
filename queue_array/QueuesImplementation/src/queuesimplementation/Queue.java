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

public class Queue {
    public static final int ARR_LENGTH = 16;
    
    private static int read;
    private static int write;
    private static int size;
    private static int arr[];
    
    public Queue(){
        size = 0;
        read = 0;
        write = 0;
        arr = new int[ARR_LENGTH];
    }

    public void enqueue(int value){
        if (write == ARR_LENGTH && read > 1) {
            write = 0;
	}
	if (write == ARR_LENGTH && read == 0) {
            System.out.println("FULL Queue!");
        }
        else{
            arr[write] = value;
            write++;
            size++;
        }
    } 
    
    public int dequeue(){
        if (empty()) {
            read = 0;
            write = 0;
            return -1;
        }
        if (read == ARR_LENGTH) {
            read = 0;
        }
        
        int aux = arr[read];
        arr[read] = 0;
        
        read++;
        size--;
        
        return aux;
    }
    
    public boolean empty(){
        return size == 0;
    }

}
