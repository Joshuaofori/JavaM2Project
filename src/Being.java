import java.util.List;
import java.util.Random;

public class Being {
   private String[] messages;

   private int energyPoints=100;
   private final int MAX_NUMBER_OF_MESSAGES=20;
   private int numberOfMessages=0;

    Random random;

    public Being(){
       super();
       random= new Random();
    }


    public int[] move(List<List<Integer>> spacesToFill){
        int positions[]= new int[2];
        positions[0] = spacesToFill.get(0).get(random.nextInt(spacesToFill.get(0).size()));
        positions[1] = spacesToFill.get(1).get(random.nextInt(spacesToFill.get(1).size()));
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
}
