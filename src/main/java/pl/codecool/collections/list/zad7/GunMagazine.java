package pl.codecool.collections.list.zad7;

import lombok.RequiredArgsConstructor;

import java.util.Deque;
import java.util.LinkedList;

@RequiredArgsConstructor
public class GunMagazine {

    private final int size;
    private Deque<String> magazine = new LinkedList<>();

    public void loadBullet(String bullet) {
        if (magazine.size() == size) {
            System.out.println("Magazynek jest pełny");
        } else {
            magazine.addFirst(bullet);
        }
    }

    public boolean isLoaded() {
        return magazine.size() != 0;
    }

    public void shot() {
        if (magazine.peekFirst() == null) {
            System.out.println("Pusty magazynek");
        } else {
            System.out.println(magazine.pollFirst());
        }
    }

}
