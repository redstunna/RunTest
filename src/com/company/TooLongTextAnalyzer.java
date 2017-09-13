package com.company;

/**
 * Created by dmitry on 13.09.17.
 */
public class TooLongTextAnalyzer implements TextAnalyzer{
    public int lenText;
    //----Constructor-----
    public TooLongTextAnalyzer(int maxLength){
        lenText = maxLength;
    }

    @Override
    public Label processText(String text) {
        int inLen = text.length();

        if(inLen>lenText){return Label.TOO_LONG;}
        else {return  Label.OK;}
    }
}
