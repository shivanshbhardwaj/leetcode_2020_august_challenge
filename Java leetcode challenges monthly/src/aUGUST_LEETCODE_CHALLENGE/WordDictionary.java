package aUGUST_LEETCODE_CHALLENGE;

class Tnode {
    Tnode[] child;
    boolean hasWord;
    
    public Tnode() {
    	
    	 hasWord = false;
        child = new Tnode[26];
       
    }
    
    public void insert(String word, int index) {
        if (index == word.length()) {
            hasWord = true;
            return;
        }
        int position = word.charAt(index) - 'a';
        if (child[position] == null) {
            child[position] = new Tnode();
        }
        child[position].insert(word, index + 1);
    }
    
    public boolean f(String word, int indx) {
        if (indx == word.length()) {
            return this.hasWord == true;
        }
        char c = word.charAt(indx);
        if (c != '.') {
            int pos = c - 'a';
            if (child[pos] == null) return false;
            return child[pos].f(word, indx + 1);
        } else if (c == '.') {
            for (int i = 0; i < 26; i++) {
                if (child[i] != null) {
                    boolean temp = child[i].f(word, indx + 1);
                    if (temp) {
                        return true;
                    } 
                }
            }
        }
        return false;
    }
}
public class WordDictionary {

    /** Initialize your data structure here. */
	Tnode root;

	public WordDictionary() {
        root = new Tnode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        root.insert(word, 0);
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return root.f(word, 0);
        
    }
}