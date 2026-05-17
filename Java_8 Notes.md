# Java 8 Notes

## Subtopics

1. Functional Interfaces and Predefined Functional Interfaces.
2. Method References and its Types
3. Optional Class
4. Default and Static methods in an interace.
5. Stream API's

### [Functional Interface](https://www.geeksforgeeks.org/java/java-functional-interfaces/)

* An interface which contains only one abstract method.
* Can contain any number of abstract and default methods, but can contain only one abstract method.

### [Lambda Expressions](https://www.geeksforgeeks.org/java/lambda-expressions-java-8/)

* Lambda Expression facilitates functional programming in java.
* Lambda Expression is an anonymous function. It is a function without a name, and does not belong to any class.
* It is mainly used to implement Functional Interfaces.
* We can pass lambda expressions as method parameters.

`For code reference for functional interface and lambda expressions. refer MyFuncInterfaceImpl.java`

##### Method vs Lambda


| Method                       | Lambda                                                                                                                                                                                      |
| ---------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Should Have a name           | Doesnt need a name                                                                                                                                                                          |
| Should have a parameter list | Defined in interface, must follow that pattern                                                                                                                                              |
| Should have a body           | Should have a body                                                                                                                                                                          |
| Should have a Return type    | No need to mention the return type, but may or may not return a value, based on the method signature in the interface. Also, Java 8+ compiler infers the return type of the implementation. |

##### Lambda Syntax

`() -> {}`
