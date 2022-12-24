package Text;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ParagraphTest {

    @Test
    public void testParagraph() {
        assertEquals("", Paragraph.EMPTY_PARAGRAPH);

        Paragraph paragraph = new Paragraph();
        assertEquals(Paragraph.EMPTY_PARAGRAPH, paragraph.getParagraphText());
        assertEquals(0, paragraph.getIndent());

        paragraph = new Paragraph(4);
        assertEquals(Paragraph.EMPTY_PARAGRAPH, paragraph.getParagraphText());
        assertEquals(4, paragraph.getIndent());

        String text = "Как много нам открытий чудных готовит просвещенья дух.";
        paragraph = new Paragraph(4, text);
        assertEquals(4, paragraph.getIndent());
        assertEquals(text, paragraph.getParagraphText());
    }

    @Test
    public void testSet() {
        Paragraph paragraph = new Paragraph();
        String pangram = "Широкая электрификация южных губерний даст мощный толчок подъёму сельского хозяйства.";
        paragraph.setParagraphText(pangram);
        paragraph.setIndent(2);
        assertEquals(pangram, paragraph.getParagraphText());
        assertEquals(2, paragraph.getIndent());
    }
}