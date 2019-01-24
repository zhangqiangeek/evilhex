
/**
 * @author evilhex.
 * @date 2018/10/31 上午11:48.
 */


class A { A(){  Print.println("A()");} }

class B extends A { B(){ Print.println("B()");} }

class C extends A {
    B b = new B(); // will then construct another A and then a B
    public static void main(String[] args) {
        C c = new C(); // will construct an A first
    }
}