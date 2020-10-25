package com.experian.credit.report.model.request;

import java.util.List;

public class CustomOptions {

	private List<String> optionId;

    public void setOptionId(List<String> optionId){
        this.optionId = optionId;
    }
    public List<String> getOptionId(){
        return this.optionId;
    }
}
