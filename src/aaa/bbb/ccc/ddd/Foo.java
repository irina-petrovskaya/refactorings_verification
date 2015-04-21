package aaa.bbb.ccc.ddd;

import java.util.Arrays;

// idea-138407
public class Foo {
    public static void main(String... args) throws Exception {
        Bar<Baz> a = method(new Bar<Baz>());
        System.err.println(a.getClass().toString());
        Bar<Baz> b = method(new Bar<>());
        System.err.println(b.getClass().toString());
        Arrays.stream(new double[]{1, 2, 3}).allMatch(Double::isNaN); // idea-138839
    }

    //comment this method out to remove the error
    static <T> T method(Class<T> t) throws Exception {
        System.out.println("static <T> T method(Class<T> t) is called");
        return t.newInstance();
    }

    static <T> T method(T t) throws Exception {
        System.out.println("static <T> T method(T t) is called");
        return t;
    }
}

//simplify the generic signature to remove the error
//class Bar<T> {
class Bar<T extends Enum<T>> {

}

enum Baz {}