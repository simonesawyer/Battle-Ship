public class Cruiser extends AbstractShips {

    public Cruiser(Integer hitCells, Integer size){
        super(size);
    }
    protected  Ships shipFactory(Integer newSize) { return new Cruiser(newSize,0); }
}
