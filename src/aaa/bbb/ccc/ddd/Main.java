package aaa.bbb.ccc.ddd;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
    }

    public Object getObject() {
        Optional<Object> o = Optional.of("x");
        return o
                .map(bx -> {
                    B b = new B();
                    return (Object) b;
                })
                .orElse(new A());
    }

    static class A {
    }

    static class B {
    }
}