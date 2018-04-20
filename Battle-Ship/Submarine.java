public class Submarine extends AbstractShips {

    public Submarine(Integer hitCells, Integer size){
        super(size);
    }
    protected  Ships shipFactory(Integer newSize) { return new Submarine(newSize,0); }
}
