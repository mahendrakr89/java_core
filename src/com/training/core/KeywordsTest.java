package com.training.core;

import java.util.List;

import com.training.core.constant.CoreConstant;
import com.training.core.reservewords.ReserveKeywords;

public class KeywordsTest {

	public static void main(String[] args) {
	List<String> primitiveReserveWords= ReserveKeywords.getReserveWordsFor(CoreConstant.RESERVE_WORDS_FOR_EXCEPTION_HANDLING);
	for (String primitiveReserveWord : primitiveReserveWords) {
		System.out.println(primitiveReserveWord);
	}
	}

}
