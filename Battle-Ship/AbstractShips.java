public abstract class AbstractShips implements Ships {
    protected Integer size;
    protected Integer hitCells;

    public AbstractShips(Integer size) {
        this.size = size;
        this.hitCells = 0;
    }

    protected abstract Ships shipFactory(Integer newSize);

    @Override
    public Integer getSize(){
        return this.size;
    }

    @Override
    public Integer hitCells() {
        return this.hitCells;
    }

    @Override
    public void hit(){
        hitCells++;
    }

    @Override
    public boolean sunk(){
        return hitCells.equals(size);
    }
}


