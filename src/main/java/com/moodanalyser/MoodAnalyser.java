package com.moodanalyser;

public class MoodAnalyser {
    private String string;
    public MoodAnalyser(){
        this.string="";
    }
    public MoodAnalyser(String string){
        this.string=string;
    }
    public String analyseMood(){
        try{
            if(string.toLowerCase().contains("sad")){
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e){
            return "HAPPY";
        }
    }
}
