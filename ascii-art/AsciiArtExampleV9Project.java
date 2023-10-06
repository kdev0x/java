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

    public void draw(int x, int y){
        for(int line = 1; line <= y; line++){
            System.out.println("");
        }

        for(int i = 0; i < this.rows; i++){
            for(int offset = 1; offset <= x; offset++){
                System.out.print(" ");
            }
            for(int ii = 0; ii < this.cols; ii++){
                System.out.print(this.board[i][ii]);
            } 

            System.out.println("");
        }
    }
}

public class AsciiArtExampleV9Project{
    public static void main(String[] args) {
        int rows = 3;
        int cols = 6;

        Board b1 = new Board(rows, cols, 'K');
        b1.draw();

        Board b2 = new Board(rows,cols,'H');
        b2.draw(cols,0);

        Board b3 = new Board(rows, cols,'A');
        b3.draw(cols*2, 0);

        Board b4 = new Board(rows, cols,'L');
        b4.draw(cols*3, 0);
        
        Board b5 = new Board(rows, cols, 'I');
        b5.draw(cols*2,0);

        Board b6 = new Board(rows, cols, 'D');
        b6.draw(cols, 0);

        Board b7 = new Board(rows, cols, '?');
        b7.draw(); 
    }   

}
