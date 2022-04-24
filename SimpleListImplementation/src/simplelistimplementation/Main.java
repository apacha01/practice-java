
package simplelistimplementation;


public class Main {
    static SimpleList sl;
    public static void main(String[] args) {
        sl = new SimpleList();
        
        for (int i = 0; i < 5; i++) {
            sl.pushFront(i);
            sl.pushBack(i+6);
        }
        
        printD();
        
        System.out.println(sl.popFront());
        System.out.println(sl.popFront());
        System.out.println(sl.popFront());
        
        printD();
    }
    
    
    public static void printD(){
        System.out.println("SIZE: " + sl.size());
        for (int i = 0; i < sl.size(); i++) {
            System.out.println("ITEM [" + i + "]: " + sl.valueAt(i));
        }
    }
}
