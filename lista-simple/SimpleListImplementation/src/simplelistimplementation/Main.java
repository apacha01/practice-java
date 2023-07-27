
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
        
        System.out.println(sl.popBack());
        System.out.println(sl.popBack());
        System.out.println(sl.popBack());
        
        System.out.println(sl.front());
        System.out.println(sl.back());
        
        printD();
        
        sl.insert(1, 1000);
        sl.insert(4, 1500);
        sl.insert(3, 2);
        sl.insert(0, 15);
        
        printD();
        
        sl.erase(3);
        sl.erase(5);
        sl.erase(0);
        
        printD();
        
        System.out.println(sl.valueNfromEnd(0));
        System.out.println(sl.valueNfromEnd(2));
        System.out.println(sl.valueNfromEnd(5));
        
        sl.reverse();
        
        printD();
        
        sl.removeValue(1500);
        
        printD();
    }
    
    
    public static void printD(){
        System.out.println("SIZE: " + sl.size());
        for (int i = 0; i < sl.size(); i++) {
            System.out.println("ITEM [" + i + "]: " + sl.valueAt(i));
        }
    }
}
