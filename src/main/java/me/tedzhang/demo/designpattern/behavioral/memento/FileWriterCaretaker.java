package me.tedzhang.demo.designpattern.behavioral.memento;

//Caretaker
public class FileWriterCaretaker {

	private Object obj;

	public void save(FileWriterUtil fileWriter) {
		this.obj = fileWriter.save();
	}

	public void undo(FileWriterUtil fileWriter) {
		fileWriter.undoToLastSave(obj);
	}
}
