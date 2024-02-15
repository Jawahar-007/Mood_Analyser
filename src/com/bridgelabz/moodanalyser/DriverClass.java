package com.bridgelabz.moodanalyser;

public class DriverClass {
    public static void main(String[] args) {
        MoodAnalyser sadMood = new MoodAnalyser("I am in Sad Mood");
        MoodAnalyser happyMood = new MoodAnalyser("I am in Happy Mood");
        MoodAnalyser emptyMood = new MoodAnalyser(null);

        try {
            String disp = sadMood.analayseMood();
            System.out.println(disp);
            try {
                String disp1 = happyMood.analayseMood();
                System.out.println(disp1);
                try {
                    String disp3 = emptyMood.analayseMood();
                    System.out.println(disp3);
                } catch (MoodAnalyserException q) {
                    System.out.println("Error : " + q.errorType().getDisplayMessage());
                }
            } catch (MoodAnalyserException q) {
                System.out.println("Error :" + q.errorType());
            }
        } catch (MoodAnalyserException q) {
            System.out.println("Error : " + q.errorType());
        }
    }
}
/* O/P SAD
HAPPY
Error :MOOD NOT NULL */