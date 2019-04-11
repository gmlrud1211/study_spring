package web.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

import web.dto.Upload;

public class DownloadView extends AbstractView{
	
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//모델에서 파일정보 꺼내기
		Upload file = (Upload) model.get("downFile"); 
		
		//서블릿컨텍스트 객체 얻기
		ServletContext context = request.getSession().getServletContext();
		
		//업로드 경로 얻기
		String path = context.getRealPath("upload");
		
		//업로드된 파일 이름 얻기
		String filename = file.getStored_name();
		
		//업로드된 파일 객체얻기
		File src = new File(path, filename);	
		
		//파일확인
//		System.out.println(src.exists());
		
		//다운로드될 파일이름의 인코딩 설정
		String destFilename = URLEncoder.encode(file.getOrigin_name(),"UTF-8");
		
		//utf-8 url인코딩 오류 수정
		destFilename = destFilename.replace("+", "%20"); //공백
		
		destFilename = destFilename.replace("%5B", "["); //[
		destFilename = destFilename.replace("%5D", "]"); //]
		
		//이진데이터를 출력하는 MIME타입
		//브라우저는 이걸 응답받으면 파일로 생성함->다운로드 수행
		response.setContentType("application/octet-stream");
		
		//파일크기 설정
		//응답 데이터 크기 (설정하지않으면 파일크기 이상으로 받음)
		response.setContentLength((int)file.getFile_size());
		
		//응답 데이터 인코딩 설정
		response.setCharacterEncoding("utf-8");
		
		//다운로드되는 파일의 이름 설정
		response.setHeader("Content-Disposition", "attachment; filename=\""+destFilename+"\" ");
				
		//서버 File -> FileInputStream으로 읽기 
		//->Response의 OutputStream으로 출력
		
		//서버의 파일입력스트림
		FileInputStream fis = new FileInputStream(src);
		
		//서버의 응답출력스트림
		OutputStream out = response.getOutputStream();
		
		//서버->클라 복사
		FileCopyUtils.copy(fis, out);
		
		//출력스트림 버퍼 비우기
		out.flush();
		
		//스트림닫기
		fis.close();
		out.close();
		
		
		
	}

}
