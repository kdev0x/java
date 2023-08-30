class Board{
    private int rows;
    private int cols;
    private char[][] board;

    public Board(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.board = new char[this.rows][this.cols];
    }

    public Board(int size){
        this.rows = size;
        this.cols = size;
        this.board = new char [this.rows][this.cols];
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

public class AsciiArtExampleV6{
    public static void main(String[] args) {
        Board board = new Board(8);
        if(!board.setValue(4, 5, '%')){
            System.out.println("Value was not set");
        }

        if(!board.setValue(2,2,'*')){
            System.out.println("value was not set");
        }
        board.draw();
    }

}
