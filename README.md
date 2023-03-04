# 🔥dsa-bootcamp tought by Kunal Kushwaha

- Subscribe to [Kunal Kushwaha's YouTube channel](https://www.youtube.com/KunalKushwaha?sub_confirmation=1)

- [📂 Complete Playlist](https://www.youtube.com/playlist?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ)

## Purpose of this repository

Purpose of creating this repository is for my own gratification and in the process, I will also get some practise on how to write a markdown file.

### Introduction to programming - Types of languages, memory management

There are three types of languages

<ol>
  <li>Procedural</li>
  <li>Functional</li>
  <li>Object Oriented</li>
</ol>

### Procedural

<ul>
  <li>Specifies a series of well structured steps and procedures to compose a program.</li>
  <li>Contains a systematic order of statements, functions and commands to complete a task.</li>
</ul>

### Functional

<ul>
  <li>Writing programs only in pure functions.</li>
  <li>Used in situations where we have to perform lots of different operations on
  the same set of data.</li>
</ul>

### Procedural

<ul>
  <li>Revolves around objects.</li>
  <li>Code + Data = Object</li>
  <li>Was created to make it easier to develop, debug, reuse and maintain</li>
</ul>

## Static vs Dynamic languages

### Static

<ul>
  <li>Perform type checking at compile time.</li>
  <li>Errors will show at compile time</li>
  <li>Declare datatype before you use it</li>
  <li>More control</li>
</ul>

### Dynamic

<ul>
  <li>Perform type checking at runtime.</li>
  <li>Errors will not show till program is run</li>
  <li>No need to declare datatype of variables</li>
  <li>Saves time in writing code but might show errors at runtime</li>
</ul>

## Memory -- Stacks and Heap

Suppose we have `int a = 10;`, here `a` is the reference variable and
`10` is the object.
`a` is stored in <b>stack</b> and `10` is stored in <b>heap</b>.
`a` points towards the <em>memory address</em> of `10`

# Java Program important points

<ol>
  <li>A Java source file can have multiple classes but <b>only one public class is allowed</b>.</li>
  <li>The java source file name should be the <b>same as the public class name.</b> For 
  example if the source file is ```Hello.java```, the public class name will 
  appear like so ```public class Hello```
  <li>A class file is an executable file such as ```Hello.class``` which can be run
  by typing ```java Hello``` in the terminal.</li>
  <li>When we run the program using the ```java``` command, it <em>loads the class into JVM</em> and looks for the <b>main method</b> in the class and runs it. The main function syntax should be same as specified in the program, else it won’t run and throw exception as ```Exception in thread "main" java.lang.NoSuchMethodError: main.```</li>
</ol>

## I wonder why the `class` keyword is used in Java

Classes act as the building blocks for the entire application.

The <b>Java Virtual Machine (JVM)</b> has to start the application somewhere. As Java does not have a concept of <em>things outside of a class</em> the method that is called by the JVM has to be in a class..

I think this is by design. I do not know much about this. Oh wait a minute, I remember something...

<em>The Java Virtual Machine starts up by loading a specified class and then invoking the main method (entry point) in this specified class.</em>

# What Is an Object?

Real-world objects share <b>two</b> characteristics: They all have <em>state and behavior</em>. Dogs have state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail). Bicycles also have state (current gear, current pedal cadence, current speed) and behavior (changing gear, changing pedal cadence, applying brakes). Identifying the state and behavior for real-world objects is a great way to begin thinking in terms of object-oriented programming.

Software objects are conceptually similar to real-world objects: they too consist of state and related behavior. An object stores its state in fields (variables in some programming languages) and <b>exposes its behavior through methods</b> (functions in some programming languages). Methods operate on an object's <em>internal state</em> and serve as the primary mechanism for object-to-object communication. Hiding internal state and requiring all interaction to be performed through an object's methods is known as <b>data encapsulation</b> — a fundamental principle of <b>object-oriented programming</b>.

## Why Hide the internal state? I mean why Encapsulate?

Encapsulation <b>protects an object from unwanted access by clients</b>. Encapsulation allows access to a level without revealing the complex details below that level. It reduces human errors. Simplifies the maintenance of the application.

I found these two links useful

<ul>
  <li>[What is the use of encapsulation when I'm able to change the property values with setter methods?](https://stackoverflow.com/questions/16418571/what-is-the-use-of-encapsulation-when-im-able-to-change-the-property-values-wit)</li>
  <li>[Encapsulation Vs DataHiding?](https://stackoverflow.com/questions/18980390/encapsulation-vs-datahiding?rq=1)</li>
</ul>

### What's the difference between next() and nextLine() methods from Scanner class?

`next()` and `nextLine()` methods are associated with Scanner and is used for getting String inputs. Their differences are...

`next()` can read the input only till the space. It can't read two words separated by space. Also, next() places the cursor in the same line after reading the input.

`nextLine()` reads input including space between the words (that is, it reads till the end of line \n). Once the input is read, `nextLine()` positions the cursor in the next line.

