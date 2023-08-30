class Board{
    private int rows;
    private int cols;
    private char[][] board;
    private char defaultSymbol;

    public Board(int rows, int cols, char defaultSymbol){
        this.rows = rows;
        this.cols = cols;
        this.defaultSymbol = defaultSymbol;
        this.board = new char[this.rows][this.cols];
        this.fillBoard();
    }
    
    public Board(int size, char defaultSymbol){
        this.rows = size;
        this.cols = size;
        this.defaultSymbol = defaultSymbol;
        this.board = new char [this.rows][this.cols];
        this.fillBoard();
    }

    private void fillBoard(){
        for(int i = 0; i < this.rows; i++){
            for(int ii = 0; ii < this.cols; ii++){
                this.board[i][ii] = this.defaultSymbol;
            }
        }
    }

    public char[][] getBoard(){
        return this.board;
    }

    public char getDefaultSymbol(){
        return this.defaultSymbol;
    }

    public int getRows(){
        return this.rows;
    }



    public int getCols(){
        return this.cols;
    }

    public boolean setValue(int row, int col, char val){
        if(row < this.rows && col < this.cols){
            this.board[row][col] = val;
            return true;
        }
        return false;
    }

    public void draw(){
        for(int i = 0; i < this.rows; i++){
            for(int ii = 0; ii < this.cols; ii++){
                System.out.print(this.board[i][ii]);
            }
            System.out.println("");
        }

    }
}

public class AsciiArtExampleV8{
    public static void main(String[] args) {
        Board board = new Board(8, '.');
        board.draw();

        System.out.println("Rows: " + board.getRows());
    }

}
