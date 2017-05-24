package com.training.core;

import java.util.List;

import com.training.core.constant.CoreConstant;
import com.training.core.reservewords.PrimitiveReservewords;

public class Keywords {

	public static void main(String[] args) {
	List<String> primitiveReserveWords= PrimitiveReservewords.getReserveWordsFor(CoreConstant.RESERVE_WORDS_FOR_DATA_TYPE);
	for (String primitiveReserveWord : primitiveReserveWords) {
		System.out.println(primitiveReserveWord);
	}
	}

}
