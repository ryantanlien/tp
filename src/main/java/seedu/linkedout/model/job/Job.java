package seedu.linkedout.model.job;

import static java.util.Objects.requireNonNull;

public class Job {

    public static final String MESSAGE_CONSTRAINTS = "Jobs can take any values, and it should not be blank";

    /*
     * The first character of address must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String VALIDATION_REGEX = "[^\\s].*";

    public final String value;

    /**
     * Constructs a {@code Job}
     *
     * @param job A valid job.
     */
    public Job(String job) {
        requireNonNull(job);
        // checkArgument
        value = job;
    }

    /**
     * Returns true if a given string is a valid email.
     */
    public static boolean isValidJob(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Job) // instanceof handles nulls
                && value.equals(((Job) other).value); // state check
    }
}
