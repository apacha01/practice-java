/*
Implement a vector (mutable array with automatic resizing):
    Practice coding using arrays.
    New raw data array with allocated memory can allocate int array under the hood, just not use its features
        start with 16, or if starting number is greater, use power of 2 - 16, 32, 64, 128.
    size() - number of items
    capacity() - number of items it can hold
    is_empty() - return true if empty
    at(index) - returns item at given index, blows up if index out of bounds
    push(item) - 
    insert(index, item) - inserts item at index, shifts that index's value and trailing elements to the right
    prepend(item) - insert item at start (can use insert above at index 0).
    pop() - remove from end, return value
    delete(index) - delete item at index, shifting all trailing elements left
    remove(item) - looks for value and removes index holding it (even if in multiple places)
    find(item) - looks for value and returns first index with that value, -1 if not found
    resize(new_capacity) // private function
        when you reach capacity, resize to double the size
        when popping an item, if size is 1/4 of capacity, resize to half

*/
package arraysimplementation;

public class Vector {
    private int size = 0;
    private int capacity = 16;
    
    public static void main(String[] args) {
        
    }
    
    //RETURN NUMBER OF ITEMS.
    public int size(){
        return 0;
    }
    
    //RETURN NUMBER OF ITEMS IT CAN HOLD.
    public int capacity(){
        return 0;
    }
    
    //RETURN TRUE IF ARR IS EMPTY, FALSE IF NOT.
    public boolean isEmpty(){
        return true;
    }
    
    //RETURN VALUE AT GIVEN INDEX, BLOWS UP IF INDEX OUT OF BOUNDS.
    public int at(int index){
        return 0;
    }
    
    //INSERTS ITEMS AT END.
    public void push(int item){
        
    }
    
    //INSERTS ITEM AT INDEX, SHIFTS THAT INDEX`S VALUE AND TRAILING ELEMTS TO RIGHT.
    public void insert(int index,int item){
        
    }
    
    //INSERT ITEM AT INDEX 0.
    public void prepend(int item){
        
    }
    
    //REMOVES FROM END AND RETURN THE ITEM.
    public int pop(){
        return 0;
    }
    
    //DELETES ITEM AT INDEX, SHIFTING ALL TRAILING ELEMENTS TO LEFT.
    public void delete(int index){
        
    }
    
    //LOOKS FOR ITEM AND REMOVES INDEX HOLDING IT (EVEN IF IN MULTIPLE PLACES).
    public void remove(int item){
        
    }
    
    //LOOKS FOR ITEM AND RETURNS FIRST INDEX WITH THE VALUE. RETURN -1 IF NOT FOUND.
    public int find(int item){
        return 0;
    }
    
    
    private int[] resize(){
        int[] arr = {0,0};
        return arr;
    }
}
