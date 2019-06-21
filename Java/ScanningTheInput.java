import java.util.Scanner; // importing scanner from the standard library

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // an object for reading data 

        int num1 = scanner.nextInt(); // read the first number
        int num2 = scanner.nextInt(); // read the second number

        System.out.println(num2); // print the second number
        System.out.println(num1); // print the first number
    }
}

//Source: https://hyperskill.org/learn/step/3603
//Additional:
String line = scanner.nextLine(); // read a whole line, for example "Hello, Java"

int num = scanner.nextInt(); // read a number, for example 123

double d = scanner.nextDouble(); // read double, for example 123.01

String string = scanner.next(); // read a string (not a line), for example "Hello"
