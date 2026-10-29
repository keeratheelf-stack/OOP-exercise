public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width - 1;
        this.y2 = y + height - 1;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1 + 1;
    }

    public int getHeight() {
        return y2 - y1 + 1;
    }

     public boolean collidesWith(Ball ball) {
        boolean collided = false;

        float left = ball.getX() - ball.getRadius();
        float right = ball.getX() + ball.getRadius();
        float top = ball.getY() - ball.getRadius();
        float bottom = ball.getY() + ball.getRadius();

        if (left <= x1 || right >= x2) {
            ball.reflectHorizontal();
            collided = true;
        }

        if (top <= y1 || bottom >= y2) {
            ball.reflectVertical();
            collided = true;
        }

        return collided;
    }

    public boolean collides(Ball ball) {
        return collidesWith(ball);
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),("
                + x2 + "," + y2 + ")]";
    }
}
