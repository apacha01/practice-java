
package simplelistimplementation;


public class Main {
    static SimpleList sl;
    public static void main(String[] args) {
        sl = new SimpleList();
        
        sl.pushFront(10);
        sl.pushFront(11);
        sl.pushFront(16);
        sl.pushFront(52);
        
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
