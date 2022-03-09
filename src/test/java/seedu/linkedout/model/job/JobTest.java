package seedu.linkedout.model.job;

import static org.junit.jupiter.api.Assertions.*;
import static seedu.linkedout.model.job.Job.isValidJob;
import static seedu.linkedout.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class JobTest{

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Job(null));
    }

    @Test
    public void constructor_emptyJob_throwsIllegalArgumentException() {
        String emptyJob = "";
        assertThrows(IllegalArgumentException.class, () -> new Job(emptyJob));
    }

    @Test
    public void constructor_invalidJob_throwsIllegalArgumentException() {
        String invalidJob = "#";
        assertThrows(IllegalArgumentException.class, () -> new Job(invalidJob));
    }

    @Test
    public void constructor_invalidJobWhitespace_throwsIllegalArgumentException() {
        String invalidJob = " ";
        assertThrows(IllegalArgumentException.class, () -> new Job(invalidJob));
    }

    @Test
    public void constructor_validJob_valueEqualsParameter() {
        String validJob = "job1";
        Job job = new Job(validJob);
        assertEquals(job.value, "job1");
    }

    @Test
    public void isValidJob_whitespace_false() {
        String invalidJob = " ";
        assertFalse(isValidJob(invalidJob));
    }

    @Test
    public void isValidJob_nonAlphaNumeric_false() {
        char character = 33;
        while (character < 48) {
            String jobValue = String.valueOf(character);
            assertFalse(isValidJob(jobValue));
            character++;
        }

        character = 58;
        while(character < 65) {
            String jobValue = String.valueOf(character);
            assertFalse(isValidJob(jobValue));
            character++;
        }

        character = 91;
        while (character < 97) {
            String jobValue = String.valueOf(character);
            assertFalse(isValidJob(jobValue));
            character++;
        }

        character = 123;
        while (character < 128) {
            String jobValue = String.valueOf(character);
            assertFalse(isValidJob(jobValue));
            character++;
        }
    }

    @Test
    public void equals_thisJob_true() {
        Job job = new Job("job");
        assertTrue(job.equals(job));
    }

    @Test
    public void equals_otherType_false() {
        Job job = new Job("job");
        String string = "job";
        assertFalse(job.equals(string));
    }

    @Test
    public void equals_otherJobSameValue_true() {
        Job job = new Job("job");
        Job otherJob = new Job("otherJob");
        assertFalse(job.equals(otherJob));
    }

}
