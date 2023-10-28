enum CellValue{
    EMPTY,
    X,
    O
}

class Cell{
    private CellValue value;

    public Cell(){
        this.value = CellValue.EMPTY;
    }

    public Cell(CellValue value){
        this.value = value;
    }

    public void setValue(CellValue value){
        this.value = value;
    }

    public CellValue getValue(){
        return this.value;
    }

    public void setX(){
        this.setValue(CellValue.X);
    }

    public void setO(){
        this.setValue(CellValue.O);
    }
}

class Board{
    private Cell [][] cells;
    private CellValue winner;
    public static final int CELLSCOUNT = 3;

    public Board(){
        this.cells = new Cell[3][3];
        this.winner = CellValue.EMPTY;
        this.init();
    }

    public Cell[][] getCells(){
        return this.cells;
    }

    public CellValue getWinner(){
        return this.winner;
    }

    public void setValue(int row, int col, CellValue value){
        if(row <= 2 && col <= 2){
            this.cells[row][col].setValue(value);
        }

        // this.solved();

        /* TODO: return error message */
    }

    public void setX(int row, int col){
        this.setValue(row, col, CellValue.X);
    }

    public void setO(int row, int col){
        this.setValue(row, col, CellValue.O);
    }

     public void init(){
        for(int row = 0; row < this.cells.length; row++){
            for(int col = 0; col < this.cells[row].length; col++){
                this.cells[row][col] = new Cell();
            }
        }
    }

    public void print(){
        System.out.println();
        for(int row = 0; row < this.cells.length; row++){
            for(int col = 0; col < this.cells[row].length; col++){
                System.out.print("  " + this.cells[row][col].getValue() + "  ");
            }
            System.out.println();
        }
        System.out.println();
    } //

    protected boolean rowSolved(){
        boolean result = false;
        
        for(int row = 0; row < Board.CELLSCOUNT; row++){
            CellValue firstCell = this.cells[row][0].getValue();
            CellValue secondCell = this.cells[row][1].getValue();
            CellValue thirdCell = this.cells[row][2].getValue();

            result = (firstCell == secondCell) && (firstCell == thirdCell);
            if(result) {
                this.winner = firstCell;
                break;
            }
        }

        System.out.println("THE ROW RESULT: " + result);
        return result;
    }

    protected boolean colSolved(){
        boolean result = false;
       
        for(int col = 0; col < Board.CELLSCOUNT; col++){
            result = (this.cells[0][col].getValue() == this.cells[1][col].getValue()) &&
                     (this.cells[2][col].getValue() == this.cells[0][col].getValue());
        
            if(result){
                this.winner = this.cells[0][col].getValue();
                break;
            }
        }

        System.out.println("THE COL RESULT: " + result);

        return result;
    }

    protected boolean crossSolved(){
        boolean result = false;
        
        CellValue firstCell = this.cells[0][0].getValue();
        CellValue secondCell = this.cells[1][1].getValue();
        CellValue thirdCell = this.cells[2][2].getValue();

        result = (firstCell == secondCell) && (firstCell == thirdCell);
        if(result) {
            this.winner = firstCell;
        }else{
            firstCell = this.cells[0][2].getValue();
            secondCell = this.cells[1][1].getValue();
            thirdCell = this.cells[2][0].getValue(); 
            
            result = (firstCell == secondCell) && (firstCell == thirdCell);
            if(result) {
                this.winner = firstCell;
            }
        }
       
        System.out.println("THE COL RESULT: " + result);
        return result;
    }

    public boolean solved(){
        return (this.rowSolved() || this.colSolved() || this.crossSolved());
    }

}

public class XOGameProject{
    public static void main(String[] args) {

        Board xO = new Board();

        xO.setO(0, 0);
        xO.setO(0, 1);
        xO.setX(0, 2);

        xO.setO(1, 0);
        xO.setX(1, 1);
        xO.setX(1, 2);

        xO.setX(2, 0);
        xO.setO(2, 1);
        xO.setO(2, 2);

        xO.print();

        if(xO.solved()){
            System.out.println("The winner is " + xO.getWinner());
        }
       
    }

}
