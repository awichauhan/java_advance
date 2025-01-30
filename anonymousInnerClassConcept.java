class B
{
    public void print()
    {
        System.out.println("in B show");
    }
}

public class anonymousInnerClassConcept
{
    public static void main(String a[])
    {
        B obj2 = new B()    // below code of lines are used for method overriding but it does not require any different class
        {                   // it is running anonymously inside "anonymousInnerClassConcept" class
                public void print() {
                System.out.println("in different show");
                }
        };               // remember the semicolon position; which is entered after writing the code block, after object creation
        obj2.print();
    }
}