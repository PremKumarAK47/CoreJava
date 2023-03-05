package consForAbstract;

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