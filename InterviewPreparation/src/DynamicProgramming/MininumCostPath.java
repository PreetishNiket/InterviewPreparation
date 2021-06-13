package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MininumCostPath {

	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    public static int[][] take2DInput() throws IOException{
	        String[] strRowsCols = br.readLine().trim().split("\\s");
	        int mRows = Integer.parseInt(strRowsCols[0]);
	        int nCols = Integer.parseInt(strRowsCols[1]);

	        if (mRows == 0) {
	            return new int[0][0];
	        }


	        int[][] mat = new int[mRows][nCols];

	        for (int row = 0; row < mRows; row++) {
	            String[] strNums; 
	            strNums = br.readLine().trim().split("\\s");
	            
	            for (int col = 0; col < nCols; col++) {
	                mat[row][col] = Integer.parseInt(strNums[col]);
	            }
	        }

	        return mat;
	    }
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[][] mat = take2DInput();
		System.out.println(minCostPath(mat));
	}

	public static int minCostPath(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		int storage[][] = new int[m][n];
		
		storage[m - 1][n - 1] = arr[m - 1][n - 1];
		// Last Row
		for(int j = n - 2; j >= 0; j--){
			storage[m - 1][j] = storage[m - 1][j + 1] + arr[m - 1][j];
		}
		// Last Column
		for(int i = m - 2; i >= 0; i--){
			storage[i][n - 1] = storage[i + 1][n - 1] + arr[i][n - 1];
		}
		
		for(int i = m - 2; i >= 0; i--){
			for(int j = n - 2; j >= 0; j--){
				storage[i][j] = arr[i][j] +  Math.min(storage[i][j + 1], 
						Math.min(storage[i + 1][j + 1], storage[i + 1][j]));
			}
		}
		return storage[0][0];
	}

}
