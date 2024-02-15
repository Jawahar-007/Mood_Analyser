package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(){
        this.message = " ";
    }
    public MoodAnalyser(String message)
    {
        this.message = message;
    }
    public String analayseMood() throws MoodAnalyserException {
        try { // statements given to validate the exception for null Strings
            if (message == null )
                throw new MoodAnalyserException(ErrorType.NULL_MOOD);
            //statements given to validate the exception for empty Strings
            if( message.isEmpty())
                throw new MoodAnalyserException(ErrorType.EMPTY);

            return message.contains("sad") || message.contains("Sad") ? "SAD" : "HAPPY";
        } // Exception Handling
        catch (NullPointerException q) {
            throw new MoodAnalyserException(ErrorType.INVALID_MOOD,q);
        }
    }
    // enum used to Handle Empty Mood Scenario throw
    //MoodAnalysisException and inform
    //user of the EmptyMood
    public enum ErrorType{
        NULL_MOOD("MOOD NOT BE NULL"),
        EMPTY("MOOD CAN'T BE EMPTY"),
        INVALID_MOOD("MOOD IS INVALID");
        // parameterised constructor
        private final String displayMessage;
        ErrorType(String displayMessage){
            this.displayMessage = displayMessage;
        }
        public String getDisplayMessage(){
            return displayMessage;
        }
    }
}
