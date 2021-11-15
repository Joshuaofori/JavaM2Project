public abstract class Being extends SimulationObject {
    private String[] messages;

    private int energyPoints = 100;
    private final int MAX_NUMBER_OF_MESSAGES = 20;
    private int numberOfMessages = 0;

    Nation nation;

    private Map map;

    public Being() {
        super();
    }

    public abstract void move();

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

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
