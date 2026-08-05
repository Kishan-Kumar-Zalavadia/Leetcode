/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean compare(TreeNode root, TreeNode find) {
        if (root==null && find==null) {
            return true;
        }
        if (root == null || find==null) {
            return false;
        }
        if (root.val != find.val) {
            return false;
        }
        return compare(root.left, find.left) && compare(root.right, find.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
            return false;

        if (compare(root, subRoot))
            return true;

        return isSubtree(root.left, subRoot)
            || isSubtree(root.right, subRoot);
    }
}