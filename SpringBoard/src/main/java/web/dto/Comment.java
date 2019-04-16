package web.dto;

import java.util.Date;

public class Comment {

	private int comment_no;
	private int board_no;
	private String writer_id;
	private String writer_nick;
	private String content;
	private Date write_date;
	
	public int getComment_no() {
		return comment_no;
	}
	public void setComment_no(int comment_no) {
		this.comment_no = comment_no;
	}
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public String getWriter_id() {
		return writer_id;
	}
	public void setWriter_id(String writer_id) {
		this.writer_id = writer_id;
	}
	public String getWriter_nick() {
		return writer_nick;
	}
	public void setWriter_nick(String writer_nick) {
		this.writer_nick = writer_nick;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	@Override
	public String toString() {
		return "Comment [comment_no=" + comment_no + ", board_no=" + board_no + ", writer_id=" + writer_id
				+ ", writer_nick=" + writer_nick + ", content=" + content + ", write_date=" + write_date + "]";
	}
	
	
	
}
