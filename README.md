# Advanced Java
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
It also means the interface has ONLY one abstract method  

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

## Numeric Streams
### IntStream, LongStream abd DoubleStream
These streams are for primitive streams respectively for integer, long and double  

## Numeric Streams Aggregate Functions
sum(), max(), min(), average()

### Boxing()
Converting a primitive to a wrapper class object type is boxing

### UnBoxing()
Converting a wrapper object type to a primitive type is unboxing

### Reference Documentation
For further reference, please consider the following sections:

### mapToObj()
It returns an object valued Stream

### mapToLong()
It returns LongStream consisting of the results of the given function

### mapToDouble()
It returns DoubleStream consisting of the results of the given function

### Joining()
It concatenates the input elements into string in encounter order

### Joining(CharSequence delimiter)
It concatenates the input elements into String separated by the specified delimiter

### Joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
It concatenates the input elements separated by the specified delimiter with specified prefix and suffix in the encounter order  

### Counting()
Count the no of elements in a stream

### Mapping()
Collectors class mapping() method takes a function and collector and creates a new collector which apply  
the function and then collects the mapped elements using the given collectors

### minBy() and maxBy()
minBy returns the collector that produces the minimal elements according to a given comparator  
maxBy returns the collector that produces the maximum elements according to a given comparator

### Collectors.summingInt() and Collectors.averagingInt()
summingInt() returns a collector that constructs sum of the integer valued function applied to input elements  
averagingInt() returns a collector that constructs average of the integer valued function applied to input elements

### groupingBy()
This method provides functionality similar to groupBy in SQL. Output is Map(K,V)
There are 3 factory methods  
groupingBy(classifier)  
groupingBy(classifier, downstream)  
groupingBy(classifier, mapFactory, downstream)  

### Collectors.partitioningBy() 
This method is used to partition a stream of objects based on a given predicate  
Factory methods()  
partitioningBY(predicate) returns the Map<Boolean, List<T>>  
partitioningBY(predicate, downstream) returns the Map<Boolean, List<T>>  

# ParallelStreams
Parallel stream leverages multicore processors resulting in a substantial increase in performance  
This uses fork/join framework  
There are 2 ways to achieve parallel streams  
1. calling parallelStream() on collection
2. Calling parallel() on stream

### Optional  
This class is in util package and help to avoid null checks  
Factory methods are  
### OrElse(), OrElseGet(), OrElseThrow()
OrElse - get the value if present or returns the alternative value  
OrElseGet - get the value or gets the supplier value  
OrElseThrow - throw the exception produced by supplier function or else return the value  

## Hierarchy of interfaces
overloaded/overridden methods are always executed in following order  
First from the class implementing then from the sub interfaces(child interfaces) and then from parent interfaces  

### Instant
An instant is defined as an instant in teh datetime continuum specified as a number of milliseconds from  
1970-01-00.00.00.000000000  
This represents the start of the nanosecond on teh timeline.

## JShell
JShell was introduced in Java 9. It's a interactive tool for learning and prototyping Java code.  
REPL: Read-Evaluate-Print-Loop can help flatten out the learning curve of Java  
It shows the results as we code. The evaluation of code happens as we type.
REPL is used for writing and testing small code snippets  
Intellij gives JShell console built under tools menu. 

### Module System
Java 9 introduced an abstraction layer on top of packages which is called Java Platform Module System  
java --list-modules to list the modules in JDK  

### Try-with-resources
it is a try statement that declares one or more resource(s)  
Resource is an object that must be closed after the program is finished with  
try-with-resource makes sure that the resource is closed  
Resource should implement AutoClosable OR java.io.Closeable  

### Type interference with var
Starting Java 10 we can drop explicitly referring the variable type depending upon whether compiler can infer the type  
Remember class level var(s) is not allowed, only local var as in method  


### Garbage Collection
G1 Garbage first collection algorithm is improved with it's worst case latency (Parallel full GC)  

### Switch Expressions
These are different from switch statements. No boiler plate code, no break statements.

