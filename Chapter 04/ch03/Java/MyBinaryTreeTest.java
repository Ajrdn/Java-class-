package ch03;

public class MyBinaryTreeTest {

	public static void main(String[] args) {
		
		MyBinaryTree bTree = new MyBinaryTree();
		
		bTree.addElement(new Student(10, "A"));
		bTree.addElement(new Student(5, "B"));
		bTree.addElement(new Student(1, "C"));
		bTree.addElement(new Student(7, "D"));
		bTree.addElement(new Student(12, "E"));
		bTree.addElement(new Student(14, "F"));
		
		bTree.preOrder(bTree.getRoot());
	}

}
