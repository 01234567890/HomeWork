package CommandPrompt1;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CommandPrompt1 {
 public Path pa;
 public File file;
    public static void main(String args[]) {
       CommandPrompt1 cp1= new CommandPrompt1();
        Scanner in = new Scanner(System.in);
        String s = " ";
        Path home = Paths.get("C:\\Users\\Виктория\\Documents\\NetBeansProjects\\CommandPromp\\src\\CommandPrompt.java");
        while (s.equals("exit") != true) {
            s = in.nextLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            while (st.hasMoreTokens()) {
                if (st.nextToken().equalsIgnoreCase("cd")) {
                    cp1.pa = Paths.get(st.nextToken());
                    home = Paths.get(cp1.pa.toUri());
                    cp1.file = new File(cp1.pa.toUri());
                    if (cp1.file.exists()) {
                        System.out.format("%s%n", cp1.pa.toUri() + " ->");
                    } else {
                        System.err.format("%s: no such" + " file or directory%n", cp1.pa);
                    }
                }
               if (s.equalsIgnoreCase("help")){
                   System.out.println("CD             Вывод имени либо смена текущей папки");
                   System.out.println("EXIT           Завершение работы программы");
                   System.out.println("HELP          Выводит справочную информацию о командах Windows");
                   System.out.println("LS               Команда для получения списка файлов и директорий в текущей папке");
               }
               if(s.equalsIgnoreCase("ls")){    
                   cp1.file.toString();
                  String files[] = cp1.file.list();
                  for ( int i=0; i < files.length; i++) {
                        File f = new File(cp1.pa.toString()+ "/" + files[i]);
                            if (f.isDirectory()) { 
                  System.out.println (files[i] + "     is a directory");
                        } else {
                                    System.out.println(files[i] + "     is a file");
}
                  }
               }
               
               if(s.equalsIgnoreCase("ls -f")){
                   cp1.file.toString();
                  String files[] = cp1.file.list();
                  for ( int i=0; i < files.length; i++) {
                        File f = new File(cp1.pa.toString()+ "/" + files[i]);
                            if (f.isFile()) { 
                  System.out.println (files[i]+ "     ");
                            }
                  }
               }
               
               if(s.equalsIgnoreCase("ls -d")){
                  cp1.file.toString();
                  String files[] = cp1.file.list();
                  for ( int i=0; i < files.length; i++) {
                        File f = new File(cp1.pa.toString()+ "/" + files[i]);
                            if (f.isDirectory()) { 
                  System.out.println (files[i] + "     ");
                            }
                  }
               }
            }
        }
    }
}
