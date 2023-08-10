package com.driver;

public class Main {
    public static class A {
        public String meth() {
            String s = "Invoking method from class A";
            return s;
        }
    }
    public static class B extends A {
        @Override
        public String meth() {
            String s = "Method is overridden in Extendend class B";
            return s;
        }
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.meth();
    }
}