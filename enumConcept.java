// named constants are defined under enum

/*
Enums restrict a variable to have one of only a few predefined values.
The values in this enumerated list are called enums.

With the use of enums it is possible to reduce the number of bugs in your code.
 */

enum status{
        Running, Failed, Pending, Success;
}

public class enumConcept {
    public static void main(String a[]) {
        //status s = status.Running;  // to call only one named constant
        status[] all = status.values();  //all is a identifier for array
        //System.out.println(all[1]);    // to print only single value of
        for (status i : all) {
            System.out.println(i + " ");
        }
    }
}