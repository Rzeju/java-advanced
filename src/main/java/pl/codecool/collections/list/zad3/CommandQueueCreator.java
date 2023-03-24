package pl.codecool.collections.list.zad3;

import lombok.AllArgsConstructor;

import java.util.LinkedList;
import java.util.Queue;

@AllArgsConstructor
public class CommandQueueCreator {

    private int number;

    public Queue<Command> createQueue() {
        Queue<Command> result = new LinkedList<>();
        for (int i = 0; i < number; i++) {
            Command command = new Command("Command-" + (i + 1));
            result.add(command);
        }
        return result;
    }
}
