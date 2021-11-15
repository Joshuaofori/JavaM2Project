public abstract class CommonBeing extends Being {

    public CommonBeing() {
        super();
    }

    public void takeMessages(String[] messages, int num) {
        for (int i = 0; i < num; i++) {
            if (getNumberOfMessages() == getMAX_NUMBER_OF_MESSAGES()) break;

            getMessages()[getNumberOfMessages()] = messages[i];
            setNumberOfMessages(getNumberOfMessages() + 1);
        }
    }

    public String[] giveMessages(int num) {
        String[] messages = new String[num];
        for (int i = 0; i < num; i++) {
            if (i == getMAX_NUMBER_OF_MESSAGES()) break;

            messages[i] = getMessages()[i];
        }

        return messages;
    }
}
