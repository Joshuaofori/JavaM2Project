public class SafeZone extends Square{
    Nation ownerNation;
    public SafeZone(int verticalIndex, int horizontalIndex, Nation nation, Nation ownerNation){
        super(verticalIndex,horizontalIndex,nation);
        this.ownerNation=ownerNation;

    }

    public SafeZone(int verticalIndex, int horizontalIndex, Nation ownerNation){
        super(verticalIndex,horizontalIndex);
        this.ownerNation=ownerNation;
    }

    public Nation getOwnerNation() {
        return ownerNation;
    }
}
