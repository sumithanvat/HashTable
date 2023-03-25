import java.util.LinkedList;

public class WordFrequency {
    LinkedList<MyMapNode<String, Integer>> linkedList;

    public WordFrequency() {
        linkedList = new LinkedList<>();
    }

    public void findFrequency(String sentence) {
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            int index = getIndex(word);
            MyMapNode<String, Integer> myMapNode = search(word);
            if (myMapNode == null) {
                myMapNode = new MyMapNode<>(word, 1);
                linkedList.add(myMapNode);
            } else {
                int frequency = myMapNode.getValue() + 1;
                myMapNode.setValue(frequency);
            }
        }
    }

    public MyMapNode<String, Integer> search(String word) {
        int index = getIndex(word);
        for (MyMapNode<String, Integer> node : linkedList) {
            if (node.getKey().equals(word)) {
                return node;
            }
        }
        return null;
    }

    private int getIndex(String word) {
        int hashCode = Math.abs(word.hashCode());
        return hashCode % 10;
    }

}
