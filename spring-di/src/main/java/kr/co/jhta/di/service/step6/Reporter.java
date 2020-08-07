package kr.co.jhta.di.service.step6;

import kr.co.jhta.di.service.Output;

public class Reporter {

	private Output output;
	
	public void setOutput(Output output) {
		this.output = output;
		
	}
	public void report(String title, String text) {
		System.out.println("output객체--->" + output);
		output.write("제목: " + title);
		output.write("내용: " + text);
	}
}
