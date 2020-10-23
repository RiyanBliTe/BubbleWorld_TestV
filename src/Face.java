import javax.swing.JFrame;
public class Face {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Bubble World");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new GamePanel());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}