Java Fundamentals

What is java?
--Java is a high level object oriented programing language.
--Used for Develop java based software applications.
--Developed by Sun Microsystems which is now owned by Oracle Corporation.
--Current version of java is java 23

---------------------------------------------------------------------------------

What is JVM?
--java is a abstract computer machine which helps to run the java program or code.
--It is the runtime environment for Java bytecode, ensuring that the same code
can be executed on any platform that has a compatible JVM.

Components of the JVM:
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

What is JDK?
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

What is JRE?
JRE (Java Runtime Environment)
The JRE provides the libraries, Java Virtual Machine (JVM), and other components to
run applications written in Java. It does not contain development tools like compilers or
debuggers. It is the implementation of the JVM.

● Components of the JRE:
1. Java Virtual Machine (JVM): The engine that runs the Java bytecode.
2. Core Libraries: Libraries that provide the basic functionality of the Java
   programming language (e.g., java.lang, java.util).
3. Supporting Files: Configuration files, property files, and other files required to
   run Java programs.

---------------------------------------------------------------------------------------------------------------------

What is class?
--Class is a set of instructions or methods.