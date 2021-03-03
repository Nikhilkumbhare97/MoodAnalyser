package com.bridgelabz.moodanalyser;

import com.bridegelabz.moodanalyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyser;
/*
    @Test
    public void testMoodAnalysisWhenReturnSad() {
        moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
    }
*/
    @Test
    public void testMoodAnalysisWhenReturnHappy(){
        moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy", mood);
    }

}
