
public class Function_Edit {
	GUI gui;

	public Function_Edit(GUI gui) {
		this.gui = gui;

	}

	public void redo() {

		gui.um.redo();
	}

	public void undo() {
		// TODO Auto-generated method stub
		gui.um.undo();
	}
}
