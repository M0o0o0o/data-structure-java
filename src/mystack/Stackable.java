package mystack;

import java.util.Optional;
import java.util.OptionalInt;

public interface Stackable {

    // push
    void push(int e);

    // pop
    OptionalInt pop();

    // isEmpty
    boolean isEmpty();

    // peek
    OptionalInt peek();

    int size();

}
