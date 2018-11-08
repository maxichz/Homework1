
public class TransformerString {

    public static String transform(String sentence) throws IncorrectDataInputException {
        if (sentence != null) {
            final String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() == 2) {
                    words[i] = words[i].toUpperCase();
                }
            }
            return String.join(" ", words);
        } else {
            throw new IncorrectDataInputException("input is null");
        }
    }
}

