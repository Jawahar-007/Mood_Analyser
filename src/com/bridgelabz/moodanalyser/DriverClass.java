package com.bridgelabz.moodanalyser;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Message:");
        String message = scanner.nextLine();
        System.out.println(moodAnalyser.analayseMood(message));

    }
}