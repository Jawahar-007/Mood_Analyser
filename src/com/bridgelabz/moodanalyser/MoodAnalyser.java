package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(){
        this.message = " ";
    }
    public MoodAnalyser(String message){
        this.message = message;
    }
    public String analayseMood() throws MoodAnalyserException {
        try {
            if (message == null || message.isEmpty())
                throw new MoodAnalyserException(ErrorType.EMPTY);

            return message.contains("sad") || message.contains("Sad") ? "SAD" : "HAPPY";
        } catch (NullPointerException q) {
            throw new MoodAnalyserException(ErrorType.INVALID_MOOD,q);
        }
    }
    public enum ErrorType{
        EMPTY , INVALID_MOOD
    }
}
