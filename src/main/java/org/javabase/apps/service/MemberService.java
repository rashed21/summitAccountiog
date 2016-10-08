package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Member;
import org.javabase.apps.entity.User;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface MemberService {
	
	List<Member> getAllMembers();
	Member getMemberById(int memberId);
	Member getMemberByMemberContact(String memberContact);
    void addMember(Member member);
    void updateMember(Member member);
    void deleteMember(int memberId);

}
