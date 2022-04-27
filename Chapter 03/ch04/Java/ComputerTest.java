package ch04;

public class ComputerTest {

   public static void main(String[] args) {
      
      Computer computer = new Desktop();
      computer.display();
      computer.typing();
      
      Computer notebook = new MyNoteBook();
      
      notebook.turnOff();
      notebook.display();
      notebook.typing();
      
   }

}