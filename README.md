# CoreJava
Some Concepts about Abstract Class-:
we can make constuructor of abstract class , It means of any class's constructor executed it means we cam make object of that class.
so we can object of abstract class in it's child class,

## Let's Talk about private constructor in any class.
<p> If a class has a private constructor, it means that the constructor can only be accessed within the class and cannot be used to create an object of the class from outside the class. However, there are some ways to create an object of a class with a private constructor from another class:<p>
 
  1. Use a public static factory method:  
 <n> A factory method is a method that returns an object of the class. Since the method is public, it can be accessed from another class, and since it's static, it can create an object without needing to call the constructor directly. The factory method can call the private constructor and return an object of the class.</n>
