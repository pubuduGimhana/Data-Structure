package DataStructure;

public class binaryTree0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Binary Tree Node
		class Node {
		    int key;
		    Node left, right;

		    public Node(int item) {
		        key = item;
		        left = right = null;
		    }
		}

		// Binary Tree class
		class BinaryTree {
		    Node root;

		    BinaryTree() {
		        root = null;
		    }

		    // Insert a new key in the binary tree
		    void insert(int key) {
		        root = insertRec(root, key);
		    }

		    // A recursive function to insert a new key in the binary tree
		    Node insertRec(Node root, int key) {
		        // If the tree is empty, return a new node
		        if (root == null) {
		            root = new Node(key);
		            return root;
		        }

		        // Otherwise, recur down the tree
		        if (key < root.key)
		            root.left = insertRec(root.left, key);
		        else if (key > root.key)
		            root.right = insertRec(root.right, key);

		        // Return the (unchanged) node pointer
		        return root;
		    }

		    // Delete a key from the binary tree
		    void delete(int key) {
		        root = deleteRec(root, key);
		    }

		    // A recursive function to delete a key from the binary tree
		    Node deleteRec(Node root, int key) {
		        // Base case: if the tree is empty
		        if (root == null) return root;

		        // Recur down the tree
		        if (key < root.key)
		            root.left = deleteRec(root.left, key);
		        else if (key > root.key)
		            root.right = deleteRec(root.right, key);
		        else {
		            // Node with only one child or no child
		            if (root.left == null)
		                return root.right;
		            else if (root.right == null)
		                return root.left;

		            // Node with two children: Get the inorder successor (smallest in the right subtree)
		            root.key = minValue(root.right);

		            // Delete the inorder successor
		            root.right = deleteRec(root.right, root.key);
		        }

		        return root;
		    }

		    int minValue(Node root) {
		        int minValue = root.key;
		        while (root.left != null) {
		            minValue = root.left.key;
		            root = root.left;
		        }
		        return minValue;
		    }

		    // Pre-order traversal
		    void preOrder() {
		        preOrderRec(root);
		        System.out.println();
		    }

		    void preOrderRec(Node root) {
		        if (root != null) {
		            System.out.print(root.key + " ");
		            preOrderRec(root.left);
		            preOrderRec(root.right);
		        }
		    }

		    // In-order traversal
		    void inOrder() {
		        inOrderRec(root);
		        System.out.println();
		    }

		    void inOrderRec(Node root) {
		        if (root != null) {
		            inOrderRec(root.left);
		            System.out.print(root.key + " ");
		            inOrderRec(root.right);
		        }
		    }

		    // Post-order traversal
		    void postOrder() {
		        postOrderRec(root);
		        System.out.println();
		    }

		    void postOrderRec(Node root) {
		        if (root != null) {
		            postOrderRec(root.left);
		            postOrderRec(root.right);
		            System.out.print(root.key + " ");
		        }
		    }

		    // Driver code
		    public static void main(String[] args) {
		        BinaryTree tree = new BinaryTree();

		        // Insert nodes
		        tree.insert(50);
		        tree.insert(30);
		        tree.insert(20);
		        tree.insert(40);
		        tree.insert(70);
		        tree.insert(60);
		        tree.insert(80);

		        // Print traversals
		        System.out.print("Pre-order traversal: ");
		        tree.preOrder();

		        System.out.print("In-order traversal: ");
		        tree.inOrder();

		        System.out.print("Post-order traversal: ");
		        tree.postOrder();

		        // Delete a node
		        System.out.println("Delete 20");
		        tree.delete(20);
		        System.out.print("In-order traversal after deletion: ");
		        tree.inOrder();

		        System.out.println("Delete 30");
		        tree.delete(30);
		        System.out.print("In-order traversal after deletion: ");
		        tree.inOrder();

		        System.out.println("Delete 50");
		        tree.delete(50);
		        System.out.print("In-order traversal after deletion: ");
		        tree.inOrder();
		    }
		}


	}

}
