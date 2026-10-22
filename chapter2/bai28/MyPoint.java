public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        return new int[] {x, y};
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    public double distance(MyPoint another){
        double xDiff = this.x - another.getX();
        double yDiff = this.y - another.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

}
