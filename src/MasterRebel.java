public class MasterRebel extends GoodMasterBeing{
    private static MasterRebel unique;
    private MasterRebel(){

    }
    public static MasterRebel getInstance(){
     if(unique==null){
         unique=new MasterRebel();
     }
     return unique;
    }
}
