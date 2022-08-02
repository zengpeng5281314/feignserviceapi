package com.xhl.feignserviceapi.feigndto;

public class ResultUtil {
	
	public static Result success(Object object) {
		Result result = new Result();
		result.setCode("1");
		result.setData(object);
		result.setMessage("成功");
		return result;
	}
	
	public static Result success() {
		Result result = new Result();
		result.setCode("1");
		result.setMessage("成功");
		return result;
	}
	public static Result success(String code, String msg) {
		Result result = new Result();
		result.setCode(code);
		result.setMessage(msg);
		return result;
	}
	
	public static Result success(String code, String msg, Object object) {
		Result result = new Result();
		result.setCode(code);
		result.setMessage(msg);
		result.setData(object);
		return result;
	}
	
	public static Result error(String code, String msg ) {
		Result result = new Result();
		result.setCode(code);
		result.setMessage(msg);
		result.setData("");
		return result;
	}

	public static Result error(String code, String msg, Object object) {
		Result result = new Result();
		result.setCode(code);
		result.setMessage(msg);
		result.setData(object);
		return result;
	}


}
