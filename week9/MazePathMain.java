package week9;

import java.util.Stack;

class MazeCell	{
	int i, j, dir;
	
	public MazeCell(int i, int j, int dir) {
		this.i = i;
		this.j = j;
		this.dir = dir;
	}
	public String toString()	{
		return "<" + i + "," + j + ">";
	}
}

class Maze1	{
	int [][]maze = {
			{1,1,1,1,1,1,1,1,1},
			{1,0,1,1,0,1,1,1,1},
			{1,0,0,1,0,1,1,1,1},
			{1,1,0,0,0,1,1,1,1},
			{1,1,1,0,0,0,1,1,1},
			{1,0,0,0,1,1,1,1,1},
			{1,1,0,1,0,0,0,1,1},
			{1,0,0,0,0,1,0,0,1},
			{1,1,1,1,1,1,1,1,1}
	};
	int m = maze.length-2;
	int n = maze[0].length-2;
	
	public void mazePath()	{
		int mark[][] = new int[maze.length][maze[0].length];
		int nextI,nextJ;
		Stack<MazeCell> stack1 = new Stack<MazeCell>();
		stack1.push(new MazeCell(1,1,1)); //������ �������
		while(!stack1.isEmpty()) {
			MazeCell mc = stack1.pop(); //mc.i , mc.j , mc.dir
			while(mc.dir <= 3)	{
				if(mc.dir == 0)	{ //�������� �̵�
					nextI = mc.i-1;
					nextJ = mc.j;
				} else if(mc.dir == 1)	{ //�������� �̵�
					nextI = mc.i;
					nextJ = mc.j+1;
				}  else if(mc.dir == 2)	{ //�������� �̵�
					nextI = mc.i+1;
					nextJ = mc.j;
				}  else { //�������� �̵�
					nextI = mc.i;
					nextJ = mc.j-1;
				}
				if(nextI == m && nextJ == n) { //���� ������ ����
					System.out.println("���� ������ ����");
					stack1.push(new MazeCell(mc.i, mc.j, mc.dir));
					stack1.push(new MazeCell(nextI, nextJ, 0));
					while(!stack1.isEmpty()) {
						mc = stack1.pop();
						System.out.println(mc);
					}
				}
				if(maze[nextI][nextJ] == 0 && mark[nextI][nextJ] == 0)	{ //��������
					mark[nextI][nextJ] = 1; //�湮
					stack1.push(new MazeCell(mc.i, mc.j, mc.dir));
					mc.i = nextI;
					mc.j = nextJ;
					mc.dir = 0; //������ �ʱ�ȭ
				}else {
					mc.dir++;
				}
			}
		}
		System.out.println("��ΰ� �������� ����");
	}
}

public class MazePathMain {
	public static void main(String[] args) {
		Maze1 maze1 = new Maze1();
		maze1.mazePath();
	}
}
