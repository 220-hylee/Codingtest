package cote_practice7;

import java.util.LinkedList;
import java.util.Queue;

// 한번더 설명을 들어보기..
// 큐로구현하는데, 큐에는 좌표와 얼만큼 왔는지에 대한 카운팅 정보가 있어야함.
// 데이터는 클래스로 관리

class SaveClass{
	private int x;
	private int y;
	private int distance;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
}
public class 게임맵최단거리_bfs{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] maps = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
//				{ 0, 0, 0, 0, 1 } };
		int[][] maps = {{1,1,1}};
		Queue<SaveClass> q = new LinkedList<SaveClass>();
		SaveClass sc = new SaveClass();
		int result =0;
		sc.setX(0);
		sc.setY(0);
		sc.setDistance(0);
//		if(maps[0][0]==0)
//			return -1;
//		if(maps)
		maps[0][0]++;
		q.add(sc);
		System.out.println(maps[0].length-1);
		while(true) {
			if(q.isEmpty()) {
				result = -1;
				break;
			}
			sc=q.poll();
			System.out.println(sc.getX()+" : " + sc.getY());
			
			System.out.println();
			int x = sc.getX();
			int y = sc.getY();
			int count = sc.getDistance();
			
			if(x==maps.length-1 && y==maps[0].length-1) {
				if(maps[x][y]==0)
					result = -1;
				result = count;
				break;
			}
			
			if(x != maps.length-1 && maps[x+1][y] == 1) {
				SaveClass sc1 = new SaveClass();
				sc1.setX(x+1);
				sc1.setY(y);
				sc1.setDistance(count+1);
				q.add(sc1);
				maps[x+1][y]++;
			}
			if(y != maps[0].length-1 && maps[x][y+1] == 1) {
				SaveClass sc1 = new SaveClass();
				sc1.setX(x);
				sc1.setY(y+1);
				sc1.setDistance(count+1);
				q.add(sc1);
				maps[x][y+1]++;
			}
			if(x != 0) {
				if(maps[x-1][y] == 1) {
					sc.setX(x-1);
					sc.setY(y);
					sc.setDistance(count+1);
					q.add(sc);
					maps[x-1][y]++;
				}
			}
			if(y != 0) {
				if(maps[x][y-1] == 1) {
					sc.setX(x);
					sc.setY(y-1);
					sc.setDistance(count+1);
					q.add(sc);
					maps[x][y-1]++;
				}
			}
		}
		if(result != -1)
			result++;
//		if(result == 1)
//			result =-1;
		System.out.println(result);
		
	}


}
