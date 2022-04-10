
package arraysimplementation;

public class Main {

    public static void main(String[] args) {
        Vector v1 = new Vector(5);
        
        System.out.println("Imprimo el vector " + v1);
        System.out.println("Imprimo el size " + v1.size());
        System.out.println("Imprimo el capacity " + v1.capacity());
        for (int i = 0; i < v1.size(); i++) {
            System.out.println("Imprimo los elementos dentro de size[" + i + "]: " + v1.at(i));
        }
        for (int i = 0; i < v1.capacity(); i++) {
            System.out.println("Imprimo los elementos dentro de capacity[" + i + "]: " + v1.at(i));
        }
        System.out.println("Imprimo si esta vacio: " + v1.isEmpty());
        System.out.println("Busco un numero en el array: " + v1.find(3));
        
        for (int i = 0; i < 10; i++) {
            v1.push(i);
        }
        for (int i = 0; i < v1.size(); i++) {
            System.out.println("Imprimo los elementos dentro de size[" + i + "]: " + v1.at(i));
        }
        for (int i = 0; i < v1.capacity(); i++) {
            System.out.println("Imprimo los elementos dentro de capacity[" + i + "]: " + v1.at(i));
        }
    }
    
}
