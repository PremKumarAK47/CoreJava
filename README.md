# CoreJava
Some Concepts about Abstract Class-:
we can make constuructor of abstract class , It means of any class's constructor executed it means we cam make object of that class.
so we can object of abstract class in it's child class,

## Let's Talk about private constructor in any class.
<p> If a class has a private constructor, it means that the constructor can only be accessed within the class and cannot be used to create an object of the class from outside the class. However, there are some ways to create an object of a class with a private constructor from another class:
<p>
 
### 1. Use a public static factory method:
 <n> A factory method is a method that returns an object of the class. Since the method is public, it can be accessed from another class, and since it's static, it can create an object without needing to call the constructor directly. The factory method can call the private constructor and return an object of the class.</n>
</n>

**Example-:**

```Java Example
public class MyClass {
  private MyClass() {
    // private constructor
  }

  public static MyClass createMyClass() {
    return new MyClass();
  }
}

public class AnotherClass {
  public void doSomething() {
    MyClass myObj = MyClass.createMyClass();
    // use myObj here
    //Here how are you going to use
  }
} 
```
### 2.Use reflection:
Reflection allows you to access and modify the behavior of a class at runtime. You can use reflection to access the private constructor and create an object of the class.

**Example-:**
``` Java
public class MyClass {
  private MyClass() {
    // private constructor
  }
}

public class AnotherClass {
  public void doSomething() throws Exception {
    Constructor<MyClass> constructor = MyClass.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    MyClass myObj = constructor.newInstance();
    // use myObj here
  }
}

```
## Concept About Abstract Class
<p>



we make Abstract class to hide the implementation of the procedure
and showing the functionality to user, abstract class have everything 
which have the a normal class,like constructor implementation and much more thing 

Then Question arises why do we make abstract class ?
 </n>
Suppose there are many classes which has some common functionality then if we
want with them all, so we have to solution either 
1-we write every functionality in that classes every time.
2- we can write once and use no. of times we want
so make a super class of all  of them as abstract class and extend them in all
if some property is same but functionality is different then make that method 
abstract and inherit them in all and define accordingly. 
for example -:
there is Super class Animal-
there are some more animals like dog cat lion and many more then all have common
functionality like eat, Sleep, walk, but everyone have different noise
so in animal class define all method and make one abstract method makeNoise 
and inherit in all class and define accordingly 
that is the use of abstract class and abstract method. </n>





 * Here if you notice that there is a relationship stabilized is called
 * Parent class reference and child class object
 * By this we can call all the  method of parent class or the method which 
 * are overridden in the child class.
 * If we want to call the child's specific method then we need to downcast the
 * child class object and hold into the child class variable
 * then we can call,
 
</p> 

## Why Can't we make object of the Abstract Class if we can make Constructor of That class ?

***If we can make constructor of any class it means we can make object of that class but we can make constructor of abstract class then why can't we make object that abstract class ?***


</n>
An abstract class is a class that cannot be instantiated directly, meaning you cannot create an object of an abstract class using the new keyword. This is because an abstract class is typically used to provide a blueprint or template for other classes to extend or implement.

An abstract class may have a constructor, but it is used only to initialize the variables or members of the abstract class or its subclass. When you create an instance of a subclass that extends the abstract class, the constructor of the subclass will invoke the constructor of the abstract class as part of the instantiation process.

The reason why you cannot create an instance of an abstract class directly is because it may contain abstract methods that do not have an implementation in the abstract class. These abstract methods must be implemented in a subclass, which means that the subclass must provide its own implementation of these methods. Therefore, an object of an abstract class does not make sense since it may have incomplete functionality.

In summary, you can create a constructor for an abstract class to initialize its members, but you cannot create an object of an abstract class directly because it is incomplete without the implementation of its abstract methods in a subclass. </n>

# Interface in Java -:
</n> 
An interface in programming is a contract that specifies a set of methods that a class must implement. It defines a set of rules that a class must follow to be considered compatible with the interface.

There are two main types of interfaces:

