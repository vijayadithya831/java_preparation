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


### Multi-Threading

##### Thread

* A thread is a smallest unit of a task.
* We can run multiple threads at the same time unlike a normal program. And the threads can share the same resources (Resource sharing is done by scheduling algorithms).

The process of running multiple threads at the same time is called multithreading. For that we have to extend the Thread class in our main class (or implement Runnable interface to enable inheritance of other classes for our main class). After the inheritance (or implementation), we have to override the run method present in the Runnable functional Interface.

Even if one of the threads run into an exception during runtime, the other threads will not be affected at all and they proceed to the completion of their individual execution.

##### Race conditions in Threads.

Race condition occurs when muiltiple threads are attempting to change the value if the same variable at the same time.

##### Different States of Threads.

##### Threads, their methods and their purposes.

* start() => used to start a thread (or multiple threads at the same time)
* run() => used to implement what the thread wants to do. Part of the Runnable functional interface.
* join() => waits for the thread to die. Which means, the program just waits until the currently running thread to complete execution before moving on to the next thread. (defeats the whole concept of multithreading) throws InterruptedException, so must handle the exception.
*
