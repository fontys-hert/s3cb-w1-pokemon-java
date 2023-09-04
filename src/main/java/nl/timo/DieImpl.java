package nl.timo;

import java.util.Random;

public class DieImpl implements Die {
    @Override
    public Integer roll() {
        return new Random().nextInt(20) + 1;
    }
}
