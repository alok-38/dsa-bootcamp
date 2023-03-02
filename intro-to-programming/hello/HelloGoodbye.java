
/******************************************************************************
 * Compilation: javac HelloGoodbye.java
 * Execution: java HelloGoodbye
 *
 * Takes two names as command-line arguments and prints hello and goodbye
 * messages
 *
 * % java HelloGoodbye Kevin Bob
 * Hello Kevin and Bob.
 * Goodbye Bob and Kevin.
 *
 * These 17 lines of text are comments. They are not part of the program;
 * they serve to remind us about its properties. The first two lines tell
 * us what to type to compile and test the program. The next line describes
 * the purpose of the program. The next few lines give a sample execution
 * of the program and the resulting output. We will always include such
 * lines in our programs and encourage you to do the same.
 *
 ******************************************************************************/
public class HelloGoodbye {
    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.print(args[0]);
        System.out.print(" and ");
        System.out.println(args[1] + ".");
        System.out.print("Goodbye ");
        System.out.print(args[1]);
        System.out.print(" and ");
        System.out.println(args[0] + ".");

    }
}
