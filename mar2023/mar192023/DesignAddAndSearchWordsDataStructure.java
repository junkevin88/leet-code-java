package mar2023.mar192023;

import java.util.HashMap;
import java.util.Map;

class WordDictionary {
    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode child = node.children.get(ch);
            if (child == null) {
                child = new TrieNode();
                node.children.put(ch, child);
            }
            node = child;
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        return search(root, word, 0);
    }

    private boolean search(TrieNode node, String word, int index) {
        if (index == word.length()) {
            return node.isEndOfWord;
        }

        char ch = word.charAt(index);
        if (ch == '.') {
            for (TrieNode child : node.children.values()) {
                if (search(child, word, index + 1)) {
                    return true;
                }
            }
            return false;
        } else {
            TrieNode child = node.children.get(ch);
            if (child == null) {
                return false;
            }
            return search(child, word, index + 1);
        }
    }
}

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
    }
}