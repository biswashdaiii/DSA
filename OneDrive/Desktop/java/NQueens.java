
import java.util.ArrayList;
import java.util.List;

public class NQueens {
    boolean isSafe(char[][] board,int row,int col){
        //checking horizantally
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }

        }
        //checking vertically
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //checking diagonally upward left

        int i = row;
        for(int j= col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }

        }
        

        //checking  diagonally downawrd right
        i = row;
        for(int j= col;i<board.length && j<board.length;i++,j++){
            if(board[i][j]=='Q'){
                return false;
            }

        }

        //checking diagonally upward right


        i = row;
        for(int j= col;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }

        }
        //checking diagonally downward right
        
        i = row;
        for(int j= col;i<board.length && j>=0;i++,j--){
            if(board[i][j]=='Q'){
                return false;
            }

        }
        return true;
    }


    void NQueensHelper(int board[][],List<List<String>>allsoln,int col){
        if(col==board.length){
            //save solution to allsoln list
            return;
        }
        for(int row=0; row<board.length;row++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                NQueensHelper(board,allsoln,col+1);
                board[row][col]='.';

            }
        }
    }

    public static void main(String[] args) {
        char board [][] = char [4][4];
        List<List<String>> queens = new ArrayList<>();
        NQueens q = new NQueens();
        q.NQueensHelper(board,allsoln,0);

    }
    
}
