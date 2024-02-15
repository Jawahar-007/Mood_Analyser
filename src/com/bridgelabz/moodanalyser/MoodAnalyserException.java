package com.bridgelabz.moodanalyser;

public class MoodAnalyserException extends Exception {
    private final MoodAnalyser.ErrorType error;

    public MoodAnalyserException(MoodAnalyser.ErrorType error){
        super();
        this.error = error;
    }
    public MoodAnalyserException(MoodAnalyser.ErrorType error,Throwable reason){
        super(reason);
        this.error = error;
    }

    public MoodAnalyser.ErrorType errorType(){
        return error;
    }
}
