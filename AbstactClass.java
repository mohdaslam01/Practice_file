package abstactclass;

abstract class SuperClass{
    SuperClass(){
        System.out.println("Abstract Class: Super()");
    }
    void meth1(){
        System.out.println("SuperClass: meth1()");
    }
    abstract void meth2();
}
class SubClass extends SuperClass{
//    @Override
//    void meth1(){
//        System.out.println("Subclass: meth1()");    
//    }
    @Override
    void meth2(){
        System.out.println("SubClass: meth2()\tIt is abstract method in SuperClass");
    }
}


public class AbstactClass {


    public static void main(String[] args) {
        SubClass s=new SubClass();
        s.meth1();
        s.meth2();
    }
    
}
