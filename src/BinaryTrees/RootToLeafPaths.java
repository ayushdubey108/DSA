package BinaryTrees;

import java.util.ArrayList;

public class RootToLeafPaths {
    public static ArrayList<ArrayList<Integer>> Paths(KNode root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, arr, ans);
        return ans;
    }
    private static void dfs(KNode root,
                            ArrayList<Integer> arr,
                            ArrayList<ArrayList<Integer>> ans) {
        if (root == null) return;
        // Add current node to the current path
        arr.add(root.data);

        // If leaf node, save a copy of the current path
        if (root.left == null && root.right == null) {
            ArrayList<Integer> list = new ArrayList<>(arr);
            ans.add(list);
        }

        // Explore left and right subtrees
        dfs(root.left, arr, ans);
        dfs(root.right, arr, ans);

        // Backtrack
        arr.remove(arr.size() - 1);
    }

    public static class KNode {
        int data;
        KNode left;
        KNode right;

        public KNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}