package aaa.bbb.ccc.ddd;
// this test doesn't compile!!!
// also, inspections hang up
// previously - SOE in analysis performing
interface Pong<T> {}
class Ping<T> implements Pong<Pong<? super Ping<Ping<T>>>> {
    static void ping() {
        Pong<? super Ping<Long>> longPing = new Ping<Long>();
    }
}