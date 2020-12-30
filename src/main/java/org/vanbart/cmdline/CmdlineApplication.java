package org.vanbart.cmdline;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import picocli.CommandLine;

@SpringBootApplication
public class CmdlineApplication implements CommandLineRunner {

	private ListCommand listCommand;

	public CmdlineApplication(ListCommand listCommand) {
		this.listCommand = listCommand;
	}

	public static void main(String[] args) {
		SpringApplication.run(CmdlineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CommandLine commandLine = new CommandLine(listCommand);
		commandLine.parseWithHandler(new CommandLine.RunLast(), args);
//		for (String arg: args) {
//			System.out.println("Argument: " + arg);
//		}
		System.out.println("\nprinted arguments.");
	}
}
