package com.company;

public class BinaryTree {

    static class Node{
        char data;
        Node left;
        Node right;
    }
    static void printLeafs(Node root){
        if(root==null)
        {
            return;
        }

            if(root.left==null && root.right==null)
            {
                System.out.print(root.data+" ");
                return;
            }
                if(root.left!=null)
                {
                    printLeafs(root.left);
                }
                    if(root.right!=null) {
                        printLeafs(root.right);
                    }
    }
    static Node newNode(char data)
    {
        Node temp=new Node();
        temp.data=data;
        temp.left=null;
        temp.right=null;
        return temp;
    }
    public static void main(String[] args) {
        Node tree=newNode('A');
        tree.left=newNode('B');
        tree.right=newNode('F');
        tree.left.left=newNode('C');
        tree.left.right=newNode('E');
        tree.right.left=newNode('G');
        tree.right.right=newNode('H');
        tree.left.left.left=newNode('D');
        tree.right.right.right=newNode('K');
        printLeafs(tree);
	// write your code here
    }
}
