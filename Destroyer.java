package Ship;

public class Destroyer extends AbstractShips {

    public Destroyer(Integer size){
        super(size);
    }

    protected Ships shipFactory(Integer newSize) {
        return new Destroyer(newSize);
    }
}
