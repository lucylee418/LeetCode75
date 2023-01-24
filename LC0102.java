import java.util.*;

public class LC0102 {
    // Initialize
    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public void helper(TreeNode node, int level) {
        // levels.size is less than or equal to the level
        // levels.size() == level means it's the 1st element in that level
        // create empty array for current level
        if (levels.size() == level)
            levels.add(new ArrayList<Integer>());

         // add the element to the current level
         levels.get(level).add(node.val);

         // process child nodes for the next level
         if (node.left != null)
            // left node in next level is added
            helper(node.left, level + 1);
         if (node.right != null)
            // right node in next level is added
            helper(node.right, level + 1);

        // There is no return. It just keeps updating levels array
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        return levels;
    }

    public static void main (String[] args){
        // Create TreeNodes
        TreeNode n1 = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode myTree = new TreeNode(3, new TreeNode(9), n1);
        
        // Creat object
        LC0102 lc0102 = new LC0102();
        List<List<Integer>> result = lc0102.levelOrder(myTree);

        // print values
        System.out.println(result);
    }
    
}
