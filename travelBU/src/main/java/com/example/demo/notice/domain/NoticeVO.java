package com.example.demo.notice.domain;

import java.sql.Date;


public class NoticeVO {
	
	  private Integer NT_NO;
	  private String NT_TITLE;
	  private String NT_CONTENT;
	  private String NT_WRITER;
	  private Date NT_WRITEDATE;
      private Date NT_UPDATEDATE;
      private Integer NT_HITS;
	
      
      public NoticeVO(Integer nT_NO, String nT_TITLE, String nT_CONTENT, String nT_WRITER, Date nT_WRITEDATE,
			Date nT_UPDATEDATE, Integer nT_HITS) {
		super();
		NT_NO = nT_NO;
		NT_TITLE = nT_TITLE;
		NT_CONTENT = nT_CONTENT;
		NT_WRITER = nT_WRITER;
		NT_WRITEDATE = nT_WRITEDATE;
		NT_UPDATEDATE = nT_UPDATEDATE;
		NT_HITS = nT_HITS;
	}


	public Integer getNT_NO() {
		return NT_NO;
	}


	public void setNT_NO(Integer nT_NO) {
		NT_NO = nT_NO;
	}


	public String getNT_TITLE() {
		return NT_TITLE;
	}


	public void setNT_TITLE(String nT_TITLE) {
		NT_TITLE = nT_TITLE;
	}


	public String getNT_CONTENT() {
		return NT_CONTENT;
	}


	public void setNT_CONTENT(String nT_CONTENT) {
		NT_CONTENT = nT_CONTENT;
	}


	public String getNT_WRITER() {
		return NT_WRITER;
	}


	public void setNT_WRITER(String nT_WRITER) {
		NT_WRITER = nT_WRITER;
	}


	public Date getNT_WRITEDATE() {
		return NT_WRITEDATE;
	}


	public void setNT_WRITEDATE(Date nT_WRITEDATE) {
		NT_WRITEDATE = nT_WRITEDATE;
	}


	public Date getNT_UPDATEDATE() {
		return NT_UPDATEDATE;
	}


	public void setNT_UPDATEDATE(Date nT_UPDATEDATE) {
		NT_UPDATEDATE = nT_UPDATEDATE;
	}


	public Integer getNT_HITS() {
		return NT_HITS;
	}


	public void setNT_HITS(Integer nT_HITS) {
		NT_HITS = nT_HITS;
	}


	@Override
	public String toString() {
		return "NoticeVO [NT_NO=" + NT_NO + ", NT_TITLE=" + NT_TITLE + ", NT_CONTENT=" + NT_CONTENT + ", NT_WRITER="
				+ NT_WRITER + ", NT_WRITEDATE=" + NT_WRITEDATE + ", NT_UPDATEDATE=" + NT_UPDATEDATE + ", NT_HITS="
				+ NT_HITS + "]";
	}
	
   
      
      
}