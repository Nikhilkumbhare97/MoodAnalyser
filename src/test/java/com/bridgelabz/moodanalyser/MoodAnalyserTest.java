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
        String mood = moodAnalyser.analyseMood("This is a sad message");
        Assert.assertEquals("SAD", mood);
    }
}
