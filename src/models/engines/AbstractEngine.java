package models.engines;

public abstract class AbstractEngine {
    private long horsePower;

    public AbstractEngine(long hp){
        this.horsePower = hp;
    }

    public long getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(long horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                '}';
    }
}
