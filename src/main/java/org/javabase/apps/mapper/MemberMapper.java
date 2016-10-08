package org.javabase.apps.mapper;

import java.util.List;

import org.javabase.apps.entity.Member;
import org.javabase.apps.entity.Member;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface MemberMapper {
	
	List<Member> getAllMembers();
	Member getMemberById(int memberId);
	Member getMemberByMemberContact(String memberContact);
    void addMember(Member member);
    void updateMember(Member member);
    void deleteMember(int memberId);

}
