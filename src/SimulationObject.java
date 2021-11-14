public class SimulationObject {
    private Nation nation;
    private boolean isObstacle=false;
    private Square square;
    CommonJedi commonJedi;
    CommonRebels commonRebels;
    CommonStormStroopers commonStormStroopers;
    CommonGalacticEmpire commonGalacticEmpire;

    public SimulationObject(){}
    public SimulationObject(Nation nation){
        this.nation=nation;
        if(this.nation==null)
            isObstacle=true;
         instatiateObjects();

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


    public void instatiateObjects(){
        if(this.nation==Nation.JEDI);{
            commonJedi= new CommonJedi();
        }
        if(this.nation==Nation.REBELS);{
            commonRebels= new CommonRebels();
        }
        if(this.nation==Nation.STORMTROOPERSS);{
            commonStormStroopers= new CommonStormStroopers();
        }
        if(this.nation==Nation.GALACTIC_EMPIRE);{
            commonGalacticEmpire= new CommonGalacticEmpire();
        }
    }

    public CommonJedi getCommonJedi() {
        return commonJedi;
    }

    public CommonRebels getCommonRebels() {
        return commonRebels;
    }

    public CommonStormStroopers getCommonStormStroopers() {
        return commonStormStroopers;
    }

    public CommonGalacticEmpire getCommonGalacticEmpire() {
        return commonGalacticEmpire;
    }
    public Being getObject(){
        if(this.nation==Nation.JEDI){
           return getCommonJedi();
        }
        if(this.nation==Nation.REBELS){
          return   getCommonRebels();
        }
        if(this.nation==Nation.STORMTROOPERSS){
        return   getCommonStormStroopers();
        }
        if(this.nation==Nation.GALACTIC_EMPIRE){
         return   getCommonGalacticEmpire();
        }
        return null;
    }
}
