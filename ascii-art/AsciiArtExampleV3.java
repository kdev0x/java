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

public class AsciiArtExampleV3{
    public static void main(String[] args) {
        Board theBoard = new Board(16);
        theBoard.getBoard()[1][2] = 2;
        theBoard.draw();
    }

}
