package seedu.linkedout.model.job;

import static org.junit.jupiter.api.Assertions.*;
import static seedu.linkedout.model.job.Stage.isValidStage;
import static seedu.linkedout.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class StageTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Stage(null));
    }

    @Test
    public void constructor_emptyStage_throwsIllegalArgumentException() {
        String emptyStage = "";
        assertThrows(IllegalArgumentException.class, () -> new Stage(emptyStage));
    }

    @Test
    public void constructor_invalidStage_throwsIllegalArgumentException() {
        String invalidStage = "#";
        assertThrows(IllegalArgumentException.class, () -> new Stage(invalidStage));
    }

    @Test
    public void constructor_invalidStageWhitespace_throwsIllegalArgumentException() {
        String invalidStage = " ";
        assertThrows(IllegalArgumentException.class, () -> new Stage(invalidStage));
    }

    @Test
    public void constructor_validStage_valueEqualsParameter() {
        String validStage = "stage1";
        Stage stage = new Stage(validStage);
        assertEquals(stage.value, "stage1");
    }

    @Test
    public void isValidStage_whitespace_false() {
        String invalidStage = " ";
        assertFalse(isValidStage(invalidStage));
    }

    @Test
    public void isValidStage_nonAlphaNumeric_false() {
        char character = 33;
        while (character < 48) {
            String stageValue = String.valueOf(character);
            assertFalse(isValidStage(stageValue));
            character++;
        }

        character = 58;
        while (character < 65) {
            String stageValue = String.valueOf(character);
            assertFalse(isValidStage(stageValue));
            character++;
        }

        character = 91;
        while (character < 97) {
            String stageValue = String.valueOf(character);
            assertFalse(isValidStage(stageValue));
            character++;
        }

        character = 123;
        while (character < 128) {
            String stageValue = String.valueOf(character);
            assertFalse(isValidStage(stageValue));
            character++;
        }
    }

    @Test
    public void equals_thisObject_true() {
        Stage stage = new Stage("stage");
        assertTrue(stage.equals(stage));
    }

    @Test
    public void equals_otherType_false() {
        Stage stage = new Stage("stage");
        String string = "stage";
        assertFalse(stage.equals(string));
    }

    @Test
    public void equals_otherStageSameValue_true() {
        Stage stage = new Stage("stage");
        Stage otherStage = new Stage("otherStage");
        assertFalse(stage.equals(otherStage));
    }
}