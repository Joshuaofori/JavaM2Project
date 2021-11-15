public class CommonGalacticEmpire extends EvilCommonBeing {

    public CommonGalacticEmpire() {
        super();
        super.setNation(Nation.GALACTIC_EMPIRE);
    }

    @Override
    public void move() {
        Direction direction = Utils.getRandomDirection();
        int numOfSquares = Utils.getRandomNumberOfSquaresToMove();
        switch (direction) {
            case NORTH:
                Square currSquare1 = getSquare();
                int i1 = 0;
                while (i1 < currSquare1.getHorizontalIndex() - 1 && i1 != numOfSquares) i1++;
                currSquare1.setSimulationObject(null);
                Square nextSquare1 = getMap().getSquares()[currSquare1.getHorizontalIndex() - i1][currSquare1.getVerticalIndex()];
                nextSquare1.setSimulationObject(this);
                setSquare(nextSquare1);
                break;
            case NORTHEAST:
                break;
            case EAST:
                Square currSquare2 = getSquare();
                int i2 = 0;
                while (i2 < getMap().getN() - currSquare2.getVerticalIndex() - 1 && i2 != numOfSquares) i2++;
                currSquare2.setSimulationObject(null);
                Square nextSquare2 = getMap().getSquares()[currSquare2.getHorizontalIndex()][currSquare2.getVerticalIndex() + i2];
                nextSquare2.setSimulationObject(this);
                setSquare(nextSquare2);
                break;
            case SOUTHEAST:
                break;
            case SOUTH:
                Square currSquare3 = getSquare();
                int i3 = 0;
                while (i3 < getMap().getM() - currSquare3.getHorizontalIndex() - 1 && i3 != numOfSquares) i3++;
                currSquare3.setSimulationObject(null);
                Square nextSquare3 = getMap().getSquares()[currSquare3.getHorizontalIndex() + i3][currSquare3.getVerticalIndex()];
                nextSquare3.setSimulationObject(this);
                setSquare(nextSquare3);
                break;
            case SOUTHWEST:
                break;
            case WEST:
                Square currSquare4 = getSquare();
                int i4 = 0;
                while (i4 < currSquare4.getVerticalIndex() - 1 && i4 != numOfSquares) i4++;
                currSquare4.setSimulationObject(null);
                Square nextSquare4 = getMap().getSquares()[currSquare4.getHorizontalIndex()][currSquare4.getVerticalIndex() - i4];
                nextSquare4.setSimulationObject(this);
                setSquare(nextSquare4);
                break;
            case NORTHWEST:
                break;
        }
    }
}
