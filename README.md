# CoreJava
Some Concepts about Abstract Class-:
we can make constuructor of abstract class , It means of any class's constructor executed it means we cam make object of that class.
so we can object of abstract class in it's child class,

## Let's Talk about private constructor in any class.
<p> If a class has a private constructor, it means that the constructor can only be accessed within the class and cannot be used to create an object of the class from outside the class. However, there are some ways to create an object of a class with a private constructor from another class:
<p>
 
***1. Use a public static factory method:***
 <n> A factory method is a method that returns an object of the class. Since the method is public, it can be accessed from another class, and since it's static, it can create an object without needing to call the constructor directly. The factory method can call the private constructor and return an object of the class.</n>
</n>Example
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

**Example**
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

 
