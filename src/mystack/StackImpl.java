package mystack;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class StackImpl implements Stackable {

    List<Integer> stack;

    public StackImpl() {
        stack = new ArrayList<>();
    }

    @Override
    public void push(int e) {
        stack.add(e);
    }

    @Override
    public OptionalInt pop() {
        if (isEmpty()) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(stack.remove(stack.size() - 1));
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public OptionalInt peek() {
        if (isEmpty()) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(stack.get(stack.size() - 1));
    }

    @Override
    public int size() {
        return stack.size();
    }

}
