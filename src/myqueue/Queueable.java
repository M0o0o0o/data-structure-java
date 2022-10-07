package myqueue;

import java.util.Optional;
import java.util.OptionalInt;

public interface Queueable {

    void add(int e);
    OptionalInt poll();



}
