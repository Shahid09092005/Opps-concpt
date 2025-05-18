// Parent class
class A {
    void display() {
        System.out.println("Class A: displayA() called");
    }
}

// Child class of A
class B extends A {
    void display() {
        System.out.println("Class B: displayB() called");
    }
}

// Child class of B (grandchild of A)
class C extends B {
    void display() {
        System.out.println("Class C: displayC() called");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        A objA =  new A();
        objA.display();   
        A objB =  new B();
        objB.display(); 
        A objC =  new C();
        objC.display(); 

    }
}
