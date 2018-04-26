package Ship;

public class Battleship extends AbstractShips {

    public Battleship(Integer size){
        super(size);
    }

    protected Ships shipFactory(Integer newSize) {
        return new Battleship(newSize);
    }
}
