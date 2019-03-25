import java.util.*;


public class breadthIn{
    static IntTreeNode root;
    public static void main(String[] x){
        root=new IntTreeNode(5,null,null);
        IntTreeNode c=root;
        int y=c.data;
        root.left=new IntTreeNode(4,new IntTreeNode(7,null,null),new IntTreeNode(6,null,null));
        root.right=new IntTreeNode(8,null,null);
                    System.out.println('\u000c');
                    System.out.println(root.data);
       // breadthFirstTraversal();
    }

    public static void breadthFirstTraversal(){
        Queue<IntTreeNode> q=new LinkedList();
        int counter=0;
       if(root==null){
            return;
        }
        IntTreeNode currentNode=root;
        q.add(root);
        while(!q.isEmpty()){
            currentNode=(IntTreeNode)q.remove();
            if(currentNode.data==root.data){
            System.out.println(currentNode.data);
        }
            if(currentNode.left!=null){
                q.add(currentNode);
            }
            if(currentNode.right!=null){
                q.add(currentNode);
            }
            counter++;
            if(counter==9){
                break;
            }
        }
    }
}