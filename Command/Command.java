package Command;

public abstract class Command {
    public abstract void execute();
    public abstract void undo();
    public abstract void redo();
}
