/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    Queue<Node> q = new LinkedList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null) return result;

        // List<Integer> temp = new ArrayList<>();
        // for(Node child: root.children){
        //     // List<Integer> temp = new ArrayList<>();
        //     temp.add(child.val);
        //     levelOrder(child);
        // }
        
        // // levelOrder(child);   
        // return result;

        q.add(root);
        while(q.isEmpty() == false){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            Node t = null;
            for(int i=0; i<size; i++){ 
                t = q.poll();
                temp.add(t.val);

                for(Node child: t.children){
                q.add(child);
                }
            }
            

            result.add(temp);
        }

        return result;


    }
}