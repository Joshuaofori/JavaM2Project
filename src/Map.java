import java.util.Random;

public class Map {
    private int m, n;

    private Square[][] squares;
    private Being[] beings;

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

    public void startSimulation() {
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
        beings = new Being[20];

        beings[0] = MasterGalacticEmpire.getInstance();
        beings[0].setSquare(squares[0][0]);
        squares[0][0].setSimulationObject(beings[0]);
        beings[1] = new CommonGalacticEmpire();
        beings[1].setSquare(squares[0][1]);
        squares[0][1].setSimulationObject(beings[1]);
        beings[2] = new CommonGalacticEmpire();
        beings[2].setSquare(squares[1][1]);
        squares[1][1].setSimulationObject(beings[2]);

        beings[3] = MasterStormStroopers.getInstance();
        beings[3].setSquare(squares[m - 1][0]);
        squares[m - 1][0].setSimulationObject(beings[3]);
        beings[4] = new CommonStormStroopers();
        beings[4].setSquare(squares[m - 2][0]);
        squares[m - 2][0].setSimulationObject(beings[4]);
        beings[5] = new CommonStormStroopers();
        beings[5].setSquare(squares[m - 2][1]);
        squares[m - 2][1].setSimulationObject(beings[5]);

        beings[6] = MasterJedi.getInstance();
        beings[6].setSquare(squares[0][n - 1]);
        squares[0][n - 1].setSimulationObject(beings[6]);
        beings[7] = new CommonJedi();
        beings[7].setSquare(squares[0][n - 2]);
        squares[0][n - 2].setSimulationObject(beings[7]);
        beings[8] = new CommonJedi();
        beings[8].setSquare(squares[1][n - 2]);
        squares[1][n - 2].setSimulationObject(beings[8]);

        beings[9] = MasterRebel.getInstance();
        beings[9].setSquare(squares[m - 1][n - 1]);
        squares[m - 1][n - 1].setSimulationObject(beings[9]);
        beings[10] = new CommonRebel();
        beings[10].setSquare(squares[m - 2][n - 1]);
        squares[m - 2][n - 1].setSimulationObject(beings[10]);
        beings[11] = new CommonRebel();
        beings[11].setSquare(squares[m - 2][n - 2]);
        squares[m - 2][n - 2].setSimulationObject(beings[11]);
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
    }
}
