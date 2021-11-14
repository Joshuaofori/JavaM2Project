import java.util.Random;

public class Utils {

    public static Direction getRandomDirection() {
        Random random = new Random();
        switch (random.nextInt(8)) {
            case 0: return Direction.NORTH;
            case 1: return Direction.NORTHEAST;
            case 2: return Direction.EAST;
            case 3: return Direction.SOUTHEAST;
            case 4: return Direction.SOUTH;
            case 5: return Direction.SOUTHWEST;
            case 6: return Direction.WEST;
            case 7: return Direction.NORTHWEST;
        }

        return null;
    }

    public static int getRandomNumberOfSquaresToMove() {
        Random random = new Random();
        return random.nextInt(10);
    }

    public static int getRandomNumberOfMessages() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
