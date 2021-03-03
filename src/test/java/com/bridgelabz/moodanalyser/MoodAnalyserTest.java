package com.bridgelabz.moodanalyser;

import com.bridegelabz.moodanalyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyser;

    @Before
    public void objMethod() {
        moodAnalyser = new MoodAnalyser();
    }
/*
    @Test
    public void testMoodAnalysisWhenReturnSad() {
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }
*/
    @Test
    public void testMoodAnalysisWhenReturnHappy(){
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

}
