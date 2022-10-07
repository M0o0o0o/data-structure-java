package myqueue;

import java.util.Optional;
import java.util.OptionalInt;

public interface Queueable {

    boolean add(int e);

    OptionalInt poll();


}
