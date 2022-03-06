package seedu.linkedout.model;

import javafx.collections.ObservableList;
import seedu.linkedout.model.applicant.Applicant;

/**
 * Unmodifiable view of a linkedout book
 */
public interface ReadOnlyLinkedout {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Applicant> getApplicantList();

}
