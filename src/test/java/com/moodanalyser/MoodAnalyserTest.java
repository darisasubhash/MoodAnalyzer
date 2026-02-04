package com.moodanalyser;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

public class MoodAnalyserTest {
    @Test
    public void givenMessageReturnsSad() throws MoodAnalysisException {
        MoodAnalyser analyse=new MoodAnalyser("I am in Sad Mood");
        assertEquals("SAD",analyse.analyseMood());
    }
    @Test
    public void givenMessageReturnsHappy() throws MoodAnalysisException {
        MoodAnalyser analyser=new MoodAnalyser("I am in Happy Mood");
        assertEquals("HAPPY",analyser.analyseMood());
    }
    @Test
    public void givenMessageNullThrowMoodAnalysisException() {
        try {
            MoodAnalyser analyser = new MoodAnalyser(null);
            analyser.analyseMood();
            fail("Expected MoodAnalysisException for NULL mood");
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisException.ExceptionType.NULL, e.type);
        }
    }
    @Test
    public void givenEmptyMoodThrowMoodAnalysisException() {
        try {
            MoodAnalyser analyser = new MoodAnalyser("");
            analyser.analyseMood();
            fail("Expected MoodAnalysisException for EMPTY mood");
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisException.ExceptionType.EMPTY, e.type);
        }
    }
}
