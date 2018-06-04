package com.executorservice.client;

import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.Term;
import org.apache.lucene.index.Terms;

import com.lucene.fuzzy.Indexer;

public class WordFrequency {

	public static void main(String[] args) {
		Indexer ir = IndexReader.open(dir); 
		Terms termDocs = ir.termDocs(new Term("your_field", "your_word"));
		int count = 0;
		while (termDocs.next()) {
		   count += termDocs.freq();
		}

	}

}
