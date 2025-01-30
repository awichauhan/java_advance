class outerDemo
{
    int age;
    public void show()
    {
        System.out.println("in show");
    }

    public String show(String msg)              // method overloading done within same class
    {
        return msg;
    }
    static class innerDemo
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}

class outerDemo2 extends outerDemo           // for method overriding we need different classes
{
    public void show()
    {
        System.out.println("in different show");
    }
}

public class methodOverloadingOverriding
{
    public static void main(String a[])
    {
        //outerDemo obj = new outerDemo();
        outerDemo obj = new outerDemo2(); // method overriding by creating object of outerDemo2 but reference/object type of outerDemo
        obj.show();
        //String output = obj.show("hello");   // to print the output of above coded method overloading
    }
}