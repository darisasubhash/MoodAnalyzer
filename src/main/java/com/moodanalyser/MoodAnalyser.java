package com.moodanalyser;

public class MoodAnalyser {
    private String string;
    public MoodAnalyser(){
        this.string="";
    }
    public MoodAnalyser(String string){
        this.string=string;
    }
    public String analyseMood() throws MoodAnalysisException {
        try {
            if (string.toLowerCase().contains("sad")) {
                return "SAD";
            }
            return "HAPPY";

        } catch (NullPointerException e) {
            throw new MoodAnalysisException(
                    MoodAnalysisException.ExceptionType.NULL,
                    "Mood is NULL"
            );
        }
    }
}
