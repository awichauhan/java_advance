/*
statement can be normal or critical
 */

public class tryCatchException
{
    public static void main(String a[])
    {
        int i = 0;  // normal statement
        int j =0;

        //int j = 18/i; // critical statement

        // below is the other way to handle the critical statement

        try {
            j = 18/i;
        }
        catch(Exception obj)
        {
            System.out.println("something went wrong");
            System.out.println("something went wrong" + obj);  // printing exception along with catch
        }
        System.out.println(j);

        /*
java_advance % java tryCatchException
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at tryCatchException.main(tryCatchException.java:10)

        EXECUTION STOPS
         */

        System.out.println("bye");
    }
}