**1. Simple or Marker Interfaces:** These interfaces do not contain any method declarations. They are used to mark a class as implementing a specific behavior or capability. For example, the Serializable interface in Java is a marker interface used to indicate that a class can be serialized.

**2. Functional Interfaces:** These interfaces contain a single abstract method and are used to define functional behavior. They are commonly used with lambda expressions in Java to create functional programming constructs. For example, the java.util.function.Predicate interface is a functional interface that defines a single method for testing a condition.

</n>

</n>

## Type of Methods avilable in Interface :

There are several types of methods that can be defined in an interface:

**Abstract methods:**  These are methods that are declared in the interface but do not have any implementation. The implementation is provided by the classes that implement the interface.

**Default methods:**  These are methods that are declared with a default implementation in the interface itself. They can be overridden by the implementing class, but the default implementation is used if no implementation is provided.

**Static methods:** These are methods that are declared as static in the interface and can be called without creating an instance of the interface.

**Private methods:** These are methods that are declared as private in the interface and can only be called from within the interface itself. They are used to provide implementation details for other methods in the interface.
</n>



# Difference between Array List and Vector

***ArrayList and Vector are both classes in the Java Collection framework that provide dynamic arrays, but there are some differences between the two:***
Thread-Safety: Vector is thread-safe, meaning that it is synchronized and multiple threads can access it simultaneously without causing data inconsistency. ArrayList is not thread-safe, and if multiple threads try to modify it simultaneously, it can result in data inconsistency.

Performance: ArrayList performs better than Vector in most cases, as Vector's synchronization adds overhead and can slow down the performance.

Capacity: When a Vector is created, it has a default capacity and when the capacity is reached, it automatically increases its size by a certain amount. In contrast, when an ArrayList is created, it has a default capacity but when that capacity is exceeded, it doubles its size.

Legacy: Vector is a legacy class and is rarely used in modern Java development, while ArrayList is a newer class and is widely used.

</n> In summary, if thread safety is not a concern and performance is important, then ArrayList is a better choice. However, if thread safety is a requirement or if the application is older and requires compatibility with older versions of Java, then Vector may be a better choice.</n>


**Example Of ArrayList**
```java
import java.util.ArrayList;

public class ArrayListExample {
   public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<String>();
      
      // Add elements to the ArrayList
      list.add("apple");
      list.add("banana");
      list.add("orange");
      
      // Print the ArrayList
      System.out.println("ArrayList: " + list);
   }
}
```

**Example Of Vector**

```java
import java.util.Vector;

public class VectorExample {
   public static void main(String[] args) {
      Vector<String> vec = new Vector<String>();
      
      // Add elements to the Vector
      vec.add("dog");
      vec.add("cat");
      vec.add("bird");
      
      // Print the Vector
      System.out.println("Vector: " + vec);
   }
}
```
## Serializablity In Java
</n>
In Java, serializable is an interface that marks a class as being able to be converted into a stream of bytes, which can then be saved to a file, sent over a network, or otherwise transmitted or stored.

To make a class serializable, it must implement the Serializable interface. This interface doesn't have any methods; it's simply a marker interface.

**Here's an example of a class that implements Serializable:**

</n>

```java
import java.io.Serializable;

public class MyClass implements Serializable {
    private int myInt;
    private String myString;

    public MyClass(int myInt, String myString) {
        this.myInt = myInt;
        this.myString = myString;
    }

    public int getMyInt() {
        return myInt;
    }

    public String getMyString() {
        return myString;
    }
}

```

Once a class is marked as serializable, objects of that class can be saved to a file using an ObjectOutputStream and later retrieved using an ObjectInputStream. For example:

```java
MyClass obj = new MyClass(42, "Hello, world!");
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myfile"));
oos.writeObject(obj);
oos.close();

ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myfile"));
MyClass obj2 = (MyClass)ois.readObject();
ois.close();

System.out.println(obj2.getMyInt()); // prints 42
System.out.println(obj2.getMyString()); // prints "Hello, world!"

```

Note that all fields of the class that are to be saved must either be primitive types or implement Serializable themselves. If a field does not meet this requirement, it must be marked as transient, which means it will not be saved to the output stream.

## Threading and Multithreading




