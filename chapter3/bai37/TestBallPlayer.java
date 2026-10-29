public class TestBallPlayer {
    public static void main(String[] args) {
        // Thử Ball
        Ball ball = new Ball(10, 0, 0);
        System.out.println("Ball: " + ball);

        ball.setXYZ(10, 0, 0);
        System.out.println("Coordinates: "
                + ball.getX() + ", "
                + ball.getY() + ", "
                + ball.getZ());

        // Thử move, jump, near và kick
        Player player = new Player(7, 0, 0);

        System.out.println("Near before moving: " + player.near(ball));

        player.move(3, 0);
        System.out.println("Near after moving: " + player.near(ball));

        player.jump(10);
        System.out.println("Near after jumping: " + player.near(ball));

        player.jump(-10);
        System.out.println("Near after landing: " + player.near(ball));

        player.kick(ball);
        System.out.println("Ball after kick: " + ball);

        // Mô phỏng đơn giản: hai đội lần lượt tiếp cận và đá bóng
        Ball matchBall = new Ball(45, 25, 0);
        Player redPlayer = new Player(7, 40, 25);
        Player bluePlayer = new Player(10, 60, 25);

        for (int turn = 0; turn < 4; turn++) {
            if (turn % 2 == 0) {
                System.out.print("Red team kicks: ");
                redPlayer.kick(matchBall);
            } else {
                // Blue tiến về phía bóng
                bluePlayer.move(-5, 0);
                System.out.print("Blue team kicks: ");
                bluePlayer.kick(matchBall);
            }

            System.out.println(matchBall);
        }
    }
}