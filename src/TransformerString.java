
public class TransformerString {

    public String transform(final String sentence) {
        final String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].length() == 2) {
                words[i] = words[i].toUpperCase();
            }
        }
        return String.join(" ", words);
    }
}

