package com.training.core.reservewords;

import java.util.List;

import com.training.core.container.ReserveWordsContainer;

public class ReserveKeywords {
	
public static List<String>   getReserveWordsFor(String reserveWordsType){
	ReserveWordsContainer reserveWordsContainer=new ReserveWordsContainer();
	return reserveWordsContainer.getAllReserveWords().get(reserveWordsType);
}
	
}
