class Symbol{
    private char value;

    public Symbol(){
        this.value = '.';
    }

    public Symbol(char value){
        this.value = value;
    }

    public void draw(){
        System.out.println(this.value);
    }
}


class Board{
    private int rows;
    private int cols;
    private Symbol[][] board;
    private Symbol defaultSymbol;

    public Board(int rows, int cols, Symbol defaultSymbol){
        this.rows = rows;
        this.cols = cols;
        this.defaultSymbol = defaultSymbol;
        this.board = new Symbol[this.rows][this.cols];
        this.fillBoard();
    }
    
    public Board(int size, Symbol defaultSymbol){
        this.rows = size;
        this.cols = size;
        this.defaultSymbol = defaultSymbol;
        this.board = new Symbol [this.rows][this.cols];
        this.fillBoard();
    }

    private void fillBoard(){
        for(int i = 0; i < this.rows; i++){
            for(int ii = 0; ii < this.cols; ii++){
                this.board[i][ii] = this.defaultSymbol;
            }
        }
    }

    public Symbol[][] getBoard(){
        return this.board;
    }

    public Symbol getDefaultSymbol(){
        return this.defaultSymbol;
    }

    public int getRows(){
        return this.rows;
    }

    public int getCols(){
        return this.cols;
    }

    public boolean setValue(int row, int col, Symbol val){
        if(row < this.rows && col < this.cols){
            this.board[row][col] = val;
            return true;
        }
        return false;
    }

    public void draw(){
        for(int i = 0; i < this.rows; i++){
            for(int ii = 0; ii < this.cols; ii++){
                this.board[i][ii].draw();
            }
            System.out.println("");
        }
    }
}

public class AsciiArtExampleV10{
    public static void main(String[] args) {
        int asciiCode = 65;
        Board board = new Board(8, new Symbol('.'));
    
        for(int i = 0; i < board.getRows() ; i++){
            for(int ii = 0; ii < board.getCols(); ii++){
                board.setValue(i, ii, new Symbol((char)asciiCode));
                asciiCode++;
            }
        }
        board.draw();
    }

}
