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
* A method in a functional interface is by default abstract, so we dont need to explicitly mention the abstract keyword in an interface.

#### The 4 main Functional Interfaces

* Function< T,R > => This interface has the method apply(T t) with return type R. Which means, it takes the input of type T and returns the value of type R. eg., if the interface is declared as Function<String, Integer>, the apply method takes the input parameter of type String and returns the output of type Integer.
* Consumer< T > => this interface has the method accept(T t). Which means it takes the input of type T and return nothing. So the accept method would be of the return type 'void'.
* Supplier < T > => this interface has the method get(). This get method does not require any input, but returns the value of the type T.
* Predicate< T > => this interface has the method test(T t). Which means it takes the input of type T and returns the boolean output. We can pass a string and define a condition in the method implementation so that the test method tests whether the given input string passes the condition or not, hence returning the boolean result.
* For more Functional Interfaces present in java, [Click Here](https://www.educative.io/answers/a-list-of-all-the-functional-interfaces-in-java)

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

### [Multi-Threading](https://www.geeksforgeeks.org/java/multithreading-in-java/)

##### Thread

* A thread is a smallest unit of a task.
* We can run multiple threads at the same time unlike a normal program. And the threads can share the same resources (Resource sharing is done by scheduling algorithms).

The process of running multiple threads at the same time is called multithreading. For that we have to extend the Thread class in our main class (or implement Runnable interface to enable inheritance of other classes for our main class). After the inheritance (or implementation), we have to override the run method present in the Runnable functional Interface.

Even if one of the threads run into an exception during runtime, the other threads will not be affected at all and they proceed to the completion of their individual execution.

##### Race conditions in Threads.

Race condition occurs when muiltiple threads are attempting to change the value if the same variable at the same time.

If we have a situation which can end in a race condition, we can use synchronized keyword to the method we call to avoid race conditions. synchronized keyword makes sure that only one thread will be accessing the resources while forcing the other thread to wait.

##### Different States of Threads.

* **New**
* **Runnable**
* **Running**
* **Waiting/Block**
* **Dead**

##### Methods that change the state of the threads.

* start() -> new to runnable
* run() -> runnable to running
* sleep(), wait() -> running to waiting/block
* notify() -> waiting to runnable
* stop() -> running and runnable to dead

##### Threads, their methods and their purposes.

* start() => used to start a thread (or multiple threads at the same time)
* run() => used to implement what the thread wants to do. Part of the Runnable functional interface.
* join() => waits for the thread to die. Which means, the program just waits until the currently running thread to complete execution before moving on to the next thread. (defeats the whole concept of multithreading) throws InterruptedException, so must handle the exception.
* sleep() => gives the thread a buffer time before running again. We can set a fixed time in between two continuous thread calls using sleep method.
* wait() and notify() => used to change the thread in to waiting state indefinitely until woken up again. While we are using wait() method, we gotta use notify() on the thread to wake up from waiting state. notify method will shift the thread from waiting to runnable state.
* stop() => used to stop the thread from executing further. this method forces the thread into dead state.

### [Method References](https://www.geeksforgeeks.org/java/java-method-references/)

* Method reference is used to refer a method in a functional interface.
* It is a compact and easy form of lambda expression.
* Each time a lambda expression is used just to refer a method, then this method reference can be used instead.

##### Types of method references.

1. **Method Reference To Static Method** => Syntax: Class::staticMethodName
2. **Reference to an instance method of a particular object** => Syntax: Object::instanceMethodName
3. **Reference to an instance method of an arbitrary object of specific type** => Syntax: Class::instanceMethodName
4. **Reference to a constructor** => Syntax: ClassName::new

##### Further notes on method references

* Implementing method references for static method is easy.. just remove the lambda parameters and just use :: instead of . while calling the method.
* Implementing method references for instance method of an object is a bit confusing. There are some rules. While implementing, the functional interface which we are referring should contain the exact method signature as the instance method belonging to the class which we are accessing with the help of an object.
* Implementing method reference to an instance method of an arbitrary object is nothing but accessing the methods of the predefined clases in java with the object created of that specific type. eg, `String s1 = "Hello"; Function<String, String> print = (s1) -> s1.toUpperCase();` the lambda part can be rewritten as, `Function<String, String> print = String::toUpperCase` It is because, the lambda is accepting one parameter and applying toUpperCase() method to that parameter and returning the value. So, instead of lambda, it can be replaced with method reference.

### [Optional Class](https://www.geeksforgeeks.org/java/java-8-optional-class/)

* Java 8 has introduced Optional class in java.util package to handle NullPointerException elegantly.
* This class can help in avoiding null checks and NullPointerException exceptions.
* You can view Optional as a single-value container that either contains a value or doesn't (then, it is said to be empty).
* Optional is a final class, meaning, we cannot extend optional class.

Note to self: Optional class is NOT a replacement for any collections framework members. In fact, Optional itself isn't a member of the collections framework in java. It can contain at most one value or empty.

##### Static Methods in optional class

1. Optional.of(value) -> This method takes a value of any type, stores in an Optional object and returns the same to the variable when called. value should not be null, otherwise NullPointerException is thrown.
2. Optional.empty() -> This method basically returns the new object of the optional class. If we print the empty object, Optional class's toString method is called and "Optional.empty" is written to the console.
3. Optional.ofNnullable(value) -> As the name suggests, this class can choose between returning an empty Optional object or an Optional object holding some value based on the argument given to it. If the value is null, then Optional.empty, otherwile new Optional<>(value) is returned. It does not throw NullPointerException if null is passed as argument.

##### Non-static Methods in optional class

1. get() -> This method is applied to an object of the Optional class. It is used to retrieve the contents of the optional object.
2. orElse() -> This method is applied to an object of the Optional class. It takes a parameter of type Object. It is used when we dont know whether the optional contains a null value or not. If the optional has the value, then the value is returned. If the value is null, then the passed param of type Object is returned.
3. orElseGet() ->  This method is applied to an object of the Optional class. It takes a Supplier functional interface as parameter.  It is used when we dont know whether the optional contains a null value or not. If the optional has the value, then the value is returned. If the value is null, then the supplier functional interface which can be passed as lambda, constructs the default value inside it (or returns it directly) can be returned.
4. orElseThrow() ->  This method is applied to an object of the Optional class. It takes Supplier functional interface as parameter, which must throw an exception (existing or custom) if the value in the optional is null.
5. isPresent() ->  This method is applied to an object of the Optional class. It checks whether the value inside the Optional is null and returns the boolean equivalant accordingly.
6. ifPresent() ->  This method is applied to an object of the Optional class. It takes Consumer functional interface as parameter, which takes the value inside the optional as the lambda object and executes the void method defined in the lambda. Key difference is, the lambda inside the ifPresent method is executed when and only when the value inside the optional is not null.
7. filter() ->  This method is applied to an object of the Optional class. It takes Predicate functional interface as parameter, which determines whether a condition is satisfied or not which is implemented in the lambda.
