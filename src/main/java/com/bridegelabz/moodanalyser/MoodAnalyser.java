package com.bridegelabz.moodanalyser;

public class MoodAnalyser {

    public String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {

        try {
            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch(NullPointerException e){
            throw new MoodAnalyserException("Invalid Mood");
        }
    }


}
