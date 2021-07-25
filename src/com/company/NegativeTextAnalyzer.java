package com.company;

public class NegativeTextAnalyzer extends KeywordAnalyzer{
    private String[] keyword = {":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return keyword;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;



    }
}
