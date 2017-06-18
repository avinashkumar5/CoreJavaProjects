package com.janbask.training;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {

		int N = 777777;
		long t;

		t = System.currentTimeMillis();
		StringBuffer s = new StringBuffer();
		for (int i = N; i > 0; i--) {
			s.append("");
		}
		System.out.println("Operation time taken to completed String Buffer Operation " + (System.currentTimeMillis() - t));

		t = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = N; i > 0; i--) {
			sb.append("");
		}
		System.out.println("Operation time taken to completed String Builder Operation " + (System.currentTimeMillis() - t));

	}

}
