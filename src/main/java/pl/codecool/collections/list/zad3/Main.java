package pl.codecool.collections.list.zad3;

import java.util.Queue;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        CommandQueueCreator commandQueueCreator = new CommandQueueCreator(10);
        Queue<Command> commands = commandQueueCreator.createQueue();
        CommandConsumer commandConsumer = new CommandConsumer();

        commandConsumer.consume(commands);


        commands = commandQueueCreator.createQueue();
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.printf(s + " %s", "consumer!!\n");
            }
        };
        commandConsumer.consume(commands, consumer);

        commands = commandQueueCreator.createQueue();
        Consumer<Command> consumer2 = new Consumer<Command>() {
            @Override
            public void accept(Command command) {
                command.operation();
            }
        };
        commandConsumer.consume(commands, consumer);
    }
}
