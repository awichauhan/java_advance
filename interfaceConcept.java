// An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods.
// purpose of interfaces is to tell what methods are there but it will not implement it

interface A    // cant be instantiated (like abstract classes);
// dont have their memory in heap so cant have non final variable
{
    int age = 10;    // these variables are by default FINAL and STATIC
    String area = "Mumbai";
    void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X  // inheritance is possible in interface
{

}

class B implements A,Y    // implementing multiple interfaces
/* condition is to have both methods defined in interface;
if you fail to do that; your class will become abstract class */
{
    public void show() {
      System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
    public void run(){
        System.out.println("running");
    }
}

public class interfaceConcept
{
    public static void main(String a[])
    {
        A obj = new B(); //object type of A interface (reference of A type) but object of B; can call methods of A interface
        obj.show();
        obj.config();
        System.out.println(A.age);    // because age is static; i dont need the object of its class/interface;
        // i can directly call it with its class/interface name

        Y obj1 = new B();  // object type of X or Y (Y extends X inf); then only i can call methods of X interface
        obj1.run();
    }
}

/* we had abstract classes concept still we needed interfaces because of below reasons:
1. we could not extend multiple super classes in single sub class
(multiple inheritance of classes is not possible in JAVA)
2.
 */

/* An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods.
A class implements an interface, thereby inheriting the abstract methods of the interface.
Along with abstract methods, an interface may also contain constants, default methods, static methods, and
nested types. Method bodies exist only for default methods and static methods.
Writing an interface is similar to writing a class. But a class describes the attributes and behaviors of an
object. And an interface contains behaviors that a class implements.

Unless the class that implements the interface is abstract, all the methods of the interface need to be defined
in the class.

An interface is similar to a class in the following ways:
         An interface can contain any number of methods.
         An interface is written in a file with a .java extension, with the name of the interface matching the
        name of the file.
         The byte code of an interface appears in a .class file.
         Interfaces appear in packages, and their corresponding bytecode file must be in a directory structure
        that matches the package name.

However, an interface is different from a class in several ways, including:
         You cannot instantiate an interface.
         An interface does not contain any constructors.
         All of the methods in an interface are abstract.
         An interface cannot contain instance fields. The only fields that can appear in an interface must be
        declared both static and final.
         An interface is not extended by a class; it is implemented by a class.
         An interface can extend multiple interfaces.
 */
