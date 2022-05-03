package ch03;

public class MyBinaryTreeTest {

	public static void main(String[] args) {
		
		MyBinaryTree bTree = new MyBinaryTree();
		
		bTree.addElement(new Student(10, "±ÔÁø"));
		bTree.addElement(new Student(5, "¼¼ÈÆ"));
		bTree.addElement(new Student(1, "¼º¼ö"));
		bTree.addElement(new Student(7, "±×..."));
		bTree.addElement(new Student(12, "¹Î¼®"));
		bTree.addElement(new Student(14, "¾Ö¶õ"));
		
		bTree.preOrder(bTree.getRoot());
	}

}
