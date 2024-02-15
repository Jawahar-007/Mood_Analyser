package com.bridgelabz.moodanalyser;

public class DriverClass {
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        try {
            String disp = moodAnalyser.analayseMood();
            System.out.println(disp);

        } catch (MoodAnalyserException q) {
            System.out.println("Error:"+q.errorType());
        }
    }
}