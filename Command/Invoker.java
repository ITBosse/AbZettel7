package Command;

import java.util.Stack;

public class Invoker {
    private final Stack<Command> undoStack = new Stack<Command>();
    private final Stack<Command> redoStack = new Stack<Command>();

    public void execute(Command command) {
        command.execute();
        undoStack.push(command);
        redoStack.clear();
    }
    public void undo() {
        if(canUndo()) {
            redoStack.push(undoStack.pop());
            redoStack.peek().undo();
        }
    }
    public void redo() {
        if(canRedo()) {
            undoStack.push(redoStack.pop());
            undoStack.peek().redo();
        }
    }
    public boolean canUndo() {
        return !undoStack.isEmpty();
    }
    public boolean canRedo() {
        return !redoStack.isEmpty();
    }
}
