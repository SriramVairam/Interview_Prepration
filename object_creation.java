/*
Parent ob = new Child();

Reference Type (Parent ob):

-The reference type determines what methods and fields are accessible.
-Since ob is a reference of type Parent, only members of the Parent class are directly accessible.

Actual Object (new Child()):

-The actual object in memory is of type Child.
-If a method is overridden in Child, the Child version will execute due to runtime polymorphism.*/
class Parent {
    
    String a = "hello";

    void name() {
        System.out.println("ram");
    }
    
    void sum(){
        System.out.println("s9");
    }
}

class Child extends Parent {
    
    void name() {
        System.out.println("sri");
    }
    void sum(){
		System.out.println("sum");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent ob = new Child();
        
        ob.name();
        ob.sum();
        
    }
}
