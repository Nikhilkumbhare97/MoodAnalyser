package com.bridgelabz.moodanalyser;

import com.bridegelabz.moodanalyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyser;

    @Test
    public void testMoodAnalysisWhenReturnSad() {
        moodAnalyser = new MoodAnalyser("I am in sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void testMoodAnalysisWhenReturnHappy(){
        moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

}
