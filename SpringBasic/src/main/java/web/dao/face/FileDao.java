package web.dao.face;

import java.util.List;

import web.dto.Upload;

public interface FileDao {

	//파일업로드 기록저장	
	public void insert(Upload upload);

	//파일 전체조회
	public List<Upload> selectAll();

	//지정된 파일조회
	public Upload selectByFileno(int fileno);
}
