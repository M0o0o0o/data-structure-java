package myqueue;

import java.util.OptionalInt;

public class QueueArrayImpl implements Queueable {

    private int[] queue;
    private int head;
    private int tail;

    public QueueArrayImpl(int capacity) {
        queue = new int[capacity];
        head = -1;
        tail = 0;
    }

    @Override
    public boolean add(int e) {
        this.queue[++head] = e;
    }

    @Override
    public OptionalInt poll() {
        if(tail > head) return OptionalInt.empty();
        return OptionalInt.of(queue[tail++]);
    }

}
