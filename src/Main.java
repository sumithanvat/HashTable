public class Main {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        WordFrequency wordFrequency = new WordFrequency();
        wordFrequency.findFrequency(sentence);
        for (MyMapNode<String, Integer> node : wordFrequency.linkedList) {
            System.out.println(node.getKey() + " : " + node.getValue());
        }
    }
}