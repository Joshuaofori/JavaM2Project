public class MasterGalacticEmpire extends EvilMasterBeing {

    private static MasterGalacticEmpire unique;

    private MasterGalacticEmpire() {
        super();
    }

    public static MasterGalacticEmpire getInstance() {
        if (unique == null) {
            unique = new MasterGalacticEmpire();
        }
        return unique;
    }

    @Override
    public void move() {
        // MASTERS ARE STATIC
    }
}
