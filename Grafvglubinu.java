
package grafvglubinu;
public class Grafvglubinu {
    int N=10;
    boolean [] visit=new boolean[N];
    int [] [] G=new int[N][N];

private  void dfs(int a)  {
 visit[a] = true;
 for (int i = 0; i < N; i++){
 if ((visit[i]==false) && G[a][i] == 1)  {

 visit[i] = true;
 dfs(i); 
 } 
 }
    
}
}