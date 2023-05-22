package homeworks.lesson35;

import java.util.ArrayList;

public class RandomApp {
    public static void main(String[] args) {

        int random[] = new int[20];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < random.length; i++) {
            int max = random[0];
            if (random[i] > max) {
                max = random[i];
            }
            int min = random[0];
            for (int i1 = 0; i1 < random.length; i1++) {
                if (random[i] < min) {
                    min = random[i];
                }

            }

        }

    }
}

