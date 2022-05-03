package ch03;

public interface IBinaryTree {
	
	public void addElement(Student student);
	public String removeElement(int number);
	public void selectElement(int number);
 	
	public void preOrder(MyTreeNode node);
	public void inOrder(MyTreeNode node);
	public void postOrder(MyTreeNode node); 
}
