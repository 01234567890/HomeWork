
package tree1;
class Tree {
   public Tree left;            
   public Tree right;
   public int key;

   public Tree(int k) {        
      key = k;
   }

   public void add( Tree aTree) {
     if ( aTree.key > key )
        if ( left != null ) left.add( aTree );
        else left = aTree;
     else
        if ( right!= null ) right.add( aTree );
        else right = aTree;
   }

   public void traverse() {
      if ( right != null) right.traverse();
      System.out.println( " " + key );
      if ( left != null ) left.traverse();
   }
}
