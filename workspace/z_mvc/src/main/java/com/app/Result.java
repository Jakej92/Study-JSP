package com.app;

public class Result {
//	리턴할게 여러갠데 리턴은 하나밖에 못하니까
//		그 여러개를 하나에 담아 리턴하기 위해 만든 Result class
	private String path; // 문자열타입의 필드로 path
	private boolean isForward; // 참 또는 거짓, 불린 타입의 필드 isForward
	
	public Result() {;} // 기본생성자

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isForward() {
		return isForward;
	}

	public void setForward(boolean isForward) {
		this.isForward = isForward;
	}

	@Override
	public String toString() {
		return "Result [path=" + path + ", isForward=" + isForward + "]";
	}
}
