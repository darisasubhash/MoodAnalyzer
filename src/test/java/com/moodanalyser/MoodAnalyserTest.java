package com.moodanalyser;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void givenMessageReturnsSad(){
        MoodAnalyser analyse=new MoodAnalyser("I am in Sad Mood");
        assertEquals("SAD",analyse.analyseMood());
    }
    @Test
    public void givenMessageReturnsHappy(){
        MoodAnalyser analyser=new MoodAnalyser("I am in Happy Mood");
        assertEquals("HAPPY",analyser.analyseMood());
    }
}
