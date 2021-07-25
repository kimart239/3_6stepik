package com.company;

public abstract class KeywordAnalyzer implements TextAnalyzer{
   protected abstract String[] getKeywords();

    protected abstract Label getLabel();
    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {//проверка наличия подстроки в строке
                return getLabel();
            }
        }
        return Label.OK;
    }
}


