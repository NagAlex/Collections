/**
 * Created by NAG on 30.01.15.
 */
import java.util.*;

public class MySet <T> implements SetOperations<T> {

    public boolean equals(Set<? extends T> a, Set<? extends T> b){
        return a.equals(b);
    }

    public Set<T> union (Set<T> a, Set<T> b){
    	//Creating new Set, so that original sets stay unchanged
        HashSet<T> tmpSetA = new HashSet<T>();
        tmpSetA.addAll(a);
        tmpSetA.addAll(b);
        return tmpSetA;
    }

    public Set<T> subtract (Set<T> a, Set<T> b){
    	//Creating and returning new Set, so that original sets stay unchanged
        HashSet<T> tmpSetA = new HashSet<T>();
        tmpSetA.addAll(a);
        tmpSetA.removeAll(b);
        return tmpSetA;
    }


    public Set<T> intersect (Set<T> a, Set<T> b){
        HashSet<T> tmpSetA = new HashSet<T>();
        tmpSetA.addAll(a);
        tmpSetA.retainAll(b);
        return tmpSetA;
    }

    public Set<T> simmetricSubtract (Set<T> a, Set<T> b){
        return union(subtract(a, b), subtract(b, a));
    }

}
