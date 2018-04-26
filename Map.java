package presentation;
import Cell.Cell;

public class Map {
    private static final Integer xAxsis =10;
    private static final Integer yAxsis =10;
    private Cell[][] map;

    public Map(){
        this.map = new Cell[xAxsis][yAxsis];
    }
    public void setUp (){
        for(int row = 0; row < xAxsis; row++){
            for(int column = 0; column < yAxsis; column++) map[row][column] = new Cell();
        }
    }
    public Cell getPosition(Integer row, char column){
        return map[row][column-64];
    }

    public void setCell(Integer row, Character column, Cell type){
        map[row][column] = type;
    }

    public  void prettyPrint(ConsolePrinter printer){
        printer.toConsole(this);
    }
}
