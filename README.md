# ProjectFiles
Project Overview
The Notepad clone is a basic text editor application built using Core Java. It provides functionalities similar to the Windows Notepad, such as creating, opening, editing, and saving text files. The application also includes features like cut, copy, paste, and word wrap.
**Tools and Technologies**
**Programming Language:** Java(Core)
**IDE**: Eclipse, IntelliJ IDEA, or any other Java IDE
Libraries: javax.swing, java.awt, java.io, java.awt.event
Fea****tures
**Basic File Operations:**
New: Create a new text file.
Open: Open an existing text file from the filesystem.
Save: Save the current text file.
Save As: Save the current text file with a new name.
Exit: Close the application.
Edit Operations.
Redo: Redo the last undone action.
Undo: Undo the last action
**Format Options:**
Word Wrap: Toggle word wrap on/off.
Font: Change the font style
Font Size: Change the font size.
Color:
White
Black 
Blue
**GUI Design**
The GUI is designed using the javax.swing package and includes the following components:
JFrame: The main window of the application.
JTextArea: The area where text is edited.
JMenuBar: The menu bar containing File, Edit, Format, and Help menus.
JMenuItem: The individual items under each menu.
**Code** **Structure**
Main Class:
GUI.java: The main class that initializes the GUI and handles user interactions.
Components:
JFrame: The main window (Notepad class) that contains all components.
JTextArea: The text area where the user can type and edit text.
JMenuBar: Contains JMenu components like "File", "Edit", "Format", and "Help".
JMenuItem: Items like "New", "Open", "Save", etc.
Functions
Function_file
Function_format
Function_Color
FunctionEdit
**Event Handling:**
Implement action listeners (ActionListener) to handle user actions like opening a file, saving a file, etc.
Use JMenubar, JmenuItem, Jformat.etc for functions.
**Key Handling**
Constructor (KeyHandler(GUI gui)):
The constructor initializes the KeyHandler with a reference to the GUI object. This allows the KeyHandler to interact with the GUI when specific keys are pressed.
keyPressed(KeyEvent e):
This method is where the main logic is implemented. It responds to specific key combinations:
Ctrl + S: Calls the save() method of the file object in the GUI. This is typically used for saving a file.
Ctrl + Shift + S: Calls the saveAs() method of the file object, usually to save the file with a new name.
Alt + F: Triggers the doClick() method on menuFile, likely opening a file menu in the GUI.
**How to Run the Project**
Set up the development environment: Install JDK and an IDE like Eclipse or IntelliJ IDEA.
Create a new Java project: Open your IDE and create a new Java project.
Add the GUI.java file: Create a new class named Notepad and copy the code into the file.
Compile and Run: Compile the code and run the Notepad class to start the application.
**Future Enhancements**
Search and Replace: Implement a search and replace feature.
Print: Add the ability to print the text document.
Syntax Highlighting: For coding purposes, add syntax highlighting.

