package web.dao.face;

import web.dto.Upload;

public interface FileDao {

	//파일업로드 기록저장	
	public void insert(Upload upload);
}
