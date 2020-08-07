package kr.co.jhta.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.jhta.dto.BlogDto;
import kr.co.jhta.util.MybatisUtil;
import kr.co.jhta.vo.Blog;

public class BlogDao {

	public void insertBlog(Blog blog) {
		SqlSession session = MybatisUtil.getSqlSession();
		try {
			session.insert("insertBlog", blog);
		}finally {
			session.close();
		}
	}
	
	
	
	
	public List<BlogDto> getAllBlogs() {
		SqlSession session = MybatisUtil.getSqlSession();
		
		try {
			List<BlogDto> blogs = session.selectList("getAllBlogs");
			return blogs;
		}finally {
			session.close();
		}
	}		// spring_blogs와 spring_users 조인
	
	
	
	public BlogDto getBlogByNo(int blogNo) {
		SqlSession session = MybatisUtil.getSqlSession();
		
		try {
			
		}finally {
			session.close();
		}
	}		// spring_blogs와 spring_users 조인
	
	
	
	public void updateBlog(Blog blog) {
		SqlSession session = MybatisUtil.getSqlSession();
		
		try {
			
		}finally {
			session.close();
		}
	}
}
