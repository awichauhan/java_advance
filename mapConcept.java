// maping values to the names instead of index numbers
// key-value pair: map (data structure)
// keys are set; values are list: map combination of set and list

import java.util.*;

public class mapConcept
{
    public static void main(String a[])
    {
        Map<String, Integer> students = new HashMap<>();
        //Map<String, Integer> students = new Hashtable<>(); // synchronized version
        students.put("navin", 56);
        students.put("awantika", 67);
        students.put("awi", 87);
        students.put("navin", 45); // will override above value for key "navin"

        System.out.println(students);   // entire map

        System.out.println(students.get("awi")); // value for one key

        System.out.println(students.keySet());  // print entire key sets

        for (String i: students.keySet())   // iterating over each key
        {
            System.out.println(i);
        }

        for (String i: students.keySet())   // iterating over each key and printing their values using get method
        {
            System.out.println(i + " " + students.get(i));
        }

        for (int k : students.values())  // for printing only values
        {
            System.out.println(k);
        }

    }
}
/*
output:
awantikachauhan@Awantikas-MacBook-Air java_advance % java mapConcept
{awi=87, navin=45, awantika=67}
87
[awi, navin, awantika]
awi
navin
awantika
awi 87
navin 45
awantika 67
87
45
67
 */