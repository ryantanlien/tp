package seedu.linkedout.logic.parser;

import seedu.linkedout.logic.commands.Command;
import seedu.linkedout.logic.parser.exceptions.ParseException;

/**
 * Represents a Parser that is able to parse user input into a {@code Command} of type {@code T}.
 */
public interface  Parser<T extends Command> {

    /**
     * Parses {@code userInput} into a command and returns it.
     * @throws ParseException if {@code userInput} does not conform the expected format
     */
    T parse(String userInput) throws ParseException;
}
