Java Fundamentals

**What is java?**
--Java is a high level object oriented programing language.
--Used for Develop java based software applications.
--Developed by Sun Microsystems which is now owned by Oracle Corporation.
--Current version of java is java 23

---------------------------------------------------------------------------------

**What is JVM?**
--java is a abstract computer machine which helps to run the java program or code.
--It is the runtime environment for Java bytecode, ensuring that the same code
can be executed on any platform that has a compatible JVM.

**Components of the JVM:**
1. Class Loader: Loads class files into memory. It verifies the correctness of the
   bytecode and loads classes on demand.
2. Bytecode Verifier: Checks the code fragments for illegal code that can violate
   access rights to objects.
3. Interpreter: Reads and executes bytecode instructions directly.
4. Just-In-Time (JIT) Compiler: Improves performance by converting bytecode into
   native machine code at runtime.
5. Garbage Collector: Manages memory by automatically deleting objects that are
   no longer in use.
6. Runtime: Provides core libraries and other support for running Java applications.
-----------------------------------------------------------------------------------------------

**What is JDK?**
1. JDK (Java Development Kit)
   The JDK is a complete software development kit required to develop Java applications. It
   includes the JRE (Java Runtime Environment), an interpreter/loader (Java), a compiler
   (javac), an archiver (jar), a documentation generator (Javadoc), and other tools needed
   for Java development.
   ● Components of the JDK:
1. Java Compiler (javac): Converts source code written in Java into bytecode
   (.class files) that can be executed by the JVM.
2. Java Runtime Environment (JRE): Provides the libraries, Java Virtual Machine
   (JVM), and other components to run applications written in Java.
3. Java Debugger (jdb): A tool for debugging Java programs.
4. Java Archive (jar): A tool for packaging multiple files into a single archive file.
5. Other Tools: Includes javadoc for generating documentation, javap for class
   file disassembler, and more.

----------------------------------------------------------------------------------------------------------------------------

**What is JRE?**
JRE (Java Runtime Environment)
The JRE provides the libraries, Java Virtual Machine (JVM), and other components to
run applications written in Java. It does not contain development tools like compilers or
debuggers. It is the implementation of the JVM.

**● Components of the JRE:**
1. Java Virtual Machine (JVM): The engine that runs the Java bytecode.
2. Core Libraries: Libraries that provide the basic functionality of the Java
   programming language (e.g., java.lang, java.util).
3. Supporting Files: Configuration files, property files, and other files required to
   run Java programs.

---------------------------------------------------------------------------------------------------------------------

**What is class?**
--Class is a set of instructions or methods.
--Class is bluprint for the object

------------------------------------------------------------------------------------------------------------



**Why Encapsulation?**
Better control of class attributes and methods
Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data
----------------------------------------------------------------------------------------------------------------------------------------

**Abstract Classes and Methods:**

--Data abstraction is the process of hiding certain details and showing only essential information to the user.
--Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).
--The abstract keyword is a non-access modifier, used for classes and methods:

--Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

--Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
--An abstract class can have both abstract and regular methods:

---------------------------------------------------------------------------------------------------------------------------------------------------------------

**Interfaces in Java:**

--Another way to achieve abstraction in Java, is with interfaces.

--An interface is a completely "abstract class" that is used to group related methods with empty bodies:
--To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class:
--Like abstract classes, interfaces cannot be used to create objects
--Interface methods are by default abstract and public.

--Interface attributes are by default public, static and final
--An interface cannot contain a constructor (as it cannot be used to create objects)
--Interface methods do not have a body - the body is provided by the "implement" class


**Why And When To Use Interfaces?**
1) **To achieve security -** hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).

-------------------------------------------------------------------------------------------------------------------------------------------------------------

**Java collection:**
--Any group of individual objects that are represented as a single unit is known as a Java Collection of Objects. 
--In Java, a separate framework named the “Collection Framework” has been defined in JDK 1.2 which holds all the Java Collection Classes and Interface in it.

--In Java, the Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main “root” interfaces of Java collection classes.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------

**There are 4 main interfaces in java collection:**
1) List
2) Set
3) Queue
4) Map

**List Interface:**
--The List Interface in Java extends the Collection Interface and is a part of java.util package. 
--It is used to store the ordered collections of elements. 
--So in a Java List, you can organize and manage the data sequentially.

--Maintained the order of elements in which they are added.
--Allows the duplicate elements.
--The implementation classes of the List interface are **ArrayList**, **LinkedList**, **Stack**, and **Vector**.
--Can add Null values that depend on the implementation.

----------------------------------------------------------------------------------------------------------------------------------

**--ArrayList:**
--Java ArrayList is a part of collections framework and it is a class of java.util package. 
--It provides us with dynamic arrays in Java. 
--Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in array is required. The main advantage of ArrayList is, unlike normal arrays, we don’t need to mention the size when creating ArrayList. 
--It automatically adjusts its capacity as elements are added or removed.

------------------------------------------------------------------

**LinkedList:**
This class is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part.
--The elements are linked using pointers and addresses and each element is known as a node. 
-----------------------------------------------------

**Vector:**
--The Vector class implements a growable array of objects. Vectors fall in legacy classes, but now it is fully compatible with collections. It is found in java.util package and implement the List interface.
---------------------------------------------------------

**Stack:**
Java Collection framework provides a Stack class that models and implements a Stack data structure. The class is based on the basic principle of LIFO(last-in-first-out). In addition to the basic push and pop operations, the class provides three more functions of empty, search, and peek.

The Stack class extends Vector and provides additional functionality specifically for stack operations, such as push, pop, peek, empty, and search.
The Stack class can indeed be referred to as a subclass of Vector, inheriting its methods and properties.
-------------------------------------------------------------------------

**Set Interface:**
The Set Interface is present in java.util package and extends the Collection interface. It is an unordered collection of objects in which duplicate values cannot be stored. It is an interface that implements the mathematical set. This interface adds a feature that restricts the insertion of the duplicate elements.

--------------------------------------------------------------------------

