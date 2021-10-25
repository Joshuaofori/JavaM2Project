public class Being extends Square{
   private String[] messages;
   private int energyPoints=100;
   private final int MAX_NUMBER_OF_MESSAGES=20;
   private int numberOfMessages=0;
   private Nation nation;
   public Being(){}


    public void move(){

    }
    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
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
