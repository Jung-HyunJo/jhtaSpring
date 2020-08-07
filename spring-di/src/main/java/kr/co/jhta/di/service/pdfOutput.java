package kr.co.jhta.di.service;

public class pdfOutput implements Output {

	@Override
	public void write(String text) {
		System.out.println("PDF : " + text);
	}
	
}
