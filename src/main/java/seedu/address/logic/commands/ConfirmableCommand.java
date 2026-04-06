package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Represents a command that requires explicit user confirmation before execution.
 */
public interface ConfirmableCommand {

    /**
     * Returns the prompt shown to the user when confirmation is required.
     */
    String getConfirmationPrompt();

    /**
     * Returns the prompt shown to the user when confirmation is required, with model context.
     *
     * <p>Commands that need model state (e.g. target names from indices) can override this.
     */
    default String getConfirmationPrompt(Model model) {
        return getConfirmationPrompt();
    }

    /**
     * Returns a short action description used in cancellation feedback.
     */
    String getActionDescription();
}
