package ObjectOrientedProgramming.properties.inheritance;

public class Box {
    private long l;
    long w;
    long h;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    public Box(long l, long w, long h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(int side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(Box other){
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }
}
