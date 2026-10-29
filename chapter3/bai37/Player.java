public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    private static final float KICK_DISTANCE = 5.0f;


    public Player(int number, float x, float y){
        this.number = number;
        this.x=x;
        this.y=y;
    }

    public void move(float xDisp, float yDisp){
        x += xDisp;
        y += yDisp;
    }

    public void jump(float zDisp) {
        z += zDisp;
    }

    public boolean near(Ball ball) {
        double dx = x - ball.getX();
        double dy = y - ball.getY();
        double dz = z - ball.getZ();

        double distanceSquared = dx * dx + dy * dy + dz * dz;
        return distanceSquared < 8.0 * 8.0;
    }

     public void kick(Ball ball) {
        if (!near(ball)) {
            return;
        }

        double dx = ball.getX() - x;
        double dy = ball.getY() - y;
        double dz = ball.getZ() - z;

        double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
        if (distance == 0.0) {
            dx = 1.0;
            distance = 1.0;
        }

        float newX = (float) (ball.getX()
                + KICK_DISTANCE * dx / distance);
        float newY = (float) (ball.getY()
                + KICK_DISTANCE * dy / distance);
        float newZ = (float) (ball.getZ()
                + KICK_DISTANCE * dz / distance);

        ball.setXYZ(newX, newY, newZ);
    }
}
