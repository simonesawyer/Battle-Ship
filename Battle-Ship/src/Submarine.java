public class Submarine extends AbstractShips{
    Integer hitCells;
    Integer size;

    public Submarine(){
        this.hitCells = 0;
        this.size = 2;
    }

    @Override
    public Integer Size() {
        return size;
    }

    @Override
    public Integer hitCells(){
        return hitCells;
    }

    public void hit(){
        hitCells++;
    }

    public boolean sunk(){
        return hitCells == size;
    }
}
