class Board{
    private int rows;
    private int cols;
    private int[][] board;

    public Board(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.board = new int[this.rows][this.cols];
    }

    public Board(int size){
        this.rows = size;
        this.cols = size;
        this.board = new int[this.rows][this.cols];
    }

    public int[][] getBoard(){
        return this.board;
    }

    public boolean setValue(int row, int col, int val){
        if(row < this.rows && col < this.cols){
            this.board[row][col] = val;
            return true;
        }
        return false;
    }

    public void draw(){
        for(int i = 0; i < this.board.length; i++){
            for(int ii = 0; ii < this.board[i].length; ii++){
                if(this.board[i][ii] == 0){
                    System.out.print(" ");  
                }else if(this.board[i][ii] == 1){
                    System.out.print("_");
                }else if(this.board[i][ii] == 2){
                    System.out.print("\\");
                }else if(this.board[i][ii] == 3){
                    System.out.print("/");
                }else if(this.board[i][ii] == 4){
                    System.out.print('-');
                }else if(this.board[i][ii] == 5){
                    System.out.print("|");
                }
                
            }
            System.out.println("");
       }
    }
}

public class AsciiArtExampleV5{
    public static void main(String[] args) {
        Board board = new Board(8);
        if(!board.setValue(4, 5, 3)){
            System.out.println("Value was not set");
        }

        if(!board.setValue(8,9,4)){
            System.out.println("value was not set");
        }
        board.draw();
    }

}
