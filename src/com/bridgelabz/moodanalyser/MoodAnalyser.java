package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(){
        this.message = " ";
    }
    public String analayseMood(String message){
        if(message.contains("sad")||message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
