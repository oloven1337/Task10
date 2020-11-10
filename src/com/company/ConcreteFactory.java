package com.company;

public class ConcreteFactory implements ComplexAbstractFactory {
    public ConcreteFactory(){}
    public Complex createComplex(){
        return new ComplexNum();
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        System.out.println("z="+real+"+"+"i"+image);
        return new ComplexNum();
    }

}
