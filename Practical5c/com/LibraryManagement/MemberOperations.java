package com.LibraryManagement;

import java.util.Optional;

public interface MemberOperations {
	void addMember(Member member);
    Optional<Member> findMemberById(int memberId);
}

