package com.revature.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.revature.eval.EvaluationService;

public class EvaludationServiceTest {
	// Question 1
		@Test
		public void reverseWord() {
			EvaluationService es = new EvaluationService();
			assertEquals("elpmaxe", es.reverse("example"));
		}
	// Question 2	
		@Test
		public void createAcronym() {
			EvaluationService es = new EvaluationService();
			assertEquals("PNG", es.acronym("Portable Network Graphics"));
		}
	// Question 3	
		@Test
		public void scoreScrabble() {
			EvaluationService es = new EvaluationService();
			assertEquals(14, es.getScrabbleScore("CABBAGE"));
		}
	// Question 4	
		@Test
		public void findCount() {
			EvaluationService es = new EvaluationService();
			Map<String, Integer> expectedWordCount = new HashMap<>();
			expectedWordCount.put("one", 1);
			expectedWordCount.put("of", 1);
			expectedWordCount.put("each", 1);
	 
			Map<String, Integer> actualWordCount = es.wordCount("one of each");
			assertEquals(expectedWordCount, actualWordCount);
		}
}
