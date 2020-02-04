package dev.kurama;

import java.util.Scanner;

public class MainATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandProcessor commandProcessor = DaggerCommandProcessorFactory.create().commandProcessor();

        while (scanner.hasNextLine()) {
            commandProcessor.process(scanner.nextLine());
        }
    }
}
