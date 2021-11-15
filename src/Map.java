import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Map {
    private final int m;
    private final int n;

    private Square[][] squares;
    private List<Being> beings;

    Random random;

    public Map(int m, int n) {
        this.m = m;
        this.n = n;
        random = new Random();
        generateSquares();
        generateBeings();
        generateObstacle();
        printMap();
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public Square[][] getSquares() {
        return squares;
    }

    public void startSimulation() {
        int j = 0;
        while (true) {
            for (int i = 0; i < beings.size(); i++) {
                beings.get(i).move();
            }

            printMap();
            j++;
            if(j == 5)break;
        }
    }

    private void generateSquares() {
        squares = new Square[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i < 3 && j < 3) {
                    squares[i][j] = new SafeZone(i, j, Nation.GALACTIC_EMPIRE);
                } else if (i > 4 && j < 3) {
                    squares[i][j] = new SafeZone(i, j, Nation.STORMTROOPERSS);
                } else if (i < 3 && j > 10) {
                    squares[i][j] = new SafeZone(i, j, Nation.JEDI);
                } else if (i > 4 && j > 10) {
                    squares[i][j] = new SafeZone(i, j, Nation.REBELS);
                } else {
                    squares[i][j] = new NeutralZone(i, j);
                }
            }
        }
    }

    private void generateBeings() {
        beings = new ArrayList<Being>();

        MasterGalacticEmpire mge = MasterGalacticEmpire.getInstance();
        mge.setSquare(squares[0][0]);
        squares[0][0].setSimulationObject(mge);
        mge.setMap(this);
        beings.add(mge);
        CommonGalacticEmpire cge1 = new CommonGalacticEmpire();
        cge1.setSquare(squares[0][1]);
        squares[0][1].setSimulationObject(cge1);
        cge1.setMap(this);
        beings.add(cge1);
        CommonGalacticEmpire cge2 = new CommonGalacticEmpire();
        cge2.setSquare(squares[1][1]);
        squares[1][1].setSimulationObject(cge2);
        cge2.setMap(this);
        beings.add(cge2);

        MasterStormStroopers mst = MasterStormStroopers.getInstance();
        mst.setSquare(squares[m - 1][0]);
        squares[m - 1][0].setSimulationObject(mst);
        mst.setMap(this);
        beings.add(mst);
        CommonStormStroopers cst1 = new CommonStormStroopers();
        cst1.setSquare(squares[m - 2][0]);
        squares[m - 2][0].setSimulationObject(cst1);
        cst1.setMap(this);
        beings.add(cst1);
        CommonStormStroopers cst2 = new CommonStormStroopers();
        cst2.setSquare(squares[m - 2][1]);
        squares[m - 2][1].setSimulationObject(cst2);
        cst2.setMap(this);
        beings.add(cst2);

        MasterJedi mj = MasterJedi.getInstance();
        mj.setSquare(squares[0][n - 1]);
        squares[0][n - 1].setSimulationObject(mj);
        mj.setMap(this);
        beings.add(mj);
        CommonJedi cj1 = new CommonJedi();
        cj1.setSquare(squares[0][n - 2]);
        squares[0][n - 2].setSimulationObject(cj1);
        cj1.setMap(this);
        beings.add(cj1);
        CommonJedi cj2 = new CommonJedi();
        cj2.setSquare(squares[1][n - 2]);
        squares[1][n - 2].setSimulationObject(cj2);
        cj2.setMap(this);
        beings.add(cj2);

        MasterRebel mr = MasterRebel.getInstance();
        mr.setSquare(squares[m - 1][n - 1]);
        squares[m - 1][n - 1].setSimulationObject(mr);
        mr.setMap(this);
        beings.add(mr);
        CommonRebel cr1 = new CommonRebel();
        cr1.setSquare(squares[m - 2][n - 1]);
        squares[m - 2][n - 1].setSimulationObject(cr1);
        cr1.setMap(this);
        beings.add(cr1);
        CommonRebel cr2 = new CommonRebel();
        cr2.setSquare(squares[m - 2][n - 2]);
        squares[m - 2][n - 2].setSimulationObject(cr2);
        cr2.setMap(this);
        beings.add(cr2);
    }

    private void generateObstacle() {
        Obstacle first = new Obstacle();
        first.setSquare(squares[3][4]);
        squares[3][4].setSimulationObject(first);

        Obstacle second = new Obstacle();
        second.setSquare(squares[4][5]);
        squares[4][5].setSimulationObject(second);

        Obstacle third = new Obstacle();
        third.setSquare(squares[4][9]);
        squares[4][9].setSimulationObject(third);

        Obstacle fourth = new Obstacle();
        fourth.setSquare(squares[7][7]);
        squares[7][7].setSimulationObject(fourth);
    }

    public void printMap() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (squares[i][j].getSimulationObject() instanceof MasterGalacticEmpire) System.out.print("MGE");
                else if (squares[i][j].getSimulationObject() instanceof CommonGalacticEmpire) System.out.print("CGE");
                else if (squares[i][j].getSimulationObject() instanceof MasterStormStroopers) System.out.print("MST");
                else if (squares[i][j].getSimulationObject() instanceof CommonStormStroopers) System.out.print("CST");
                else if (squares[i][j].getSimulationObject() instanceof MasterJedi) System.out.print("MJ ");
                else if (squares[i][j].getSimulationObject() instanceof CommonJedi) System.out.print("CJ ");
                else if (squares[i][j].getSimulationObject() instanceof MasterRebel) System.out.print("MR ");
                else if (squares[i][j].getSimulationObject() instanceof CommonRebel) System.out.print("CR ");
                else if (squares[i][j].getSimulationObject() instanceof Obstacle) System.out.print(" O ");
                else System.out.print(" S ");
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
