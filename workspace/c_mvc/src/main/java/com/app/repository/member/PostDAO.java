package com.app.repository.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.configuration.Configuration;
import com.app.domain.vo.PostVO;

public class PostDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
//	게시글 작성
	public void insert(PostVO postVO) {
		String query = "INSERT INTO TBL_POST "
	            + "(ID, POST_TITLE, POST_CONTENT, MEMBER_ID) "
	            + "VALUES(SEQ_POST.NEXTVAL, ?, ?, ?)";
	      
	      connection = Configuration.getConnection();
	      try {
	         preparedStatement = connection.prepareStatement(query);
	         preparedStatement.setString(1, postVO.getPostTitle());
	         preparedStatement.setString(2, postVO.getPostContent());
	         preparedStatement.setLong(3, postVO.getMemberId());
	         preparedStatement.executeUpdate();
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if (connection != null) {
	               connection.close();
	            }
	         } catch (SQLException e) {
	            throw new RuntimeException();
	         }
	      }
	   }
	}
//		String query = "INSERT INTO TBL_POST "
//				+ "(ID, POST_TITLE, POST_CONTENT, POST_READ_COUNT, "
//				+ "MEMBER_ID, CREATED_DATE, UPDATED_DATE) "
//				+ "VALUES(SEQ_POST.NEXTVAL, ?, ?, 0, ?, SYSDATE, SYSDATE)";
//		
//		connection = Configuration.getConnection();
//		try {
//	         preparedStatement = connection.prepareStatement(query);
//	         preparedStatement.setString(1, postVO.getPostTitle());
//	         preparedStatement.setString(2, postVO.getPostContent());
////	         preparedStatement.setInt(3, postVO.getPostReadCount());
//	         preparedStatement.setLong(3, postVO.getMemberId());
//	         preparedStatement.executeUpdate();
//	         
//	      } catch (SQLException e) {
//	         e.printStackTrace();
//	      } finally {
//	         try {
//	            if (preparedStatement != null) {
//	               preparedStatement.close();
//	            }
//	            if (connection != null) {
//	               connection.close();
//	            }
//	         } catch (SQLException e) {
//	            throw new RuntimeException();
//	         }
//	      }
//	   }

