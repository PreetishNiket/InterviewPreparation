package BackTracking;

import java.util.Scanner;

public class RatInAMazePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int maze[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				maze[i][j] = s.nextInt();
			}
		}
		ratInAMaze(maze);
	}

	public static void ratInAMaze(int maze[][]) {
		int n = maze.length;
		int path[][] = new int[n][n];
		ratInAMaze(maze, 0, 0, path);
	}

	private static void ratInAMaze(int[][] maze, int i, int j, int[][] path) {
		int n = maze.length;
		if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
			return;
		}
		path[i][j] = 1;
		if (i == n - 1 && j == n - 1) {
			for (int r = 0; r < n; r++) {
				for (int c = 0; c < n; c++) {
					System.out.print(path[r][c] + " ");
					
				}
			}
			System.out.println();
			path[i][j] = 0;
			return;
		}
		ratInAMaze(maze, i - 1, j, path);
		ratInAMaze(maze, i + 1, j, path);
		ratInAMaze(maze, i, j + 1, path);
		ratInAMaze(maze, i, j - 1, path);
		path[i][j]=0;
		
	}

}
