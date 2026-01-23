package Lecture46;

import java.util.*;
public class TopView {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    class Solution {
        public List<Integer> verticalTraversal(TreeNode root) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            List<Integer> ll = new ArrayList<>();
            View(root,0, map);
            for(int key: map.keySet()){
                ll.add(map.get(key));
            }
            return ll;
        }

        public void View(TreeNode root, int curr, TreeMap<Integer, Integer> map){
            if(root == null) return;

            if(!map.containsKey(curr)){
                map.put(curr, root.val);
            }
            View(root.left,curr-1, map);
            View(root.right,curr+1, map);
        }
    }
}
