import java.util.List;
import java.util.Random;

public class Being {
   private String[] messages;

   private int energyPoints=100;
   private final int MAX_NUMBER_OF_MESSAGES=20;
   private int numberOfMessages=0;

   Nation nation;
    Random random;

    public Being(){
       super();
       random= new Random();
    }


    public int[] move(List<List<Integer>> spacesToFill){
        int positions[]= new int[2];
//        r += (r < 3 && c < 3 && aNation != Nation.JEDI) ? 3 : 0;
//        r += (r < 3 && c > 10 && aNation != Nation.GALACTIC_EMPIRE) ? 3 : 0;
//        r -= (r > 4 && c < 3 && aNation != Nation.REBELS) ? 3 : 0;
//        r -= (r > 4 && c > 10 && aNation != Nation.STORMTROOPERSS) ? 3 : 0;
        while(positions[0] < 3 && positions[1] < 3 && this.getNation() != Nation.JEDI){
            positions[0] = spacesToFill.get(0).get(random.nextInt(spacesToFill.get(0).size()));
            positions[1] = spacesToFill.get(1).get(random.nextInt(spacesToFill.get(1).size()));
        }
        while(positions[0] < 3 && positions[1] > 10 && this.getNation() != Nation.GALACTIC_EMPIRE){
            positions[0] = spacesToFill.get(0).get(random.nextInt(spacesToFill.get(0).size()));
            positions[1] = spacesToFill.get(1).get(random.nextInt(spacesToFill.get(1).size()));
        }
        while(positions[0] < 4 && positions[1] < 3 && this.getNation() != Nation.REBELS){
            positions[0] = spacesToFill.get(0).get(random.nextInt(spacesToFill.get(0).size()));
            positions[1] = spacesToFill.get(1).get(random.nextInt(spacesToFill.get(1).size()));
        }
        while(positions[0] < 4 && positions[1] > 10 && this.getNation() != Nation.STORMTROOPERSS){
            positions[0] = spacesToFill.get(0).get(random.nextInt(spacesToFill.get(0).size()));
            positions[1] = spacesToFill.get(1).get(random.nextInt(spacesToFill.get(1).size()));
        }

        return positions;

    }


    public String[] getMessages() {
        return messages;
    }

    public void setMessages(String[] messages) {
        this.messages = messages;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public void setEnergyPoints(int energyPoints) {
        this.energyPoints = energyPoints;
    }

    public int getMAX_NUMBER_OF_MESSAGES() {
        return MAX_NUMBER_OF_MESSAGES;
    }


    public int getNumberOfMessages() {
        return numberOfMessages;
    }

    public void setNumberOfMessages(int numberOfMessages) {
        this.numberOfMessages = numberOfMessages;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
