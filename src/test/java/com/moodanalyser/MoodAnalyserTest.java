package com.moodanalyser;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void givenMessageReturnsSad(){
        MoodAnalyser analyse=new MoodAnalyser();
        String result= analyse.analyseMood("I am in Sad Mood");
        assertEquals("SAD",result);
    }
    @Test
    public void givenMessageReturnsHappy(){
        MoodAnalyser analyser=new MoodAnalyser();
        String result= analyser.analyseMood("I am in Happy Mood");
        assertEquals("HAPPY",result);
    }

}
