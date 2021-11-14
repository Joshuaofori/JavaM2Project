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

            int r = random.nextInt(56)/8;
            int c = random.nextInt(182)%14;

           r+= (r<3&&c<3&&aNation!=Nation.JEDI)?3:0;
           r+= (r<3&&c>10&&aNation!=Nation.GALACTIC_EMPIRE)?3:0;
           r-= (r>4&&c<3&&aNation!=Nation.REBELS)?3:0;
           r-= (r>4&&c>10&&aNation!=Nation.STORMTROOPERSS)?3:0;

            squares[r][c]= new Square(r,c,new SimulationObject(aNation),m,n);
//

        }}
  }
 private void generateObstacle(){

 }
 public void printMap(){
        for(int i=0;i<8;i++){
            for(int j=0;j<14;j++){
                if(squares[i][j]!=null){
                    if(!squares[i][j].getSimulationObject().isObstacle()){
                     if(squares[i][j].getSimulationObject().getNation()==Nation.JEDI){
                         System.out.print("J ");}
                     if(squares[i][j].getSimulationObject().getNation()==Nation.REBELS){
                            System.out.print("R ");}
                     if(squares[i][j].getSimulationObject().getNation()==Nation.GALACTIC_EMPIRE){
                         System.out.print("G ");}
                     if(squares[i][j].getSimulationObject().getNation()==Nation.STORMTROOPERSS){
                         System.out.print("S ");}
                    }

                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
 }

}
