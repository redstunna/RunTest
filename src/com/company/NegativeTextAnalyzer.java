package com.company;

/**
 * Created by dmitry on 13.09.17.
 */


public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] negKeywords= {":(", "=(", ":|"};

    //----Costructor----
    public NegativeTextAnalyzer(){}

    @Override
    public String[] getKeyword() {
        return negKeywords;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}