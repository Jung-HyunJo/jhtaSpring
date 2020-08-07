package kr.co.jhta.vo;

import java.util.Date;

public class Blog {
	private int blogNo;
	private String blogTitle;
	private String blogWriter;
	private String blogContent;
	private int blogLikes;
	private int blogCommentCounts;
	private Date blogCreateDate;
	
	public Blog() {}

	public Blog(int blogNo, String blogTitle, String blogWriter, String blogContent, int blogLikes,
			int blogCommentCounts, Date blogCreateDate) {
		super();
		this.blogNo = blogNo;
		this.blogTitle = blogTitle;
		this.blogWriter = blogWriter;
		this.blogContent = blogContent;
		this.blogLikes = blogLikes;
		this.blogCommentCounts = blogCommentCounts;
		this.blogCreateDate = blogCreateDate;
	}

	public int getBlogNo() {
		return blogNo;
	}

	public void setBlogNo(int blogNo) {
		this.blogNo = blogNo;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogWriter() {
		return blogWriter;
	}

	public void setBlogWriter(String blogWriter) {
		this.blogWriter = blogWriter;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	public int getBlogLikes() {
		return blogLikes;
	}

	public void setBlogLikes(int blogLikes) {
		this.blogLikes = blogLikes;
	}

	public int getBlogCommentCounts() {
		return blogCommentCounts;
	}

	public void setBlogCommentCounts(int blogCommentCounts) {
		this.blogCommentCounts = blogCommentCounts;
	}

	public Date getBlogCreateDate() {
		return blogCreateDate;
	}

	public void setBlogCreateDate(Date blogCreateDate) {
		this.blogCreateDate = blogCreateDate;
	}
	
	
}
