package me.tedzhang.demo.designpattern.behavioral.command;

public interface FileSystemReceiver {

	void openFile();

	void writeFile();

	void closeFile();
}
