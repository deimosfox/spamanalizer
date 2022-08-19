public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] negative = new String[]{":(","=(",":|"};
    public NegativeTextAnalyzer() {
    }

    @Override
    protected String[] getKeywords() {
        return negative;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
