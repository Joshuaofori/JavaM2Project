public class SimulationObject {
    private Nation nation;
    private boolean isObstacle=false;
    private Square square;
    public SimulationObject(){}
    public SimulationObject(Nation nation){
        this.nation=nation;
        if(this.nation==null)
            isObstacle=true;
    }


    public void setSquare(Square square){
        this.square=square;
    }
    public Square getSquare(){
        return this.square;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public boolean isObstacle() {
        return isObstacle;
    }



}
