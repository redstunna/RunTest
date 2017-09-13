package com.company;

/**
 * Created by dmitry on 12.09.2017.
 */

public class SpamAnalyzer extends KeywordAnalyzer {
    //public  String[] spamwords;
    private  String[] spamwords;

    //----Costructor----
    public SpamAnalyzer(String[] inSpamwords){
        spamwords = inSpamwords;
    }

    @Override
    protected String[] getKeyword() {
        return spamwords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}