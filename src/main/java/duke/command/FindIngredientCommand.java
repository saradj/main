package duke.command;

import duke.exception.DukeException;
import duke.recipebook.DishList;
import duke.storage.Storage;
import duke.ingredients.*;
import duke.ingredients.IngredientsList;
import duke.task.Task;
import duke.task.TaskList;
import duke.ui.Ui;

/**
 * Represents a specific {@link Command} used to find a String occurring in the {@link TaskList}.
 */
public class FindIngredientCommand extends Command {

    private String toFind;

    public FindIngredientCommand(String toFind) {
        this.toFind = toFind;
    }


    @Override
    public void execute(DishList dish1, TaskList taskList, Ui ui, Storage storage) throws DukeException {

    }
}