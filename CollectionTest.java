import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
        MySet<Integer> myInt = new MySet<Integer>();
        HashSet<Integer> hsInt1 = new HashSet<Integer>();
        HashSet<Integer> hsInt2 = new HashSet<Integer>();
        HashSet<Integer> hsInt3 = new HashSet<Integer>();

        for(int i=0; i<10; i++) {
            hsInt1.add(i);
            hsInt3.add(i);
        }
        for(int i=5; i<15; i++)
            hsInt2.add(i);

        System.out.println("Set A: " + hsInt1);
        System.out.println("Set B: " + hsInt2);
        System.out.println("Set C: " + hsInt3);
        System.out.println("A = B: " + myInt.equals(hsInt1, hsInt2));
        System.out.println("A = C: " + myInt.equals(hsInt1, hsInt3));
        System.out.println("A + B: " + myInt.union(hsInt1, hsInt2));
        System.out.println("A - B: " + myInt.subtract(hsInt1, hsInt2));
        System.out.println("B - A: " + myInt.subtract(hsInt2, hsInt1));
        System.out.println("A * B: " + myInt.intersect(hsInt1, hsInt2));
        System.out.println("(A-B) + (B-A): " + myInt.simmetricSubtract(hsInt1, hsInt2));
        System.out.println("Set A: " + hsInt1);
        System.out.println("Set B: " + hsInt2);
    }
}
