package com.company;

/**
 * Created by dmitry on 13.09.17.
 */

/*
public class NegativeTextAnalyzer implements TextAnalyzer {

    public String[] negKeywords= {":(", "=(", ":|"};

    //----Default constructor for class----
    public NegativeTextAnalyzer(){}

    //----Override method from TextAnalyzer interface-----
    @Override
    public Label processText(String text) {
        int lenNegKeywords = negKeywords.length;
        boolean checNeg = false;

        for(int i=0;i<lenNegKeywords;i++){
            if(text.toLowerCase().indexOf(negKeywords[i].toLowerCase()) != -1){
                checNeg = true;
            }
        }

        if(checNeg){return Label.NEGATIVE_TEXT;}
        else{return Label.OK;}

    }
}
*/
public class NegativeTextAnalyzer extends KeywordAnalyzer {
    //public String[] negKeywords= {":(", "=(", ":|"};
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