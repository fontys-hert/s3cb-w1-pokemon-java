package nl.timo;

public class DummyDie implements Die {
    private final Integer result;

    public DummyDie(Integer result) {
        this.result = result;
    }

    @Override
    public Integer roll() {
        return result;
    }
}
