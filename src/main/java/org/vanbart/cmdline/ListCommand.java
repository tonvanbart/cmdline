package org.vanbart.cmdline;

import org.springframework.stereotype.Component;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Component
@Command
public class ListCommand  implements Runnable {

    @Option(names = {"-f", "--file"}, required = true, description = "The file we want to put in")
    private String filename;

    @Override
    public void run() {
        System.out.println("Listing a file named '" + filename +"'");
    }
}
