package andkrul.fib;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FibonaciLuncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame fram = new JFrame("Fibonnaci");
		fram.setSize(400, 400);
		fram.setLocationRelativeTo(null);

		for (int i = 1;; i++) {
			if (Fibonacci.getElemntLoop(i).toString().length() == 1000) {
				System.out.println(i);
				System.out.println(Fibonacci.getElemntLoop(i));
				
				JTextArea text = new JTextArea();
				text.setWrapStyleWord(true);
				text.setLineWrap(true);
				text.setText("wyraz nr:\n" + i + "\n\n\n wartoœæ:\n"
						+ Fibonacci.getElemntLoop(i));
				JScrollPane jScrollPane1 = new JScrollPane(text);
				fram.add(jScrollPane1);
				fram.setVisible(true);
				
				return;
			}
		}
	}
}
