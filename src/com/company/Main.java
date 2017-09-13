package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("This shit is working");

        // тестовые комментарии
        String[] tests = new String[8];
        tests[0] = "This comment is so good.";                            // OK
        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
        tests[4] = "This comment is so bad....";                          // SPAM
        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG

        //-----
        int numberOfTest = 0;
        String[] spamKeywords = {"spam", "bad"};
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(spamKeywords);

        //-----Create negatiivev text analyzer----
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();

        for (String test : tests) {
            if (spamAnalyzer.processText(test)==Label.OK){
                System.out.println("test #" + numberOfTest + ": "+"OK");
            }
            else {
                System.out.println("test #" + numberOfTest + ": "+"SPAM");
            }
            numberOfTest++;
        }

        //-----Separate tests-----
        System.out.println("------------------------");
        //-----Test for wrong text analyzer-----
        numberOfTest = 0;
        for (String test : tests) {
            if (negativeTextAnalyzer.processText(test)==Label.OK){
                System.out.println("test #" + numberOfTest + ": "+"OK");
            }
            else {
                System.out.println("test #" + numberOfTest + ": "+"NEG");
            }
            numberOfTest++;
        }
        //-----Separate tests-----
        System.out.println("------------------------");


    }
}
