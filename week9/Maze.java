package week9;

public class Maze {
	static int reached = 0;
	static int check[][] = new int[7][7];
	static int path[][] = new int[7][7];
	static int Maze[][] = {
			{1,1,1,1,1,1,1},
			{1,0,1,0,0,0,1},
			{1,0,1,0,1,0,1},
			{1,0,0,0,1,0,1},
			{1,0,1,1,1,0,1},
			{1,0,0,0,1,0,1},
			{1,1,1,1,1,1,1}
	};
	public static void back(int x, int y) {
		if(reached == 1)	{
			return;
		}
		path[x][y] = 1;
		System.out.println("<" + x + "," + y + ">");
		if(x == 5 && y == 5) {
			reached = 1;
			return;
		}
		check[x][y] = 1;
		if(Maze[x][y+1] == 0 && check[x][y+1] == 0)
			back(x,y+1); //오른쪽으로
		if(Maze[x-1][y] == 0 && check[x-1][y] == 0)
			back(x-1,y); //위로
		if(Maze[x+1][y] == 0 && check[x+1][y] == 0)
			back(x+1,y); //아래로
		if(Maze[x][y-1] == 0 && check[x][y-1] == 0)
			back(x,y-1); //왼쪽으로
	}
	public static void printMaze()	{
		for(int i = 0; i < path.length; i++)	{
			for(int j = 0; j < path[0].length; j++) {
				System.out.print(path[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		back(1,1);
		printMaze();
	}
}
