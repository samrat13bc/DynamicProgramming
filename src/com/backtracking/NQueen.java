package com.backtracking;

// There is chess board of N*N grid and n number of queens are there we have to find is there any solution for it 
//so that no other queen cut the other queen
public class NQueen {
	static final int N = 4;
	
	//Function for printing the solution
	public static void printSolution(int board[][]) {
		for(int i = 0 ; i < N ; i ++) {
			for(int j = 0; j < N ; j ++) {
				System.out.print(" "+ board[i][j] +" ");
			}
			
			System.out.println();
		}
	}
	
	//Main function for finding the solution
	public static boolean nQueenSol(int board[][], int row) {
		
		if( row == N) {
			return true;
		}
		
		for(int col = 0; col < N ; col++ ) {
			if(isSafe(board,row, col)) {
				board[row][col] = 1;
				if(nQueenSol(board,row+1)) {
					return true;
				}
				board[row][col] = 0;
			}
		}
		return false;
	}
	
	//Function for checking is it safe to place the queen there 
	public static boolean isSafe(int board[][] , int row, int col) {
		int i , j;
		for( i = 0; i < row; i ++) {
			if(board[i][col] == 1) {
				return false;
			}
		}
		
		for(i= row,j = col; i>=0 && j>=0; i--, j--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		
		for( i = row, j = col; j>=0 && i<N; i++, j--) {
			if(board[i][j]==1)
				return false;
		}
		
		return true;
	}
	
	public static boolean solution() {
		int board [][] = {{0, 0, 0, 0},
		           {0, 0, 0, 0},
		           {0, 0, 0, 0},
		           {0, 0, 0, 0}};
		if(nQueenSol(board, 0) == false) {
			System.out.println("No such solution exist");
			return false;
		}
		printSolution(board);
		return true;
	}
	
	public static void main(String[] args) {
		solution();
	}
	

}
