package com.company;

import java.awt.*;

/**
 * Created by dmitry on 12.09.2017.
 */

enum Label{
    SPAM, NEGATIVE_TEXT, TOO_LONG, OK
}

public interface TextAnalyzer{
    Label processText(String text);
}
