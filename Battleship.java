public class Battleship extends AbstractShips {
    Integer hitCells;
    Integer size;

    public Battleship(){
        this.hitCells = 0;
        this.size = 4;
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
