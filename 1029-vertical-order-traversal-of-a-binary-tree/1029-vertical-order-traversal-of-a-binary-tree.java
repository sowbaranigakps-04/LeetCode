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
    Map<Integer, ArrayList<int[]>> mp = new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        traverse(root, 0,0);
        ArrayList<List<Integer>> ans = new ArrayList<>();

        for(List<int[]> temp : mp.values()) {
            // Collections.sort(temp);
            List<Integer> t = new ArrayList<>();
            temp.sort(Comparator.comparingInt(a -> a[0])); // sorting by val
            temp.sort(Comparator.comparingInt(a -> a[1]));  // then sorting by level
            for(int i = 0; i < temp.size(); i++) {
                t.add(temp.get(i)[0]);
            }
            ans.add(new ArrayList<>(t));
        }
        return ans;
    }
    private void traverse(TreeNode root, int col, int level) {
        if(root == null) {
            return;
        }

        if(mp.containsKey(col)) {
            int[] t = new int[2];
            t[0] = root.val;
            t[1] = level;

            mp.get(col).add(t);
            // mp.put(col, mp.get(col).add(root.val));
        }
        else {
            ArrayList<int[]> temp = new ArrayList<>();  //0.= val 1.= level
            int[] t = new int[2];
            t[0] = root.val;
            t[1] = level;
            temp.add(t);
            mp.put(col, temp);
        } 


        traverse(root.left, col-1, level+1);
        traverse(root.right, col+1, level+1);
        
    }
}