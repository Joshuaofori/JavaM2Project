public class Square {
    private int verticalIndex;
    private int horizontalIndex;
    private int positionM,positionN;
    Nation nation;
    SimulationObject simulationObject;

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
    public Square(int verticalIndex, int horizontalIndex,SimulationObject simulationobject,int m,int n){
        this.horizontalIndex=horizontalIndex;
        this.verticalIndex=verticalIndex;
        this.simulationObject=simulationobject;
        this.positionM=m;
        this.positionN=n;
        assignToBeings(simulationobject,m,n);

    }
    public void assignToBeings(SimulationObject simulationObject,int m,int n){
        if(verticalIndex==0&&horizontalIndex==0&&simulationObject.getNation()==Nation.JEDI){
            setSimulationObject(simulationObject);
            System.out.println("Master Jedi has been created");
        }
        else if(verticalIndex==(m - 1)&&horizontalIndex==0&&simulationObject.getNation()==Nation.REBELS){
            setSimulationObject(simulationObject);
            System.out.println("Master Rebels has been created");
        }
        else if(verticalIndex==0&&horizontalIndex==(n-1)&&simulationObject.getNation()==Nation.GALACTIC_EMPIRE){
            setSimulationObject(simulationObject);
            System.out.println("Master Galactic Empire has been created");
        }
        else if(verticalIndex==(m-1)&&horizontalIndex==(n-1)&&simulationObject.getNation()==Nation.STORMTROOPERSS){
            setSimulationObject(simulationObject);
            System.out.println("Master Storm stroopers has been created");
        }
        else {
            if(simulationObject.getNation()==Nation.REBELS){
               setSimulationObject(simulationObject);
               System.out.println("Common rebel created");
            }
            if(simulationObject.getNation()==Nation.JEDI){
                setSimulationObject(new CommonJedi());
                System.out.println("Common jedi created");
            }
            if(simulationObject.getNation()==Nation.GALACTIC_EMPIRE){
                setSimulationObject(new CommonGalacticEmpire());
                System.out.println("Common galatic empire created");
            }
            if(simulationObject.getNation()==Nation.STORMTROOPERSS){
                setSimulationObject(new CommonStormStroopers());
                System.out.println("Common rebel storm Strooper created");
            }
        }
    }

    public void assignToCommon(){

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

    public SimulationObject getSimulationObject() {
        return simulationObject;
    }

    public void setSimulationObject(SimulationObject simulationObject) {
        this.simulationObject = simulationObject;
    }

    public int getPositionM() {
        return positionM;
    }

    public void setPositionM(int positionM) {
        this.positionM = positionM;
    }

    public int getPositonN() {
        return positionN;
    }

    public void setPositonN(int positonN) {
        this.positionN = positonN;
    }
}
