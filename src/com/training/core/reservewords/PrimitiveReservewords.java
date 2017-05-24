package com.training.core.reservewords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.core.constant.CoreConstant;

public class PrimitiveReservewords {
	
public static List<String>   getReserveWordsFor(String reserveWordsType){
	Map<String, List<String>> reserverwords=new HashMap<>();
	List<String> primitiveReserveWords=new ArrayList<>();
	primitiveReserveWords.add("boolean");
	primitiveReserveWords.add("byte");
	primitiveReserveWords.add("char");
	primitiveReserveWords.add("short");
	primitiveReserveWords.add("int");
	primitiveReserveWords.add("long");
	primitiveReserveWords.add("float");
	primitiveReserveWords.add("double");
	
	reserverwords.put(CoreConstant.RESERVE_WORDS_FOR_DATA_TYPE, primitiveReserveWords);
	return reserverwords.get(reserveWordsType);
}
	
}
