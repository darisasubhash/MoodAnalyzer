package com.moodanalyser;

public class MoodAnalyser {
    public String analyseMood(String string){
        if(string.toLowerCase().contains("sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
