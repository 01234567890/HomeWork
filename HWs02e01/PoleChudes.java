
import java.util.Scanner;

public class PoleChudes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);   
        int z = -9;  
        StringBuffer s1 = new StringBuffer("itis");
        StringBuffer s2 = new StringBuffer("0123");
         System.out.println(s2);
              while (s2.substring(0, 4).equals("itis")!=true){
                       String s = in.nextLine();
        for (int i = 0; i < 3; i++) {
            z = s1.indexOf(s,i);
            if (z >= 0) {
                s2.replace(z, z + 1, s);
                z = -9;
            }
        }
        System.out.println(s2);
    }
}
}