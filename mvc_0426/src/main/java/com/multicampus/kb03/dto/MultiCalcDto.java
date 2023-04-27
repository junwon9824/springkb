package com.multicampus.kb03.dto;

public class MultiCalcDto {

	private int n1, n2, ans;

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "MultiCalcDto [n1=" + n1 + ", n2=" + n2 + ", ans=" + ans + "]";
	}

}
