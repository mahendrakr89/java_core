package com.training.core.container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.core.constant.CoreConstant;

public class ReserveWordsContainer {
	
	
	public  Map<String, List<String>> getAllReserveWords(){
		Map<String, List<String>> reserverwords=new HashMap<>();
		
		reserverwords.put(CoreConstant.RESERVE_WORDS_FOR_DATA_TYPE, getReserveWordsForDataType());
		reserverwords.put(CoreConstant.RESERVE_WORDS_FOR_CLASS, getReserverWordsForClass());
		reserverwords.put(CoreConstant.RESERVE_WORDS_FOR_UNUSED_KEYWORDS,getUnusedKeywords());
		reserverwords.put(CoreConstant.RESERVE_WORDS_FOR_EXCEPTION_HANDLING, getReserverWordsForExceptionHandling());
		reserverwords.put(CoreConstant.RESERVE_WORDS_FOR_OBJECT, getReserverWordsForObject());
		reserverwords.put(CoreConstant.RESERVE_WORDS_FOR_FLOW_CONTROL, getReserverWordsForFlowControl());
		reserverwords.put(CoreConstant.RESERVE_WORDS_FOR_LITERALS, getReserverWordsForLiterals());
		reserverwords.put(CoreConstant.RESERVE_WORDS_FOR_MODIFIERS, getReserverWordsForModifiers());
		return reserverwords;
	}
	private List<String> getReserveWordsForDataType() {

		List<String> primitiveReserveWords = new ArrayList<>();
		primitiveReserveWords.add("boolean");
		primitiveReserveWords.add("byte");
		primitiveReserveWords.add("char");
		primitiveReserveWords.add("short");
		primitiveReserveWords.add("int");
		primitiveReserveWords.add("long");
		primitiveReserveWords.add("float");
		primitiveReserveWords.add("double");

		return primitiveReserveWords;
	}

	private List<String> getReserverWordsForClass() {
		List<String> classReserveWords = new ArrayList<>();
		classReserveWords.add("class");
		classReserveWords.add("interface");
		classReserveWords.add("package");
		classReserveWords.add("import");
		classReserveWords.add("extends");
		classReserveWords.add("implements");
		classReserveWords.add("enum");
		return classReserveWords;
	}

	private List<String> getReserverWordsForObject() {
		List<String> objectReserveWords = new ArrayList<>();
		objectReserveWords.add("new");
		objectReserveWords.add("instanceof");
		objectReserveWords.add("super");
		objectReserveWords.add("this");
		return objectReserveWords;
	}

	private List<String> getReserverWordsForExceptionHandling() {
		List<String> exceptionHandlingReserveWords = new ArrayList<>();
		exceptionHandlingReserveWords.add("try");
		exceptionHandlingReserveWords.add("catch");
		exceptionHandlingReserveWords.add("finally");
		exceptionHandlingReserveWords.add("throw");
		exceptionHandlingReserveWords.add("throws");
		exceptionHandlingReserveWords.add("assert");
		return exceptionHandlingReserveWords;
	}

	private List<String> getReserverWordsForFlowControl() {
		List<String> flowControlReserveWords = new ArrayList<>();
		flowControlReserveWords.add("if");
		flowControlReserveWords.add("else");
		flowControlReserveWords.add("switch");
		flowControlReserveWords.add("case");
		flowControlReserveWords.add("default");
		flowControlReserveWords.add("for");
		flowControlReserveWords.add("do");
		flowControlReserveWords.add("while");
		flowControlReserveWords.add("break");
		flowControlReserveWords.add("continue");
		flowControlReserveWords.add("return");
		return flowControlReserveWords;
	}

	private List<String> getReserverWordsForModifiers() {
		List<String> modifiersReserveWords = new ArrayList<>();
		modifiersReserveWords.add("public");
		modifiersReserveWords.add("private");
		modifiersReserveWords.add("protected");
		modifiersReserveWords.add("static");
		modifiersReserveWords.add("final");
		modifiersReserveWords.add("abstract");
		modifiersReserveWords.add("synchronized");
		modifiersReserveWords.add("native");
		modifiersReserveWords.add("strictfp");
		modifiersReserveWords.add("transient");
		modifiersReserveWords.add("volatile");
		return modifiersReserveWords;
	}

	private List<String> getReserverWordsForLiterals() {
		List<String> literalReserveWords = new ArrayList<>();
		literalReserveWords.add("true");
		literalReserveWords.add("false");
		literalReserveWords.add("null");
		return literalReserveWords;
	}

	private List<String> getUnusedKeywords() {
		List<String> unusedReserveWords = new ArrayList<>();
		unusedReserveWords.add("goto");
		unusedReserveWords.add("const");
		return unusedReserveWords;
	}
}
