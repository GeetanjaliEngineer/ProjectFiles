import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.FileNameMap;

public class Function_File {
	GUI gui;

	String fileName;
	String fileAddress;

	public Function_File(GUI gui) {
		this.gui = gui;

	}

	public void newFile() {

		gui.textArea.setText("");
		gui.window.setTitle("New");

	}

	public void open() {
		FileDialog fd = new FileDialog(gui.window, "Open", FileDialog.LOAD);
		fd.setVisible(true);

		// get file and load file- open item
		if (fd.getFile() != null) {
			fileName = fd.getFile();
			fileAddress = fd.getDirectory();

			gui.window.setTitle(fileName);
			System.out.println("File address and filename" + fileAddress + fileName);
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName)); // you need address to read
																							// a file
			gui.textArea.setText("");
			String line = null;

			while ((line = br.readLine()) != null) {
				gui.textArea.append(line + "\n");
			}
			br.close();

		} catch (Exception e) {
			System.out.println("FILE NOT OPENED!");
		}

	}

	public void save() {

	}

	public void saveAs() {

		FileDialog fd = new FileDialog(gui.window, "Save", FileDialog.SAVE);
		fd.setVisible(true);

		if (fd.getFile() != null) {
			fileName = fd.getFile();

			fileAddress = fd.getDirectory();
			gui.window.setTitle(fileName); //
		}

		try {
			FileWriter fw = new FileWriter(fileAddress + fileName);
			fw.write(gui.textArea.getText());
			fw.close();

		} catch (Exception e) {
			System.out.println("SOMETHING WRONG!");

		}
	}

	public void exit() {
		System.exit(0);
	}
}
