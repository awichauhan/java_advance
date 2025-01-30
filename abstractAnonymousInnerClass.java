abstract class B         // cant instantiate abstract class
{
    abstract public void print(); // can have multiple abstract methods that can be implemented via anonymous innner class
}

public class abstractAnonymousInnerClass
{
    public static void main(String a[])
    {
        B obj2 = new B()   // instantiating below anonymous class and not abstract class B defined above
        {
            public void print()
            {
                System.out.println("in different show");
            }
        };
        obj2.print();
    }
}