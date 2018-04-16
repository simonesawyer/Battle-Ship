public class Cruiser extends AbstractShips {
    Integer hitCells;
    Integer size;

    public Cruiser(){
        this.hitCells = 0;
        this.size = 3;
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

