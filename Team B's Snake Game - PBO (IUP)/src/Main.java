
import javax.swing.JFrame;



public class Main {
	
	public Main() {
		
		JFrame frame = new JFrame();
		
		GameGUI gamepanel = new GameGUI();
		
		
		frame.add(gamepanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("Snake SNAAAKE SNAAAAAAKEEEEEE");
		
		frame.setResizable(false);
		
		frame.pack();
		
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {

		new Main();

	}

}
