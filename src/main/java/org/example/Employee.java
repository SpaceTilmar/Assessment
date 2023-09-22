package org.example;

abstract class Employee extends Customer implements Discountable{
    private final double DISCOUNT = .10;

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public Employee(String name) {
        super(name);
    }
    public static void printEmployeePriceAfterDiscount(Clothing price){
        System.out.println(Discountable.calcu);
    }
}
