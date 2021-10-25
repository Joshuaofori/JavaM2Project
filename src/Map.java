import java.util.Random;
public class Map {
    private int m,n;
    Nation allNations[]={Nation.REBELS,Nation.JEDI, Nation.GALACTIC_EMPIRE,Nation.STORMTROOPERSS};
   private Square[][] squares;

   Random random;
    public Map(){
        this.m=8;
        this.n=14;
        random=new Random();
   generateSqures();
   generateBeings();
    }
 private void generateSqures(){
    squares= new Square[m][n];
  }
  private void generateBeings(){
        squares[0][0]= new Square(0,0,new SimulationObject(Nation.JEDI),m,n);
        squares[m - 1][0]= new Square(m-1,0,new SimulationObject(Nation.REBELS),m,n);
        squares[0][n-1]=new Square(0,n-1,new SimulationObject(Nation.GALACTIC_EMPIRE),m,n);
        squares[m-1][n-1]= new Square(m-1,n-1,new SimulationObject(Nation.STORMTROOPERSS),m,n);
        int mPositon,nPosition;
        for(Nation aNation: allNations){
        for(int i=0;i<4;i++){
            mPositon=random.nextInt(8);
            nPosition=random.nextInt(14);
        if(squares[mPositon][nPosition]==null){
         squares[mPositon][nPosition]= new Square(mPositon,nPosition,new SimulationObject(aNation),m,n);
        }
        else{
            nPosition=random.nextInt(14);
            squares[mPositon][nPosition]= new Square(mPositon,nPosition, new SimulationObject(aNation),m,n);
        }

        }}
  }
 private void generateObstacle(){

 }
 public void printMap(){
        for(int i=0;i<8;i++){
            for(int j=0;j<14;j++){
                if(squares[i][j]!=null){
                    System.out.print("B ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
 }
}
