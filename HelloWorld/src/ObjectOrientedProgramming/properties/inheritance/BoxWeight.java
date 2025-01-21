package ObjectOrientedProgramming.properties.inheritance;

public class BoxWeight extends Box{
    long weight;

    public BoxWeight(long weight) {
        this.weight = weight;
    }

    public BoxWeight(long l, long w, long h, long weight) {
        super(l, w, h);
        this.weight = weight;
    }

    public BoxWeight(int side, long weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }
}
