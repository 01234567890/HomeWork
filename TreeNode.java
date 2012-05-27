
package list;

public class TreeNode {
    private int data;
    private TreeNode nextR;
    private TreeNode nextL;

    TreeNode(int data) {
        this.data = data;
        nextR = null;
        nextL = null;
    }
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setNextRight(TreeNode n) {
        this.nextR = n;
    }    
    public void setNextLeft(TreeNode n) {
        this.nextL = n;
    }
    public TreeNode getNextL() {
        return nextL;
    }
    public TreeNode getNextR() {
        return nextR;
    }
}

