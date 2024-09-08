import java.awt.Color;

public class Function_Color {
	GUI gui;

	public Function_Color(GUI gui) {
		this.gui = gui;

	}

	public void changeColor(String color) {

		switch (color) {
		case "White":
			gui.window.getContentPane().setBackground(Color.WHITE);
			gui.textArea.setBackground(Color.WHITE);
			gui.textArea.setForeground(Color.BLACK);
			break;
		case "Black":
			gui.window.getContentPane().setBackground(Color.BLACK);
			gui.textArea.setBackground(Color.BLACK);
			gui.textArea.setForeground(Color.WHITE);
			break;
		case "Blue":
			gui.window.getContentPane().setBackground(new Color(28, 186, 186));
			gui.textArea.setBackground(new Color(28, 186, 186));
			gui.textArea.setForeground(Color.WHITE);
			break;

		}
	}
}