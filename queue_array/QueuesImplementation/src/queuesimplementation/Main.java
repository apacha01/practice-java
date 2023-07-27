
package queuesimplementation;

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue();
        
        for (int i = 0; i < 22; i++) {
            q.enqueue(i);
        }
        
        System.out.println(q.empty());
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento: " + q.dequeue());
        }
        
        for (int i = 0; i < 10; i++) {
            q.enqueue(i+52);
        }
        
        System.out.println();
        
        for (int i = 0; i < 22; i++) {
            System.out.println("Elemento: " + q.dequeue());
        }
        
        System.out.println(q.empty());
    }
    
}
