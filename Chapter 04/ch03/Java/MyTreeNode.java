package ch03;

public class MyTreeNode {
	
	private Student student;
	public MyTreeNode left;
	public MyTreeNode right;
	
	public MyTreeNode() {
		student = null;
		left = null;
		right = null;
	}
	
	public MyTreeNode(Student student) {
		this.student = student;
		this.left = null;
		this.right = null;
	}
	
	public Student getStudent() {
		return student;
	}
	
	
}
