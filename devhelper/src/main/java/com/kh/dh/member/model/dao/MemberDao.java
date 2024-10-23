package com.kh.dh.member.model.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.dh.member.model.vo.Member;

@Repository
public class MemberDao {
	public int insertMember(SqlSessionTemplate sqlSession, Member m) {
		return sqlSession.insert("memberMapper.insertMember", m);
	}
	
	public Member selectMember(SqlSessionTemplate sqlSession, Member m) {
		return sqlSession.selectOne("memberMapper.selectMember", m);
	}
	
	public Member selectMemberDetail(SqlSessionTemplate sqlSession, int memNo) {
		return sqlSession.selectOne("memberMapper.selectMemberDetail", memNo);
	}

	public int updatemember(SqlSessionTemplate sqlSession,Member m)
	{
		return sqlSession.update("memberMapper.updatemember", m);
	}
	public ArrayList<Member> userlist(SqlSessionTemplate sqlSession)
	{
		return (ArrayList)sqlSession.selectList("memberMapper.userlist");
	}

}
