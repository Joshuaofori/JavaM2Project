public abstract class Square {
    private int verticalIndex;
    private int horizontalIndex;
    private SimulationObject simulationObject;

    public Square(int horizontalIndex, int verticalIndex) {
        this.horizontalIndex = horizontalIndex;
        this.verticalIndex = verticalIndex;
    }

    public int getVerticalIndex() {
        return verticalIndex;
    }

    public int getHorizontalIndex() {
        return horizontalIndex;
    }

    public SimulationObject getSimulationObject() {
        return simulationObject;
    }

    public void setSimulationObject(SimulationObject simulationObject) {
        this.simulationObject = simulationObject;
    }
}
