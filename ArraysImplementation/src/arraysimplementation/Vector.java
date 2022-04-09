/*
Implement a vector (mutable array with automatic resizing):
    Practice coding using arrays.
    New raw data array with allocated memory can allocate int array under the hood, just not use its features
        start with 16, or if starting number is greater, use power of 2 - 16, 32, 64, 128.
    size() - number of items
    capacity() - number of items it can hold
    is_empty() - return true if empty
    at(index) - returns item at given index, blows up if index out of bounds
    push(item)
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
    private static int size = 0;
    private static int capacity = 0;
    private static int[] arr;
    
    //CONSTRUCTOR.
    public Vector(int capacity){
        this.size = 0;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }
    
    //RETURN NUMBER OF ITEMS.
    public int size(){
        return size;
    }
    
    //RETURN NUMBER OF ITEMS IT CAN HOLD.
    public int capacity(){
        return capacity;
    }
    
    //RETURN TRUE IF ARR IS EMPTY, FALSE IF NOT.
    public boolean isEmpty(){
        for (int item : arr){
            if (item != 0) {
                return false;
            }
        }
        return true;
    }
    
    //RETURN VALUE AT GIVEN INDEX, RETURN 0 IF INDEX OUT OF BOUNDS.
    public int at(int index){
        try{return arr[index];}
        catch(IndexOutOfBoundsException e){System.out.println("Ese indice no existe.");}
        return 0;
    }
    
    //INCREMENTS SIZE AND RESIZE IF NECESSARY
    private void incrementSize(){
        size++;
        if (size == capacity) {
            resize(arr, capacity*2);
        }
    }
    
    //INSERTS ITEMS AT END.
    public void push(int item){
        if (isEmpty()) {
            arr[0] = item;
        }
        else{
            arr[size] = item;
        }
        incrementSize();
    }
    
    //INSERTS ITEM AT INDEX, SHIFTS THAT INDEX`S VALUE AND TRAILING ELEMTS TO RIGHT.
    public void insert(int index,int item){
        if (index > size) {
            System.out.println("Ese indice no existe, utilice push() para agregar un elemento al final.");
        }
        else{
            moveTo(arr,index,'r');
            arr[index] = item;
            incrementSize();
        }
    }
    
    //MOVE ELEMENTS OF AN ARRAY TO RIGHT OR LEFT DEPENDING ON INPUT
    private void moveTo(int[] arr,int index,char c){
        //MOVES ARRAY ELEMENTS TO RIGHT FROM INDEX (FOR THE INSERT METHOD)
        if (c == 'r') {
            for (int i = size; i > index + 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = 0;
        }
        //MOVES ARRAY ELEMENTS TO LEFT FROM INDEX (FOR THE DELETE METHOD)
        else if (c == 'l'){
            for (int i = index; i < size; i++) {
                arr[i] = arr[i + 1];
            }
        }
    }
    
    //INSERT ITEM AT INDEX 0.
    public void prepend(int item){
        if (isEmpty()) {arr[0] = item;}
        else{insert(0,item);}
    }
    
    //DECREASE SIZE, RESIZE IF NECESSARY
    private void decreaseSize(){
        size--;
        if (size == (capacity/4)) {
            resize(arr, capacity/2);
        }
    }
    
    //REMOVES FROM END AND RETURN THE ITEM.
    public int pop(){
        int aux = arr[size - 1];
        arr[size - 1] = 0;
        decreaseSize();
        return aux;
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
    
    
    private int[] resize(int[] arrToResize, int newSize){
        int[] arr = {0,0};
        return arr;
    }
}
