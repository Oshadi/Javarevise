package GoldmanSachs;
//Implement a binary search tree
//Binary search tree it self is a binary tree
//the difference is in the way that you add values
//In binary search tree always the smaller elements to the root is on the left hand side 
//and the bigger elements to the root is on the right hand side.
//when implementing a Binary search tree take your first node as a root node.



public class Day_4_Tree_Implementation {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		//Insert values
		tree.insert(8);
		tree.insert(7);
		tree.insert(12);
		tree.insert(15);
		tree.insert(2);
		tree.insert(5);
		
		//delete a value
		tree.delete(15);
		//Traverse tree DFS
			//inorder
			tree.inorder();
		System.out.println();
		System.out.println();
			//preorder
			tree.preorder();
		System.out.println();
		System.out.println();
			//postorder
			tree.postorder();

	}

}
