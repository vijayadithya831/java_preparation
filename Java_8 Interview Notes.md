# Java 8 Interview Concepts

### Q) Why is Comparator defined as functional interface when it has 2 abstract methods (compare and equals)?

***In the Comparator Functional Interface, only the compare method is the abstract method belonging to the Comparator interface. The equals method belongs to the Object class, and Comparator is simply overriding the existing implementation.***

### Q) Can we extend Functional Interface from another Functional Interface?
***Yes, we can extend a functional interface from another functional interface, but the extending interface doesn't act as a functional interface anymore. Because, that interface will now have 2 abstract methods to provide. And since Functional Interface's whole point is it should contain only one abstract method to provide for implementation, if another functional interface is extended, this doesn;t act as a functional interface anymore.***

### Q) 
***

### Q)
***