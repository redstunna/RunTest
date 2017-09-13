package com.company;

/**
 * Created by dmitry on 12.09.2017.
 */
/*
public class SpamAnalyzer implements TextAnalyzer {
    public String[] spamwords;

    //----Constructor----
    public SpamAnalyzer(String[] inSpamWords){
        spamwords = inSpamWords;
    }

    //----Override abstract method----
    @Override
    public Label processText(String text) {
        int lenSpamWords = spamwords.length;
        Label checkLabel = null;
        //----Check word in text----
        for(int i=0;i<lenSpamWords;i++) {
            if (text.toLowerCase().indexOf(spamwords[i].toLowerCase()) != -1) {
                checkLabel = Label.SPAM;
            }
        }
        //-----Check label for founding spam words----
        if(checkLabel != null){
            return Label.SPAM;
        }
        else{
            return Label.OK;
        }

    }
}
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