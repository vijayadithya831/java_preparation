# Core Java Notes

### [Generics](https://www.geeksforgeeks.org/java/generics-in-java/)

Generics is a concept which allows java classes, interfaces and methods with different data types while providing compile-time type safety. We can use Type parameters such as T, K, V, E, (or whatever we want. But ideally, the single letter notatio is used everywhere, so better to use it) etc. as type parameters to generalize the type of parameter our generic implemented class or interface or method will take.

#### Advantages of Generics

* Reduce the need for explicit type casting.
* Allow classes, interfaces, and methods to work with different reference types.
* Help detect incompatible types during compilation.

### [Bound Generics](https://www.geeksforgeeks.org/java/bounded-types-generics-java/)

Bound generics refers to the restrictions we set to the type parameter in the generics. These rules specify which types of classes or interfaces can be passed as type arguments while compile time to limit the code to work on only a specific type (or its subtypes).

###### Notes

* Even if we are specifying an interface to the type parameter as a bound generic, we have to use the extends keyword instead of the implements keyword.
* In case of multiple extensions (extending both a class and an interface), we have to use the `&` symbol. eg.: `public class Printer <T extends Animal & Serializable> {}`. While listing, we can list only one class (should be at the first) and multiple interfaces, all separated by the `&` sign.

### [Wild Cards](https://www.geeksforgeeks.org/java/wildcards-in-java/)

Wildcards in Java Generics allow you to work with unknown types in a flexible and type-safe way. They are represented using the `?` symbol and help in writing reusable code that can handle different generic types.

* Used when the exact type of a generic parameter is not known in advance.
* Commonly applied in method arguments to increase flexibility.
* Helps maintain type safety while working with collections of different types
