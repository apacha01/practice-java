
package arraysimplementation;

public class Main {
    static Vector v1;
    public static void main(String[] args) {
        v1 = new Vector(5);
        
        System.out.println("Imprimo el vector " + v1);
        System.out.println("Imprimo el size " + v1.size());
        System.out.println("Imprimo el capacity " + v1.capacity());
        
        printData();
        
        System.out.println("Imprimo si esta vacio: " + v1.isEmpty());
        System.out.println("Busco un numero en el array: " + v1.find(3));
        
        for (int i = 0; i < 10; i++) {
            v1.push(i);
        }
        
        printData();
        
        System.out.println("Imprimo si esta vacio: " + v1.isEmpty());
        System.out.println("Busco un numero en el array: " + v1.find(3));
        
        System.out.println(v1.pop());
        printData();
        
        System.out.println("BORRANDO");
        for (int i = 0; i < 3; i++) {
            v1.delete(i);
        }
        
        printData();
        
        System.out.println("INSERTANDO");
        for (int i = 5; i > 3; i--) {
            v1.insert(i, i);
        }
        
        System.out.println("AGREGANDO AL FINAL");
        for (int i = 0; i < 10; i++) {
            v1.push(3);
        }
        
        printData();
        
        System.out.println("ELIMINANDO LOS 3");
        v1.remove(3);
        
        v1.pop();
        v1.pop();
        
        printData();
        
    }
    
    static void printData(){
        for (int i = 0; i < v1.size(); i++) {
            System.out.println("Imprimo los elementos dentro de size[" + i + "]: " + v1.at(i));
        }
        for (int i = 0; i < v1.capacity(); i++) {
            System.out.println("Imprimo los elementos dentro de capacity[" + i + "]: " + v1.at(i));
        }
    }
    
}
