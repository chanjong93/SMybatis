package com.example.demo.notice.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.notice.domain.NoticeVO;

@Repository
public interface NoticeMapper {
	
	//공지글 등록
		public void noticeRegister(NoticeVO vo);
		
	//전체 글목록 가져오기
		public List<NoticeVO> list();
		
	//글 상세페이지
		public NoticeVO details(Integer NT_NO);
		
	//글 수정하기
		public int modify(NoticeVO vo);
		
	//글 삭제하기
		public void delete(Integer NT_NO);
		
	//글 삭제 데이터 보관
		public void deletebackup(NoticeVO vo);
		
		
}
