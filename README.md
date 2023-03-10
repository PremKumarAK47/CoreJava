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
##Concept About Abstract Class
<p>


/*
we make Abstract class to hide the implementation of the procedure
and showing the functionality to user, abstract class have everything 
which have the a normal class,like constructor implementation and much more thing 

Then Question arises why do we make abstract class
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
that is the use of abstract class and abstract method.

*/


/*
 * Here if you notice that there is a relationship stabilized is called
 * Parent class reference and child class object
 * By this we can call all the  method of parent class or the method which 
 * are overridden in the child class.
 * If we want to call the child's specific method then we need to downcast the
 * child class object and hold into the child class variable
 * then we can call,
 */
</p> 

# Difference between Array List and Vector
