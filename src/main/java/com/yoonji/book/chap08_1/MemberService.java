package com.yoonji.book.chap08_1;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yoonji.book.chap03.Member;

/**
 * p.204 [由ъ뒪�듃 8.13]瑜� Main怨� Service濡� 遺꾨━�븳 Service 遺�遺�
 * 
 * @author Jacob
 */
@Service
public class MemberService {

	Logger logger = LogManager.getLogger();

	@Autowired
	MemberDao memberDao = null;

	/**
	 * memberDao setter for injection
	 */

	public void selectAll() {
		List<Member> members = memberDao.selectAll(0, 100);
		logger.debug(members);
	}

	public void updateMember() {
		Member member = memberDao.selectByEmail("sunha0822@naver.com");
		member.setPassword("b");
		memberDao.update(member);
		logger.debug("Update complete.");
	}

	public void insertMember() {
		Member member = new Member();
		member.setEmail("tlsdbswl0615_1@naver.com");
		member.setPassword("0615");
		member.setName("신윤지");
		memberDao.insert(member);
		logger.debug("Insert complete.");
	}
}
