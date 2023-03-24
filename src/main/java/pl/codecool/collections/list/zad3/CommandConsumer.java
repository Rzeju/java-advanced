package pl.codecool.collections.list.zad3;

import java.util.Queue;
import java.util.function.Consumer;

public class CommandConsumer {

    public void consume(Queue<Command> commands) {
        while(commands.peek() != null) {
            commands.remove().operation();
        }
    }

    public void consume(Queue<Command> commands, Consumer<String> consumer) {
        while(commands.peek() != null) {
            consumer.accept(commands.remove().getValue());
        }
    }

    public void consume(Consumer<Command> consumer, Queue<Command> commands) {
        while(commands.peek() != null) {
            consumer.accept(commands.remove());
        }
    }


}
