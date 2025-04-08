package com.app.repository.admin;

import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.domain.vo.AdminVO;
import com.app.mybatis.config.MyBatisConfig;

public class AdminDAO {
	public SqlSession sqlSession;
	
	public AdminDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
//	관리자 추가
	public void insert(AdminVO adminVO) {
		sqlSession.insert("admin.insert", adminVO);
	}
	
//	이메일 중복검사
	public Optional<AdminVO> selectByAdminAccount(String adminAccount){
		return Optional
				.ofNullable((AdminVO)sqlSession
						.selectOne("admin.selectByAdminAccount", adminAccount));
	}
	
//	로그인
	public Optional<AdminVO> selectByAdminAccountAndPassword(AdminVO adminVO) {
		return Optional
				.ofNullable((AdminVO)sqlSession
						.selectOne("admin.selectByAdminAccountAndPassword", adminVO));
	}
	
}
