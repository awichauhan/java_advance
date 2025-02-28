// unordered and non-duplicate collection (collection of unordered-unique values)
// do not have index values
import java.util.*;

public class setCollection
{
    public static void main(String a[])
    {
        Set<Integer> setNo = new HashSet<Integer>(); // HashSet gives unordered
        // Set<Integer> setNo = new TreeSet<Integer>(); // gives ordered set
        //Collection<Integer> setNo = new TreeSet<Integer>();  // even this works
        //Iterator<Integer> setNo = new.iterator();   // Iterator is above collection interface
        setNo.add(2);
        setNo.add(9);
        setNo.add(4);
        setNo.add(2);

        for(int i: setNo)
        {
            System.out.println(i);
        }

    }
}

/*
output here is non-duplicate and unordered:
awantikachauhan@Awantikas-MacBook-Air java_advance % java setCollection
2
4
9

 */