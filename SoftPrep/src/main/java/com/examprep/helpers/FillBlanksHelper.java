package com.examprep.helpers;

import com.examprep.entities.Question;
import com.examprep.interfaces.QuestionTypeHelper;
import org.apache.poi.ss.usermodel.Row;

public class FillBlanksHelper implements QuestionTypeHelper {

	private String type;

	public FillBlanksHelper(String type){
		this.type=type;
	}
	
	@Override
	public void addQuestionInfo(Question question, Row row) {
		// TODO Auto-generated method stub
		
	}

}
