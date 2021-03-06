package web.dto;

import java.util.Date;

public class Upload {

	private int fileno;
	private String origin_name;
	private String stored_name;
	private long file_size; //파일 사이즈는 보통long으로 많이둠
	private Date upload_date;
	
	public int getFileno() {
		return fileno;
	}
	public void setFileno(int fileno) {
		this.fileno = fileno;
	}
	public String getOrigin_name() {
		return origin_name;
	}
	public void setOrigin_name(String origin_name) {
		this.origin_name = origin_name;
	}
	public String getStored_name() {
		return stored_name;
	}
	public void setStored_name(String stored_name) {
		this.stored_name = stored_name;
	}
	public long getFile_size() {
		return file_size;
	}
	public void setFile_size(long file_size) {
		this.file_size = file_size;
	}
	
	public Date getUpload_date() {
		return upload_date;
	}
	public void setUpload_date(Date upload_date) {
		this.upload_date = upload_date;
	}
	@Override
	public String toString() {
		return "Upload [fileno=" + fileno + ", origin_name=" + origin_name + ", stored_name=" + stored_name
				+ ", file_size=" + file_size + ", upload_date=" + upload_date + "]";
	}

}
