package me.tedzhang.demo.designpattern.structural.proxy;

/**
 * Provide a surrogate or placeholder for another object to control access to it.
 * 
 * Proxy pattern common uses are to control access or to provide a wrapper implementation for better performance.
 * Java RMI whole package uses proxy pattern.
 * 
 * @author skuld1012
 */
public class ProxyPatternMain {

	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}
	}

}
