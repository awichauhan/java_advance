class outerDemo                    //outer class
{
    int age;
    public void show()
    {
        System.out.println("in show");

    }
    //class innerDemo //inner class; we can define inner class as static so that we dont have to create its object to call it
    static class innerDemo
// without static keyword means that it is non-static class which requires the object of its upperclass
    {
       public void config()
       {
           System.out.println("in config");
       }
    }
}

public class innerClass
{
    public static void main(String a[])
    {
        outerDemo obj = new outerDemo();
        obj.show();

        //outerDemo.innerDemo obj1 = obj.new innerDemo(); //syntax to call inner class (non-static); we need object of outer class
        outerDemo.innerDemo obj1 = new outerDemo.innerDemo();// as we have declared inner class as static
        obj1.config();
        //outerDemo.innerDemo.config();    // if we declare config method also as static
    }
}

// you cannot make outer class STATIC