import java.util.*;

public class collectionApiConcept
{
    public static void main(String a[])
    {
        //Collection nums = new ArrayList(); // not defining data type, so the no being passed to it are objects
        Collection<Integer> nums = new ArrayList();   // defining integer type so that we can iterate over
        nums.add(2);
        nums.add(4);
        nums.add(9);

        for (int i : nums)     // to iterate and store its value in int variable i; print each element
        {
            System.out.println(i);
        }
        // System.out.println(nums);

        List<String> listNo =new ArrayList<String>(); // to use index (get) method; we need link interface not collection
        listNo.add("awi");
        listNo.add("mona");
        listNo.add("awantika");

        System.out.println(listNo.get(2));   // printing the value at index 2
        System.out.println(listNo.indexOf("awi"));   // to print the index value of awi
    }
}

// while working with collections; define the type