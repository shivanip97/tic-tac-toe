import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class TicTacToe{
	
static Scanner input = new Scanner(System.in);
static Random comp = new Random();
//static char[][] Grid = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
static 	boolean result = false;
static int i, k;
static List<Tuple> unfilled = new ArrayList<Tuple>();
static int row;
static int column;
Tuple t = new Tuple(row, column);

public static void drawBoard(char[][] Grid){
	System.out.println(Grid[0][0] + " " + Grid[0][1] + " " + Grid[0][2]);
	System.out.println(Grid[1][0] + " " + Grid[1][1] + " " + Grid[1][2]);
	System.out.println(Grid[2][0] + " " + Grid[2][1] + " " + Grid[2][2]);
}

public static void makeUserMove(char[][] Grid, char X, char O, List<Tuple> unfilled2){
	if(checkIfWinner(Grid, 'X', 'O', unfilled2) == false){
	System.out.println("Please select the row and column you want to pick");
	for(int j = 0; j < unfilled2.size(); j++){
		Tuple tup1 = unfilled2.get(j);
	}
	System.out.println(unfilled2);
	i = input.nextInt();
	Grid[unfilled2.get(i).getRow()][unfilled2.get(i).getColumn()] = 'X';
	unfilled2.remove(i);
	drawBoard(Grid);
	}
}

public static void makeComputerMove(char[][] Grid, char X, char O, List<Tuple> unfilled2){
	if(checkIfWinner(Grid, 'X', 'O', unfilled2) == false){
	System.out.println("Now it's computer's turn");
    k = comp.nextInt(unfilled2.size()); 
	Grid[unfilled2.get(k).getRow()][unfilled2.get(k).getColumn()] = 'O';
	unfilled2.remove(k);
	drawBoard(Grid);
}
}
public static void checkForWinOrDraw(char[][] Grid, char X, char O, List<Tuple> unfilled2){
	
	if ((result == false) && (Grid[0][0] == X && Grid[0][1] == X && Grid[0][2] == X || 
            Grid[1][0] == X && Grid[1][1] == X && Grid[1][2] == X || 
            Grid[2][0] == X && Grid[2][1] == X && Grid[2][2] == X || 
            Grid[0][0] == X && Grid[1][0] == X && Grid[2][0] == X || 
            Grid[0][1] == X && Grid[1][1] == X && Grid[2][1] == X || 
            Grid[0][2] == X && Grid[1][2] == X && Grid[2][2] == X || 
            Grid[0][0] == X && Grid[1][1] == X && Grid[2][2] == X ||      
            Grid[2][0] == X && Grid[1][1] == X && Grid[0][2] == X)){       

            System.out.println("User wins");
            result = true;
	}
	
        else if((result == false) && (Grid[0][0] == O && Grid[0][1] == O && Grid[0][2] == O || 
                Grid[1][0] == O && Grid[1][1] == O && Grid[1][2] == O || 
                Grid[2][0] == O && Grid[2][1] == O && Grid[2][2] == O || 
                Grid[0][0] == O && Grid[1][0] == O && Grid[2][0] == O || 
                Grid[0][1] == O && Grid[1][1] == O && Grid[2][1] == O || 
                Grid[0][2] == O && Grid[1][2] == O && Grid[2][2] == O || 
                Grid[0][0] == O && Grid[1][1] == O && Grid[2][2] == O ||      
                Grid[2][0] == O && Grid[1][1] == O && Grid[0][2] == O)){       


            System.out.println("Computer wins");
            result = true;
        }
        else if((result == false) &&unfilled2.isEmpty()){
        	System.out.println("It's a tie");
        	result = true;
        }
}

public static boolean checkIfWinner(char[][] Grid, char X, char O, List<Tuple> unfilled2){

	if (Grid[0][0] == X && Grid[0][1] == X && Grid[0][2] == X || 
            Grid[1][0] == X && Grid[1][1] == X && Grid[1][2] == X || 
            Grid[2][0] == X && Grid[2][1] == X && Grid[2][2] == X || 
            Grid[0][0] == X && Grid[1][0] == X && Grid[2][0] == X || 
            Grid[0][1] == X && Grid[1][1] == X && Grid[2][1] == X || 
            Grid[0][2] == X && Grid[1][2] == X && Grid[2][2] == X || 
            Grid[0][0] == X && Grid[1][1] == X && Grid[2][2] == X ||      
            Grid[2][0] == X && Grid[1][1] == X && Grid[0][2] == X){       

            return true;
            
	}
	
        else if(Grid[0][0] == O && Grid[0][1] == O && Grid[0][2] == O || 
                Grid[1][0] == O && Grid[1][1] == O && Grid[1][2] == O || 
                Grid[2][0] == O && Grid[2][1] == O && Grid[2][2] == O || 
                Grid[0][0] == O && Grid[1][0] == O && Grid[2][0] == O || 
                Grid[0][1] == O && Grid[1][1] == O && Grid[2][1] == O || 
                Grid[0][2] == O && Grid[1][2] == O && Grid[2][2] == O || 
                Grid[0][0] == O && Grid[1][1] == O && Grid[2][2] == O ||      
                Grid[2][0] == O && Grid[1][1] == O && Grid[0][2] == O){       


            return true;
        }
        else if(unfilled2.isEmpty()){
        	return true;
        }
	
	return false;
}

public static void main(String[] args){
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
			unfilled.add(new Tuple(i, j));
		}
	}
	/*unfilled.add(new Tuple(0,0));
	unfilled.add(new Tuple(0,1));
	unfilled.add(new Tuple(0,2));
	unfilled.add(new Tuple(1,0));
	unfilled.add(new Tuple(1,1));
	unfilled.add(new Tuple(1,2));
	unfilled.add(new Tuple(2,0));
	unfilled.add(new Tuple(2,1));
	unfilled.add(new Tuple(2,2));*/
	
	TicTacToe newGame = new TicTacToe();
	char[][] Grid1 = new char[3][3];
	newGame.drawBoard(Grid1);
    for(int i = 0; i < 3; i++){
    	for(int j = 0; j < 3; j++){
    		while(result == false){
    			TicTacToe.makeUserMove(Grid1, 'X', 'O', unfilled);
    			newGame.checkForWinOrDraw(Grid1, 'X', 'O', unfilled);
    			newGame.makeComputerMove(Grid1, 'X', 'O', unfilled);
    			newGame.checkForWinOrDraw(Grid1, 'X', 'O', unfilled);
    		}
    	}
    }

}
}
