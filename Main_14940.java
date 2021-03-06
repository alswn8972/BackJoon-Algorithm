import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_14940 {
	static int N, M;
	static int[][] map;
	static int[][] ans;
	static int[] dx= {0,-1,0,1};
	static int[] dy= {-1,0,1,0};
	static Queue<Point> que;
	static class Point{
		int x;
		int y;
		int dis;
		Point(int x, int y, int dis){
			this.x=x;
			this.y=y;
			this.dis=dis;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		que=new LinkedList<>();
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		map=new int[N][M];
		ans=new int[N][M];

		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				ans[i][j]=987654321;
			}	
		}
		
		int x=0;
		int y=0;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				if(map[i][j]==2) {
					que.add(new Point(i,j,0));
				}
				if(map[i][j]==0) ans[i][j]=0;
			}	
		}
		bfs();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(ans[i][j]==987654321) {
					ans[i][j]=-1;
					bw.write(ans[i][j]+" ");
				}
				else bw.write(ans[i][j]+" ");
			}	
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
	static void bfs() {
		while(!que.isEmpty()) {
			Point po=que.poll();
			for(int d=0;d<4;d++) {
				int nx=po.x+dx[d];
				int ny=po.y+dy[d];
				int nd=po.dis+1;
				if(nx<0 ||ny<0||nx>=N||ny>=M) continue;
				if(map[nx][ny]==1 && ans[nx][ny]>nd) {
					ans[nx][ny]=nd;
					que.add(new Point(nx, ny, nd));
				}
				
			}
		}
		
	}
}
