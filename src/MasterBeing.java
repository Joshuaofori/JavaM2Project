public abstract class MasterBeing extends Being {

    private Boolean collectedAllMessages = false;

    public MasterBeing() {
        super();
    }

    public void takeAllMessage(String[] messages, int num) {
        for (int i = 0; i < num; i++) {
            if (getNumberOfMessages() == getMAX_NUMBER_OF_MESSAGES()) {
                collectedAllMessages = true;
                break;
            }

            getMessages()[getNumberOfMessages()] = messages[i];
            setNumberOfMessages(getNumberOfMessages() + 1);
        }
    }

    public boolean hasCollectedAllMessage() {
        return collectedAllMessages;
    }
}
