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

    @Test
    public void testMoodAnalysisWhenReturnSad() throws Exception{
        String mood = moodAnalyser.analyseMood("I am in sad Mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void testMoodAnalysisWhenReturnHappy() throws Exception{
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", mood);
    }

}
