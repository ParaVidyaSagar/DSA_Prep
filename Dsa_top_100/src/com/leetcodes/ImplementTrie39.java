package com.leetcodes;

public class ImplementTrie39 {
   static class TrieNode{
	   TrieNode[] children;
	   boolean isEndOfWord;
	   public TrieNode() {
		   children = new TrieNode[26]; // For lowercase English letters
		   isEndOfWord = false;
	   }
   }
   
   public static class Trie{
	   private TrieNode root;
	   
	   public Trie() {
		   root = new TrieNode();
	   }
	   public void insert(String word) {
		   TrieNode current = root;
		   for(char ch : word.toCharArray()) {
			   int index = ch - 'a';// Mapping a-z to 0-25
           if(current.children[index] == null) {
        	   current.children[index] = new TrieNode();
        	
           }
           current = current.children[index];
		   }
		   current.isEndOfWord = true;
	   }
	   
	   public boolean search(String word) {
		   TrieNode node = searchPrefix(word);
		   return node != null && node.isEndOfWord;
	   }
	   
	   public boolean startsWith(String prefix) {
		   return searchPrefix(prefix) != null;
	   }
	   
	   private TrieNode searchPrefix(String prefix) {
		   TrieNode current = root;
		   for(char ch: prefix.toCharArray()) {
			   int index = ch - 'a';
			   if(current.children[index] == null) {
				   return null;
			   }
			   current = current.children[index];
		   }
		   return current;
	   }
   }
   
   
   public static void main(String[] args) {
	Trie trie = new Trie();
	trie.insert("apple");
	System.out.println(trie.search("apple"));   // true
    System.out.println(trie.search("app"));     // false
    System.out.println(trie.startsWith("app")); // true
    trie.insert("app");
    System.out.println(trie.search("app"));     // true
}
}
