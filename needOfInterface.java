/*
 1. because we want to keep the code more flexible, want to keep loose coupling the objects.
keeping one parent/main object extending other objects from that parent/main object maintains codibility
 2. in abstract classes, we can declare the main methods; and implementation of extending sub classes will
  have the flexibility of defining/implementing their functions/behaviors
*/

// so instead of abstract class; we can have interface (which are actually collection of abstract methods)

/* abstract class Computer
{
    public abstract void code();
}
*/
interface Computer
{
    void code();
}

// class Laptop extends Computer // instead of extending class, we need to implement class; rest the entire code will remain same
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, run, compile");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, run, compile, faster");
    }
}

class Developer
{
    //public void devApp(Laptop lap)  // passing object of laptop (instance of class) as a parameter in a method
   // it fixes the code; now i cannot give desktop to developer
    public void devApp(Computer sysX)  // passing super class; so later my code becomes flexible
    {
        sysX.code();
        System.out.println("coding");
    }
}

public class needOfInterface {
    public static void main(String a[])
    {
        Computer obj3 = new Laptop();// it does not get dependent on only Laptop; even desktop can be give to code
        Computer obj4 = new Desktop();
        Developer awi = new Developer();
        awi.devApp(obj4);
    }
}