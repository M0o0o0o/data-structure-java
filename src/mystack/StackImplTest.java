package mystack;

import org.junit.jupiter.api.Test;

import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class StackImplTest {

    @Test
    public void push2번동작확인() {
        Stackable stack = new StackImpl();

        stack.push(10);
        stack.push(100);
        assertEquals(stack.size(), 2);
    }

    @Test
    public void pop동작확인() {
        Stackable stack = new StackImpl();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(stack.pop().getAsInt(), 3);
    }

    @Test
    public void emptyStackPopTest() {
        Stackable stack = new StackImpl();
        assertEquals(stack.pop(), OptionalInt.empty());
    }

    @Test
    public void isEmptyTest() {
        Stackable stack = new StackImpl();
        assertEquals(stack.isEmpty(), true);
    }

    @Test
    public void notEmptyTest() {
        Stackable stack = new StackImpl();
        stack.push(10);

        assertEquals(stack.isEmpty(), false);
    }

    @Test
    public void EmptyStackPeekTest() {
        Stackable stack = new StackImpl();
        assertEquals(stack.peek(), OptionalInt.empty());
    }

    @Test
    public void notEmptyPeekTest() {
        Stackable stack = new StackImpl();

        int e = 10000;
        stack.push(e);

        assertEquals(stack.peek().getAsInt(), e);
    }
}