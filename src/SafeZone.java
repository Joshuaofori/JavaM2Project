public class SafeZone extends Square {
    Nation ownerNation;

    public SafeZone(int horizontalIndex, int verticalIndex, Nation ownerNation) {
        super(verticalIndex, horizontalIndex);
        this.ownerNation = ownerNation;
    }

    public Nation getOwnerNation() {
        return ownerNation;
    }
}
