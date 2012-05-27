
package vagner;

public class Vagner {  
 public int WF (String s1, String s2) {
 int n = s1.length(); 
 int m =s2.length();
 int D [][]=new int [n][m];
 int cost = 0;
 for (int i = 0; i <= n; i++) 
 D[i][0] = i;
 
 for (int j = 0; j <= m; j++) 
 D[0][j] = j;

 for (int i = 1; i <= n; i++) {
 for (int j = 1; j <= m; j++) {
 if (s1.charAt(i) == s2.charAt(j)) {
 cost = 0;
 }
 else {
 cost = 1;
 }
D[i][j] = Math.min(D[i-1][j]+1, D[i][j-1]+1);
D[i][j]= Math.min(D[i-1][j-1] + cost, D[i][j]);
 }
 }
return D[n][m];

 }
}
