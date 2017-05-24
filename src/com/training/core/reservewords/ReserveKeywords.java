package com.training.core.reservewords;

import java.util.List;

import com.training.core.container.ReserveWordsContainer;

public class ReserveKeywords {
	
public static List<String>   getReserveWordsFor(String reserveWordsType){
	return new ReserveWordsContainer().getAllReserveWords().get(reserveWordsType);
}
	
}
