class Cell{
    private char value;

    public Cell(){
        this.value = '.';
    }

    public Cell(char value){
        this.value = value;
    }

    public void setValue(char value){
        this.value = value;
    }

    public char getValue(){
        return this.value;
    }

    public void setX(){
        this.setValue('X');
    }

    public void setO(){
        this.setValue('O');
    }
}

class ColorCell extends Cell{
    private String color;
    
    public ColorCell(){
        this.color = "white";
    }

    public ColorCell(String color){
        this.color = color;
    }
}

class Board{
    private Cell [][] cells;

    public Board(){
        this.cells = new Cell[3][3];
        this.init();
    }

    public Cell[][] getCells(){
        return this.cells;
    }

    public void setValue(int row, int col, char value){
        if(row <= 2 && col <= 2){
            this.cells[row][col].setValue(value);
        }

        /* TODO: return error message */
    }

    public void setX(int row, int col){
        this.setValue(row, col, 'X');
    }

    public void setO(int row, int col){
        this.setValue(row, col, 'O');
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
    }
}

public class XOGameProject{
    public static void main(String[] args) {

        Board xoBoard = new Board();

        xoBoard.setX(0, 0);
        xoBoard.setO(0, 1);
        xoBoard.setX(0, 2);

        xoBoard.setX(1, 0);
        xoBoard.setO(1, 1);
        xoBoard.setO(1, 2);

        xoBoard.setO(2, 0);
        xoBoard.setX(2, 1);
        xoBoard.setX(2, 2);

        xoBoard.print();
    }   

}
