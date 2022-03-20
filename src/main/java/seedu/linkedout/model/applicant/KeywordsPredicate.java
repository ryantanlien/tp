package seedu.linkedout.model.applicant;

import java.util.List;
import java.util.function.Predicate;

import seedu.linkedout.commons.util.StringUtil;

public class KeywordsPredicate implements Predicate<Applicant> {

    private final List<String> keywords;

    public KeywordsPredicate(List<String> keywords) {
        this.keywords = keywords;
    }

    /**
     * @param applicant
     * @return true if list contains the applicant
     */
    public boolean test(Applicant applicant) {
        return keywords.stream()
                .anyMatch(keyword -> StringUtil.containsWordIgnoreCase(applicant.getName().fullName, keyword));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof KeywordsPredicate // instanceof handles nulls
                && keywords.equals(((KeywordsPredicate) other).keywords)); // state check
    }
}
