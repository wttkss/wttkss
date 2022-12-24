package Text;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TextTest {
    @Test
    public void testText() {
        assertEquals(80, Text.DEFAULT_MAX_CHAR_COUNT_IN_LINE);

        Text text = new Text();
        assertEquals(0, text.getParagraphsCount());

        Paragraph[] paragraphs = new Paragraph[] {
                new Paragraph(4, "О сколько нам открытий чудных"),
                new Paragraph(4, "Готовят просвещенья дух"),
                new Paragraph(4, "И опыт, сын ошибок трудных,"),
                new Paragraph(4, "И гений, парадоксов друг,"),
                new Paragraph(4, "И случай, бог изобретатель...")
        };

        text = new Text(paragraphs);
        assertEquals(5, text.getParagraphsCount());
        assertEquals(5, text.getTotalNumberOfLines());

        Paragraph separator = new Paragraph(0, "        ***        ");
        text.insertParagraph(separator, 4);

        for (int paragraphIndex = 0; paragraphIndex < paragraphs.length; paragraphIndex++) {
            assertEquals(paragraphs[paragraphIndex], text.getParagraphByIndex(paragraphIndex));
        }
        assertEquals(separator, text.getParagraphByIndex(5));

        // Замени разделитель, вместо звездочек будут минусы:
        String newSeparatorString = "        ---        ";
        Paragraph newSeparator = new Paragraph(0, newSeparatorString);
        text.replaceParagraph(newSeparator, 5);
        assertEquals(newSeparatorString, text.getParagraphByIndex(5).getParagraphText());

        text.removeParagraphByIndex(5);
        assertEquals(5, text.getParagraphsCount());

        text = new Text(paragraphs, 15);
        assertEquals(10, text.getTotalNumberOfLines());

        assertEquals(paragraphs.length, text.getParagraphs().length);
    }
}