public class Destroyer extends AbstractShips {

    public Destroyer(Integer hitCells, Integer size){
        super(size);
    }
    protected  Ships shipFactory(Integer newSize) { return new Destroyer(newSize,0); }
}
