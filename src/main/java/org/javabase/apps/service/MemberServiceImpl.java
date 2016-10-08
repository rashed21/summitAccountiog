package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Member;
import org.javabase.apps.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	@Transactional(readOnly=true)
	public List<Member> getAllMembers() {
		return memberMapper.getAllMembers();
	}

	@Override
	@Transactional(readOnly=true)
	public Member getMemberById(int memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public  Member getMemberByMemberContact(String memberContact) {
		return memberMapper.getMemberByMemberContact(memberContact);
	}

	@Override
	@Transactional
	public void addMember(Member member) {
		memberMapper.addMember(member);
	}

	@Override
	@Transactional
	public void updateMember(Member member) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void deleteMember(int memberId) {
		// TODO Auto-generated method stub

	}

}
