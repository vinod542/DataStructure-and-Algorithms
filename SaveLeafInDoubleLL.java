class Node {
	Node left, right;
	int data;

	public Node(int d) {
		data = d;
		left = right = null;
	}
}

public class SaveLeafInDoubleLL {
	Node root, prev, head;

	public Node insertElements(int arr[], Node root, int index) {
		if (index < arr.length) {
			Node temp = new Node(arr[index]);
			root = temp;
			root.left = insertElements(arr, root.left, 2 * index + 1);
			root.right = insertElements(arr, root.right, 2 * index + 2);
		}
		return root;
	}

	public void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.data + " ");
			inorder(root.right);
		}
	}

	public void preOrder(Node root) {
		if (root != null) {
			System.out.println(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public Node extractLeafList(Node root) {
		if (root == null)
			return null;
		if (root.left == null && root.right == null) {
			if (head == null) {
				head = root;
				prev = root;
			} else {
				prev.right = root;
				root.left = prev;
				prev = root;
			}
			return null;
		}
		root.left = extractLeafList(root.left);
		root.right = extractLeafList(root.right);
		return root;

	}

	public void printDLL(Node head) {
		Node last = null;
		while (head != null) {
			System.out.print(head.data + "<-DLL->");
			last = head;
			head = head.right;
		}
	}

	public void KthToNode(Node node, int k) {

	}

	public static void main(String[] args) {
		SaveLeafInDoubleLL SLL = new SaveLeafInDoubleLL();
		int[] arr = { 12, 34, 5, 21, 6, 77, 8, 88, 76, 5, 43, 1, 33, 5 };
		SLL.root = SLL.insertElements(arr, SLL.root, 0);
		SLL.inorder(SLL.root);
		System.out.println(Thread.currentThread());
		System.out.println(" pre");
		SLL.preOrder(SLL.root);
		SLL.extractLeafList(SLL.root);
		SLL.printDLL(SLL.head);
	}

}
