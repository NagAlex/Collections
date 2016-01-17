/**
 * Created by NAG on 30.01.15.
 */
import java.util.*;

public interface SetOperations<T> {
    //Two sets are equal if they consist of equal elements
    public boolean equals(Set<? extends T> a, Set<? extends T> b);

    //Union of Sets A and B is the Set, which elements belong to both sets
    public Set<T> union (Set<T> a, Set<T> b);

    //Difference of set A and set B is the set, consist of elements of set A
    //and not consist of elements of set B
    public Set<T> subtract (Set<T> a, Set<T> b);

    //The Intersection of set A and B is the set, which elements belong both sets A and B
    public Set<T> intersect (Set<T> a, Set<T> b);

    public Set<T> simmetricSubtract (Set<T> a, Set<T> b);
}
