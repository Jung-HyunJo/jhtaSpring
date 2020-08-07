package kr.co.jhta.vo;

import java.util.Date;

public class Comment {
	private int commentNo;
	private String commentWriter;
	private String commnetContent;
	private int	blogNo;
	private Date commentCreatDate;
	
	public Comment() {}

	public Comment(int commentNo, String commentWriter, String commnetContent, int blogNo, Date commentCreatDate) {
		super();
		this.commentNo = commentNo;
		this.commentWriter = commentWriter;
		this.commnetContent = commnetContent;
		this.blogNo = blogNo;
		this.commentCreatDate = commentCreatDate;
	}

	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	public String getCommentWriter() {
		return commentWriter;
	}

	public void setCommentWriter(String commentWriter) {
		this.commentWriter = commentWriter;
	}

	public String getCommnetContent() {
		return commnetContent;
	}

	public void setCommnetContent(String commnetContent) {
		this.commnetContent = commnetContent;
	}

	public int getBlogNo() {
		return blogNo;
	}

	public void setBlogNo(int blogNo) {
		this.blogNo = blogNo;
	}

	public Date getCommentCreatDate() {
		return commentCreatDate;
	}

	public void setCommentCreatDate(Date commentCreatDate) {
		this.commentCreatDate = commentCreatDate;
	}
	
	
}
