
package queuesimplementation;

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue();
        
        for (int i = 0; i < 10; i++) {
            q.enqueue(i);
        }
        
        System.out.println(q.empty());
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento [" + i + "]: " + q.dequeue());
        }
        
        System.out.println(q.empty());
    }
    
}
