package presentation;
import Cell.Water;
public class ConsolePrinter {
    private static final Integer xAxsis =10;
    private static final Integer yAxsis =10;
    public ConsolePrinter(){

    }
    public void toConsole(Map map){
        System.out.println("  A B C D E F G H I J");
        for(Integer row = 0; row < xAxsis; row++){
            System.out.print(row + " ");
            for(int column = 0; column < yAxsis; column++){
                if(map.getPosition(row, (char) column) instanceof Water){
                    System.out.print("~ ");
                }else{
                    System.out.print("o ");
                }
            }
        }
    }
}
