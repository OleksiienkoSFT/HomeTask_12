package Lesson_12;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // 1.	Створіть чотири строки: Hello, Hello, Good-Bye, HELLO.
        // Порівняйте першу строку з іншими. Потім порівняйте першу з четвертою не враховуючи регістр.

        // Task 1

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Good-Bye";
        String str4 = "HELLO";

        System.out.println(str1.equals(str2));
        Boolean b = str1.equals(str3);
        System.out.println(b);
        System.out.println(str1.equals(str4));
        Boolean b1 = str1.equalsIgnoreCase(str4);
        System.out.println(b1);
        System.out.println();

        // task 2
        // Перевірте чи починаєть строка Foobar зі слова Foo, чи закінчується на bar, чи містить оо
        System.out.println("task 2");
        String str5 = "Foobar";
        System.out.println(str5.startsWith("Foo"));
        System.out.println(str5.endsWith("bar"));
        System.out.println(str5.contains("oo"));

        // task 3
        System.out.println();
        System.out.println("Task 3");
        String abc = "abc";
        String c = abc.valueOf('c');
        System.out.println(c);

        // task 4
        System.out.println();
        System.out.println("Task 4");
        String sentence = "“Для роботи зі строками у Java використовуються класи String, StringBuilder та StringBuffer.";
        System.out.println("у елементу ‘S’ індекс - " + sentence.indexOf('S'));
        System.out.println("індекс останнього символу ‘r’ - " + sentence.lastIndexOf('r'));
        System.out.println("індекс з якого починається підрядок ‘String’ - " + sentence.indexOf("String"));
        System.out.println("останнє згадування 'String' з індексу - " + sentence.lastIndexOf("String"));
        System.out.println();

        // task 5
        // 5.	Об’єднайте строки Hello та World. Приведіть їх до нижнього регістру. Потім до верхнього.
        System.out.println("Task 5");
        String h = "Hello";
        String w = "World";

        String helloWorld = h + " " + w;
        String lower = helloWorld.toLowerCase();
        System.out.println(lower);
        String upCase = helloWorld.toUpperCase(Locale.ROOT);
        System.out.println(upCase);
        System.out.println();

        // task 6
        System.out.println("Task 6");
        double d = 5.5;
        long l = 60000;
        House house = new House("apartment");

        String dd = String.valueOf(d);
        String ll = String.valueOf(l);
        String hh =  String.valueOf(house);
        System.out.println();

        // task 7

        System.out.println("Task 7");
        String welcomDnipro = "Welcome to Dnipro!";
        System.out.println(welcomDnipro.substring(10));
        System.out.println(welcomDnipro.substring(10,17));

        // task 8
        System.out.println();
        System.out.println("Task 8");
        System.out.println(oopReplase("Object-oriented programming is a programming language model organized around objects rather than actions and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla"));
        System.out.println();


        // task 9
        System.out.println("Task 9");
        print("I like Java!!!");

        // task 10
        System.out.println();
        System.out.println("Task 10");
        int i = 3;
        int j = 56;
        String minus = i + "-" + j + "=" + (i-j);

        StringBuilder minus1 = new StringBuilder(minus);

        StringBuilder plus1 = new StringBuilder();
        plus1.append(i).append("+").append(j).append("=").append(i+j);

        StringBuilder multiply1 = new StringBuilder(i + "*" + j + "=" + (i*j));

        System.out.println(minus1);
        int g = minus1.indexOf("=");
        minus1.deleteCharAt(g);
        System.out.println(minus1.insert(g, "дорівнює"));
        System.out.println();

        System.out.println(plus1);
        int gg = plus1.indexOf("=");
        plus1.deleteCharAt(gg);
        System.out.println(plus1.insert(gg, "дорівнює"));
        System.out.println();

        System.out.println(multiply1);
        int e = multiply1.indexOf("=");
        multiply1.deleteCharAt(e);
        System.out.println(multiply1.insert(e, "дорівнює"));
        System.out.println();

        // Task 11
        System.out.println();
        System.out.println("Task 11");
        String  string = "string";
        String  code = "code";
        midlChar(string);
        midlChar(code);
        midlChar("Practice");



    }

    public static String oopReplase (String sentence){
        String lowerCase = sentence.toLowerCase();
        return lowerCase.replace("object-oriented programming", "OOP");

    }
    public static void print (String sentence){
        System.out.println(sentence.charAt(sentence.length()-1));
        System.out.println(sentence.endsWith("!!!"));
        System.out.println(sentence.startsWith("I like"));
        System.out.println(sentence.contains("Java"));
        System.out.println("позиція Java з - " + sentence.indexOf("Java"));
        System.out.println(sentence.replace("a", "про"));
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.substring(sentence.indexOf("Java"), sentence.indexOf("Java") + "Java".length()));

    }
    // task 11
    public static void midlChar (String s){
        int halfLength = s.length()/2;
        if (s.length()%2!=0){
            System.out.println("Передайте строку з парними символами.");
        }
        else {
            System.out.print(s.charAt(halfLength-1));
            System.out.println(s.charAt(halfLength));
        }
    }
}
