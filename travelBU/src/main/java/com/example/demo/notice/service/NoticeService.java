package com.example.demo.notice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.notice.domain.NoticeVO;
import com.example.demo.notice.mapper.NoticeMapper;

@Service
public class NoticeService {

	@Autowired
	NoticeMapper noticemapper;
	
	//공지글 등록
	public void noticeRegister(NoticeVO vo) {
		noticemapper.noticeRegister(vo);
	}
		
	//전체 글 목록 가져오기
	public List<NoticeVO> list(){
		List<NoticeVO> list = noticemapper.list();
		return list;
	}
	
	//글 상세 조회
	public NoticeVO details(Integer NT_NO ) {
		return noticemapper.details(NT_NO);
	}
	
	//글 수정하기
	public boolean modify(NoticeVO vo) {
		return noticemapper.modify(vo) == 1;
		
	}
	
	//글 삭제하기
	public void delete(Integer NT_NO) {
		noticemapper.delete(NT_NO);
	}
	
	//글 삭제데이터 보관
	public void deletebackup(NoticeVO vo) {
		noticemapper.deletebackup(vo);
	}
}
