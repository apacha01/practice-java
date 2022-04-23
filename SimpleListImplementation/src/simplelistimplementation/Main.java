
package simplelistimplementation;


public class Main {

    public static void main(String[] args) {
        SimpleList sl = new SimpleList();
        
        sl.pushFront(10);
        sl.pushFront(11);
        sl.pushFront(16);
        sl.pushFront(52);
        
        System.out.println(sl.size());
    }
    
}
