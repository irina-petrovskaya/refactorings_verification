package aaa.bbb.ccc.ddd;

/**
 * Created by user on 17/02/16.
 */
public class AAAAA {

    int anInt; // int field

    public AAAAA(int anInt) {
        this.anInt = anInt;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;}

    @Override
    public String toString() {
        return "AAAAA{" +
                "foo='" + foo + '\'' +
                '}';
    }

    String foo;
}
