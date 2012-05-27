
package tree1;
public class TreeTest {
  public static void main(String args[]) {
     Tree myTree;
     myTree = new Tree( 7 );       // создать дерево
     myTree.add( new Tree( 5 ) );  // присоединить поддеревья
     myTree.add( new Tree( 9 ) );
     myTree.traverse();
  }
}