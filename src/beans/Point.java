package beans;

public class Point {
    private int point;


    public Point() {
    }

    public Point(int point) {
        this.point = point;
    }
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "" + point;
    }
}
