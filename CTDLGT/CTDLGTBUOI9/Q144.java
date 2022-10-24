package CTDLGTBUOI9;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q144 {
    public List<Integer> preoderTraversal (TreeNode root) {
        List<Integer> solution = new ArrayList<>();
        if (root == null) {
            return solution;
        }
        Stack<TreeNode> group = new Stack<>();
        group.push(root);
        while(!group.isEmpty()){
            TreeNode node = group.pop();
            solution.add(node.val);
            if(node.right != null) {
                group.push(node.right);
            }
            if(node.left != null) {
                group.push(node.left);
            }
        }
        return solution;
    }
}
