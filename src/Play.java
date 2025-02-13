import java.util.Scanner;
public class Play {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Player 1 is X, Player 2 is O");
        System.out.println("Enter the row and column to play");
        TicTacToe game = new TicTacToe();
        
        while(game.isGameOver()==false){
            game.turn();
        }    
            // your code here
            System.out.println("The game is over");
            if(game.getWinner()==1 || game.getWinner()==2){
                System.out.println("The winner is player " + game.getWinner());
            }else{
                System.out.println("No winner. The result is a draw");
            }
            
            
        
        scanner.close();
    }
}
