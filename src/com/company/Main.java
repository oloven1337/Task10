package com.company;

public class Main {
    public static void main(String[] args) {
        ComplexNum CN = new ComplexNum();
        ConcreteFactory CF = new ConcreteFactory();
        CN.print();
        CF.CreateComplex(2, 3);
    }
}
