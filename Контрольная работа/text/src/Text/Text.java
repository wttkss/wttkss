package Text;


public class Text {

    public static final int DEFAULT_MAX_CHAR_COUNT_IN_LINE = 80;

    private int maxCharCountInLine;


    private Paragraph[] paragraphs;

    public Text() {
        this.paragraphs = new Paragraph[0];
        this.maxCharCountInLine = DEFAULT_MAX_CHAR_COUNT_IN_LINE;
    }

    public Text(Paragraph[] paragraphs) {
        this.paragraphs = paragraphs;
        this.maxCharCountInLine = DEFAULT_MAX_CHAR_COUNT_IN_LINE;
    }


    public Text(Paragraph[] paragraphs, int maxCharCountInLine) {
        this.paragraphs = paragraphs;
        this.maxCharCountInLine = maxCharCountInLine;
    }

    public int getParagraphsCount() {
        return this.paragraphs.length;
    }

    public int getTotalNumberOfLines() {
        int totalNumberOfLines = 0;

        for (Paragraph paragraph : this.paragraphs) {
            int paragraphLength = paragraph.getParagraphText().length();
            totalNumberOfLines += paragraphLength / this.maxCharCountInLine +
                    ((paragraphLength % this.maxCharCountInLine == 0) ? 0 : 1);
        }

        return totalNumberOfLines;
    }

    public Paragraph getParagraphByIndex(int paragraphIndex) {
        return this.paragraphs[paragraphIndex];
    }

    public void insertParagraph(Paragraph newParagraph, int paragraphAfterIndex) {
        Paragraph[] newParagraphs = new Paragraph[this.paragraphs.length + 1];


        for (int paragraphIndex = 0; paragraphIndex <= paragraphAfterIndex; paragraphIndex++) {
            newParagraphs[paragraphIndex] = this.paragraphs[paragraphIndex];
        }

        newParagraphs[paragraphAfterIndex + 1] = newParagraph;


        for (int paragraphIndex = paragraphAfterIndex + 1; paragraphIndex < this.paragraphs.length; paragraphIndex++) {
            newParagraphs[paragraphIndex] = this.paragraphs[paragraphIndex];
        }

        this.paragraphs = newParagraphs;
    }

    public void removeParagraphByIndex(int paragraphIndexForRemove) {
        Paragraph[] newParagraphs = new Paragraph[this.paragraphs.length - 1];


        for (int paragraphIndex = 0; paragraphIndex < paragraphIndexForRemove; paragraphIndex++) {
            newParagraphs[paragraphIndex] = this.paragraphs[paragraphIndex];
        }


        for (int paragraphIndex = paragraphIndexForRemove + 1; paragraphIndex < this.paragraphs.length; paragraphIndex++) {
            newParagraphs[paragraphIndex] = this.paragraphs[paragraphIndex];
        }

        this.paragraphs = newParagraphs;
    }


    public void replaceParagraph(Paragraph newParagraph, int paragraphIndex) {
        this.paragraphs[paragraphIndex] = newParagraph;
    }


    public Paragraph[] getParagraphs() {
        Paragraph[] arrayOfParagraphs = new Paragraph[this.paragraphs.length];

        for (int paragraphIndex = 0; paragraphIndex < this.paragraphs.length; paragraphIndex++) {
            arrayOfParagraphs[paragraphIndex] = this.paragraphs[paragraphIndex];
        }

        return arrayOfParagraphs;
    }
}
