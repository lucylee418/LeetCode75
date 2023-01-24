import java.util.*;

public class LC0589 {
    public List<Integer> preorder(Node root) {
        // Initialize
        LinkedList<Node> nodes = new LinkedList<>();
        LinkedList<Integer> valList = new LinkedList<>();
        // If the first root is null, return empty list
        if (root == null) {
          return valList;
        }
        // Else, add the first root
        nodes.add(root);
        // and loop
        while (!nodes.isEmpty()) {
            // pull out 3->(5->6)->2->4
            Node currNode = nodes.pollLast();
            // System.out.println("currNode: "+currNode.val);
            // System.out.println("nodes after pollLast: "+ nodes);
            valList.add(currNode.val);
            // Reverses the order of the elements in the specified list.
            if (currNode.children != null)
                {Collections.reverse(currNode.children);
                // Add from resersly (4->2->3->6->5)
                for (Node child : currNode.children) {
                    // 1st of grandchild will come before 2nd of first child
                    nodes.add(child);
                }
            }
            // System.out.println("nodes after addition: "+ nodes);
        }
        return valList;
      }

      public static void main (String[] args){
        // Create Nodes
        List<Node> l3_ch = new LinkedList<Node>();
        l3_ch.add(new Node(5));
        l3_ch.add(new Node(6));
        Node l3 = new Node(3, l3_ch);
        List<Node> l1_ch = new LinkedList<Node>();
        l1_ch.add(l3);
        l1_ch.add(new Node(2));
        l1_ch.add(new Node(4));
        Node root = new Node(1, l1_ch);

        // Creat object
        LC0589 lc0589 = new LC0589();
        List<Integer> result = lc0589.preorder(root);

        // print values
        System.out.println(result);
      }

}