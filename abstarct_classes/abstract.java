//to show the abstract class in java
import java.util.*;
import java.io.*;

class Myclass {
    void calculate(int x) {
        System.out.println(x * x);
    }
}

public class abstract {
    public static void main(String[] args) {
        Myclass obj1 = new Myclass();
        Myclass obj2 = new Myclass();
        Myclass obj3 = new Myclass();

        obj1.calculate(3);
        obj2.calculate(4);
        obj3.calculate(5);
    }
}

