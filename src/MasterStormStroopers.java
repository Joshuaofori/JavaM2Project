public class MasterStormStroopers extends EvilMasterBeing{
    private static MasterStormStroopers unique;
    private MasterStormStroopers(){

    }
    public static MasterStormStroopers getInstance(){
        if(unique==null){
            unique=new MasterStormStroopers();
        }
        return unique;
    }
}