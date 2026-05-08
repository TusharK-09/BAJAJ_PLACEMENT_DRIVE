class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> level_order = new ArrayList<>();
        if(root == null) return new ArrayList<>(); 
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            
            for(int i=0; i<size; i++){
                TreeNode x = q.poll();
                level.add(x.val);

                if(x.left != null) q.offer(x.left);
                if(x.right != null) q.offer(x.right);
            }
            level_order.add(level);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(ArrayList<Integer> list : level_order){
            result.add(list.get(list.size() - 1));
        }
        return result;
    }
}