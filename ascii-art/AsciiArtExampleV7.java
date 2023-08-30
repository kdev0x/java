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

public class AsciiArtExampleV7{
    public static void main(String[] args) {
        Board board = new Board(8, '.');
        if(!board.setValue(2, 2, '#')){
            return;
        }

        board.setValue(0, 0, 'k');
        board.draw();
    }

}
