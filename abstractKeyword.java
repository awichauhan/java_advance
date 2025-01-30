/*
A class which contains the abstract keyword in its declaration is known as abstract class.
 Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )
 But, if a class has at least one abstract method, then the class must be declared abstract.
 If a class is declared abstract, it cannot be instantiated (cannot create its object)
 To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
 If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.

If you want a class to contain a particular method but you want the actual implementation
of that method to be determined by child classes, you can declare the method in the parent
class as an abstract.
 abstract keyword is used to declare the method as abstract.
 You have to place the abstract keyword before the method name in the method declaration.
 An abstract method contains a method signature, but no method body.
 Instead of curly braces, an abstract method will have a semoi colon (;) at the end.

Declaring a method as abstract has two consequences:
         The class containing it must be declared as abstract.
         Any class inheriting the current class must either override the abstract method or
declare itself as abstract.
Note: Eventually, a descendant class has to implement the abstract method
 */


abstract class car
{
   public abstract void drive(); // declaring a method instead of defining (having an abstract idea)
/*
need to declare it as abstract method
abstract method can remain inside abstract class only
 */
    public void playMusic()
    {
        System.out.println("play music");
    }
}

class WagonR extends car     // concrete class
{
    public void drive()
    {
        System.out.println("drive");
    }
}
public class abstractKeyword{
    public static void main (String a[]){
        car obj = new WagonR();    // cannot create an object of abstract class
        obj.playMusic();
        obj.drive();
    }
}