package com.backtracking;
// Solve the Sudoku 
public class SudokuSolver {
	
	// printing the Sudoku
	public static void printSoduko(int board[][], int n) {
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n ; j++) {
				System.out.print(board[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
			if((i+1)%(int)Math.sqrt(n)==0) {
				System.out.println(" ");
			}
		}
	}
	
	
	
	// Main function for solving the sudoku
	public static boolean solveSudoku(int board[][], int n) {
		int row = -1; 
		int col = -1;
		boolean isEmpty = true;
		
		for(int i = 0; i < n ; i ++) {
			for( int j = 0; j < n ;j ++) {
				if(board[i][j] == 0) {
					row = i;
					col =j;
					isEmpty = false;
					break;
				}
			}
			if(!isEmpty) {
				break;
			}
		}
		if(isEmpty) {
			return true;
		}
		
		for(int num = 1 ; num <= n ; num ++) {
			if(isSafe(board, row, col, num)) {
				board[row][col] = num;
				if(solveSudoku(board, n)) {
					return true;
				}
				else {
					board[row][col] =0;
				}
			}
			
		}
		return false;
	}
	
	// Function for checking that number is safe or not
	public static boolean isSafe(int board[][] , int row, int col, int num) {
		
		// checking that number is there in the specified row 
		for(int i = 0 ; i < board.length; i ++) {
			if(board[row][i] == num) {
				return false;
			}
		}
		
		// checking that number is there in that specified column 
		for(int j = 0; j< board.length; j++) {
			if(board[j][col] == num) {
				return false;
			}
		}
		
		// checking that number is there in small box or not 
		int sqrt = (int)Math.sqrt(board.length);
		int boxRowStart = row - row % sqrt;
		int boxColStart = col - col % sqrt;
		for(int r = boxRowStart; r < boxRowStart + sqrt; r++) {
			for(int d = boxColStart; d< boxColStart + sqrt; d++) {
				if(board[r][d] == num) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean solution() {
		int board[][] = new int[][]{ {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
				          {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
		                  {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
		                  {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
		                  {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
		                  {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
		                  {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
		                  {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
		                  {0, 0, 5, 2, 0, 6, 3, 0, 0}};
		int N = board.length;
		if(solveSudoku(board, N)) {
			printSoduko(board,N);
			return true;
		}
		else {
			System.out.println("No solution");
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		solution();
	}

}
