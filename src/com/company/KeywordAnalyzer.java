package com.company;

/**
 * Created by dmitry on 13.09.17.
 */
abstract class KeywordAnalyzer implements TextAnalyzer{
    //-----Create abstract method----
    abstract protected String[] getKeyword();

    //-----Create abstract method for label-----
    abstract protected Label getLabel();

    private String[] keywords;

    //-----Set label for class of text analyzer----
    Label textAnalyzerLabel = getLabel();
    //----Set keywords length------
    int lenKeywords;

    @Override
    public Label processText(String text) {
        keywords = getKeyword();
        lenKeywords = keywords.length;
        for(int i=0;i<lenKeywords;i++){
            if(text.toLowerCase().indexOf(keywords[i].toLowerCase()) != -1){
                return textAnalyzerLabel;
            }
        }

        return Label.OK;
    }
}
