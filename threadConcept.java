/*
multiple tasks, time sharing: multi-tasking
dividing operations/task into multiple threads (smallest unit)
threads running parallely, are lightweight
 */

class A extends Thread
{
    public void show()
    {
        for(int i=1;i<=10; i++)
        {
            System.out.println("hello");
        }
    }
}

class B extends Thread
{
    public void show1()
    {
        for(int i=1;i<=10; i++)
        {
            System.out.println("hi");
        }
    }
}

public class threadConcept
{
    public static void main(String a[])
    {
        A obj1= new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}