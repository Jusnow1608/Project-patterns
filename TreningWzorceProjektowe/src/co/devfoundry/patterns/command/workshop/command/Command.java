package co.devfoundry.patterns.command.workshop.command;

public interface Command {
    void execute();

    void undo();
}
