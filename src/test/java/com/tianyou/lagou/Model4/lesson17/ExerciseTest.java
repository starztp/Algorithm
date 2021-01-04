package com.tianyou.lagou.Model4.lesson17;

import org.junit.Test;

public class ExerciseTest {

    Exercise exercise=new Exercise();

    @Test
    public void TestreverseWords(){
        String word="This is a good example";
        String result=Exercise.reverseWords(word);
        System.out.println(result);
    }
}
