public class MasterGalacticEmpire extends EvilMasterBeing{
    private static MasterGalacticEmpire unique;
    private MasterGalacticEmpire(){

    }
    public static MasterGalacticEmpire getInstance(){
        if(unique==null){
            unique=new MasterGalacticEmpire();
        }
        return unique;
    }
}
