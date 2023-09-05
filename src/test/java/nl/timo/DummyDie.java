package nl.timo;

public class DummyDie implements Die {
    private final Integer result20;
    private final Integer result8;

    public DummyDie(Integer result20, Integer result8) {
        this.result20 = result20;
        this.result8 = result8;
    }

    @Override
    public Integer roll20() {
        return result20;
    }

    @Override
    public Integer roll8() {
        return result8;
    }
}
