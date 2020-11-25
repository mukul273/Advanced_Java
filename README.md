# Advanced_Java
Advanced Java course covering Java 8 through Java 13

### Imperative programming:  
This programming approach is about how a program should be executed step by step

### Declarative programming:  
This approach is about not necessarily how but what should be executed

### What is Lambda expression:
Lambda expression is an anonymous function without a name that doesn't belong to any class.

    Method                  |           Lambda Expression
    ------------------------------------------------------
    Name                    |           No Name
    Parameters List         |           Parameters list
    Body                    |           Body (main part)
    return type             |           No return type(JVM infers the return type by scanning the code)               
    
    General Syntax
    ()              ->          { }
    Lambda         Arrow        Lambda 
    Input          denoting     Body
    Parameters     Lambda

Any interface with Single Abstract method is a functional interface and implementation may be treated as lambda expression

```@FunctionalInterface``` annotation denotes that method can be treated as lambda expression.  
Functional interface have default and static methods which have an implementation  

### Consumer interface: 
It is a part of java.util.function package  
It takes one argument and produces the result, it doesn't return any result  

### BiConsumer Interface
It takes two arguments, BiConsumer does not return value. 

### Predicate interface:  
It's a single argument function that returns true or false

### BiPredicate interface:  
It's a functional interface which accepts two argument and returns Boolean value.  
Apply business logic for the values passed as an argument and return the boolean value.

### Function Interface
It takes one argument and produces results.

### BiFunction Interface
It takes two arguments and produces results.  
While declaring BiFunction we need to tell what type of argument will be passed and what will be 
return type. We can apply our business logic with those two values and return the result.

### UnaryOperator Interface
It's an interface where the operand and result are of same type. It extends from Function interface.
There are IntUnaryOperator, LongUnaryOperator and DoubleUnaryOperator types.

## BinaryOperator Interface
It takes two params and return single value  
Both params must be of same type so is return type  
Generally used for mathematical use cases  
IntBinaryOperator, LongBinaryOperator, DoubleBinaryOperator are specific interfaces  

### Supplier Interface
This is opposite of Consumer Interface  
This is a factory interface  

### Method reference
Each time if the lambda expression is referring the method then it can be relaced with method reference  
For e.g: String -> System.out.print(str) can be replaced like System.out::print  
Types:  
Class:: staticMethod() // Reference to static method
object::instanceMethod // Reference to an instance method
Class::new // Reference to constructor

### Variable scope
The body of lambda has same scope as nested block  
We can't declare param name to lambda function and local var name as same  
Effect Final: This means that local var can't be modified in the lambda function even though they are   
not declared as final  

### Stream
Stream is a sequence of objects that support various methods and can be pipelined to produce result  
Stream supports Map-reduce-filter transformation on collection  
** Streams are effective only when terminating operation is executed. For e.g. .collect(...)  


    Collection                  |           Streams
    --------------------------------------------------------------
    Used for storing and        | Used for performing operation on 
    grouping the data           | input from collection
                                |
    Can add/remove elements     | Can't add/remove elements
                                |
    Have to be iterated         | Streams are internally iterated
    Externally                  |

    Can be traversed multiple   | Streams are traversed only once
    times                       |
    
    Eagerly constructed         | Lazy construction
    E.g. List, map, Set,        | e.g. Filtering, mapping, reduce

Debugging the Stream can be done in two ways:
1. Run the code in debug mode and then open up the "Trace Current Stream Chain" option (Intellij)  
2. use peek() to check the state of that stream at that point  

### MAP
1. It converts stream of x to stream of y  
2. It's a internmediate operation and return stream as method return  

### FlatMap  
1. It's a combination of MAP and Flat operation,
2. Used for flatten the stream,

#### distinct()
Method to filter or collect all distinct elements from the collection
#### count()
Returns the count of elements in the stream
#### sorted()
Sorted order of elements based on natural order
#### anyMatch()
returns whether any element of this stream match the provided predicate
#### allMatch()
return whether all elements of this stream match the provided predicate
#### noneMatch()
returns whether no elements of this stream match the provided predicate
#### filter(Predicate)
Stream filter with Predicate argument returns the stream of elements matching the given predicate  
** This filter is lazy operation meaning, filter doesn't actually perform any filtering 
but instead creates a new stream that when traversed contains the elements of the initial stream 
that matches the predicate  

## Reduce
Reduce the repeated process of combining all elements  
It takes an input of elements and combines them into single result by combining operations  
like sum, multiplication, division etc.  
T reduce(identity, BinaryOperator)  
Optional reduce(BinaryOperator)  

Optional is a container object which may or may not contain a non-value  

#### limit()
It takes one (long) argument and returns the stream of size number more than n

#### skip(s)
It takes one long (n) as argument and returns a stream after removing first n elements  

#### findFirst()
It returns an Optional Object containing first element of the stream OR an empty Optional  
Object

#### findAny()
It returns an Optional Object containing any one element of the stream OR an empty Optional 
Object  

Factory Methods  
#### of()  
Used for creating stream from similar type of data  

#### Iterate()
Used to generate an infinite sequential ordered stream produced by  
iterative application of the provided UnaryOperator. The seed is initial element of iteration.  

#### generate()
Used to generate an infinite sequential unordered stream where each element is  
generated by the provided Supplier.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/gradle-plugin/reference/html/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)