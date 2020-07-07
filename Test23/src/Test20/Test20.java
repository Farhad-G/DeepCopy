package Test20;

import Test22.Test22;

import java.util.Collections;

public class Test20 {

    public static void main(String[] args) {
        Test22 person = new Test22("Farhad", 31, Collections.singletonList("book"));
        Test22 person2 = new Test22();
        System.out.println(person);
    }
}
