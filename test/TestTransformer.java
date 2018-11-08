import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestTransformer {

    @Test
    public void testTransformerForSelf() throws IncorrectDataInputException {
        String actual = TransformerString.transform("hi World 123 $# no");
        assertEquals("Result", "HI World 123 $# NO", actual);
    }

    @Test
    public void testTransformerForEmpty() throws IncorrectDataInputException {
        String actual = TransformerString.transform("");
        assertEquals("Result", "", "");
    }

    @Test(expected = IncorrectDataInputException.class)
    public void TestTransformerForNull() throws IncorrectDataInputException {
        String actual = TransformerString.transform(null);
        assertEquals("Result", null, actual);
    }
}
