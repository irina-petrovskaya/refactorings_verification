package aaa.bbb.ccc.ddd;

import java.util.List;
import java.util.function.Supplier;


public class A {
    public void example(List<String> list, String string) {

        list.stream().filter(listValue -> string.equals(listValue)); // incorrect lambda replacement
    }

    void b(Supplier<Runnable> supplier) {
        Runnable c = supplier.get();
    }
}