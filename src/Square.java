public class Square {
    private int verticalIndex;
    private int horizontalIndex;
    Nation nation;

    public Square(){}
    public Square(int verticalIndex, int horizontalIndex,Nation nation){
        this.horizontalIndex=horizontalIndex;
        this.verticalIndex=verticalIndex;
        this.nation=nation;
    }
    public Square(int verticalIndex, int horizontalIndex){
        this.horizontalIndex=horizontalIndex;
        this.verticalIndex=verticalIndex;
    }

    public int getVerticalIndex() {
        return verticalIndex;
    }

    public void setVerticalIndex(int verticalIndex) {
        this.verticalIndex = verticalIndex;
    }

    public int getHorizontalIndex() {
        return horizontalIndex;
    }

    public void setHorizontalIndex(int horizontalIndex) {
        this.horizontalIndex = horizontalIndex;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }
}
