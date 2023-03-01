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
