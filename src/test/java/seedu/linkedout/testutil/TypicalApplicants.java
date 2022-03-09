package seedu.linkedout.testutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.linkedout.model.applicant.Applicant;

import static seedu.linkedout.logic.commands.CommandTestUtil.*;

/**
 * A utility class containing a list of {@code Applicant} objects to be used in tests.
 */
public class TypicalApplicants {

    public static final Applicant ALICE = new ApplicantBuilder().withName("Alice Pauline")
            .withJob("Plumber").withStage("Resume Sent").withEmail("alice@example.com")
            .withPhone("94351253")
            .withTags("friends").build();
    public static final Applicant BENSON = new ApplicantBuilder().withName("Benson Meier")
            .withJob("Nurse").withStage("Practical Interview")
            .withEmail("johnd@example.com").withPhone("98765432")
            .withTags("owesMoney", "friends").build();
    public static final Applicant CARL = new ApplicantBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withJob("Day Trader").withStage("Interviewed").build();
    public static final Applicant DANIEL = new ApplicantBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withJob("Financial Advisor").withStage("Recruiting").withTags("friends").build();
    public static final Applicant ELLE = new ApplicantBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").withJob("Supermodel").withStage("Proportions Test").build();
    public static final Applicant FIONA = new ApplicantBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").withJob("Engineer").withStage("Job Offer Rejected").build();
    public static final Applicant GEORGE = new ApplicantBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").withJob("Cook").withStage("Resume Reviewed").build();

    // Manually added
    public static final Applicant HOON = new ApplicantBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withJob("Java Developer").withStage("Job Offer Accepted").build();
    public static final Applicant IDA = new ApplicantBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withJob("Soldier").withStage("Finalising").build();

    // Manually added - Applicant's details found in {@code CommandTestUtil}
    public static final Applicant AMY = new ApplicantBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withJob(VALID_JOB_AMY).withStage(VALID_STAGE_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Applicant BOB = new ApplicantBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withJob(VALID_JOB_BOB).withStage(VALID_STAGE_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalApplicants() {} // prevents instantiation

    public static List<Applicant> getTypicalApplicants() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
