package com.bridegelabz.moodanalyser;

public class MoodAnalyser {

    public String message;

    public MoodAnalyser() {
        this.message = "I am in Happy Mood";
    }

    public String analyseMood() {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }


}
