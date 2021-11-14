public class MasterJedi extends GoodMasterBeing {

    private static MasterJedi unique;

    private MasterJedi() {

    }

    public static MasterJedi getInstance() {
        if (unique == null) {
            unique = new MasterJedi();
        }
        return unique;
    }
}
