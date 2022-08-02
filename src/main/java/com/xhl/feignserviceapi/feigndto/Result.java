package com.xhl.feignserviceapi.feigndto;

import com.alibaba.fastjson.JSONObject;

public class Result<T> {

	//1 表示成功，0表示失败
	private String code;
	private T data;
	private String message;

	public Result() {
		super();
	}


	public static Result<Object> Success(){
		Result<Object> result = new Result<Object>();
		result.setCode("1");
		result.setMessage("操作成功");
		return result;
	}
	public static Result<Object> Fail(){
		Result<Object> result = new Result<Object>();
		result.setCode("0");
		result.setMessage("操作失败");
		return result;
	}

	public static Result<JSONObject> SuccessJsonObject(JSONObject data){
		Result<JSONObject> result = new Result<JSONObject>();
		result.setCode("1");
		result.setData(data);
		return result;
	}

	public static Result<JSONObject> FailJsonObject(JSONObject data){
		Result<JSONObject> result = new Result<>();
		result.setCode("0");
		result.setData(data);
		return result;
	}


	public Result(T data) {
		super();
		this.code = "1";
		this.data = data;
	}


	public Result(String code, T data) {
		super();
		this.code = code;
		this.data = data;
	}



	public Result(String code, T data, String message) {
		super();
		this.code = code;
		this.data = data;
		this.message = message;
	}


	public Result(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}


	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


}
