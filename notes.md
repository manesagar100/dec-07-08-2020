``` ruby
    5.times { puts "Hello world" }
```

* Hardware and Cloud infra began booming
* More and more concurrent code
* Imperative vs Declarative style of coding

### Lambda Expressions

* If you want to understand functional style and Streams in Java 8, Lambda is the starting point
* Lamdas are expressions to implement interfaces 
* JVM generates bytecodes or new classes during runtime

### Interfaces

* interfaces can have __default__ methods with implementation
* have static methods both __private__ and __public__
* the differences between abstract classes and interfaces are thinner right now
* Functional interfaces are those that have ONLY ONE abstract method.


### Built-in functional interfaces

* __java.util.function__ package gives a list of pre-defined functional interfaces
* Predicate, Function, Supplier, Consumer
* Predicate returns a boolean; __filter__ method in Stream API accepts Predicate as arguments
* Function takes any type and returns any type; __map__ method in Stream API accepts Function/BiFunction as arguments
