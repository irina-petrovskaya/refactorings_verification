package aaa.bbb.ccc.ddd;

interface Pong<T> {}
class Ping<T> implements Pong<Pong<? super Ping<Ping<T>>>> {
    static void ping() {
        Pong<? super Ping<Long>> longPing = new Ping<Long>();
    }
}