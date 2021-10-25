import java.util.ArrayList;

public class Map {
    private int m,n;
   private Square[][] squares;
    public Map(){
        this.m=8;
        this.n=14;
   generateSqures();
    }
 private void generateSqures(){
    squares= new Square[m][n];
  }
  private void generateBeings(){
        squares[0][0]= MasterJedi.getInstance();
        squares[m - 1][0]=MasterRebel.getInstance();
        squares[0][n-1]=MasterGalacticEmpire.getInstance();
        squares[m-1][n-1]=MasterStormStroopers.getInstance();
  }
 private void generateObstacle(){

 }
}
