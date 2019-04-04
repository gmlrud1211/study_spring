package mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConnectionFactory {

	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		//마이바티스 설정파일
		String res = "mybatis/mybatis-config.xml";
		
		try {
			//마이바티스 설정파일 입력 객체
			Reader reader = Resources.getResourceAsReader(res);
			
			//싱글톤으로 객체 생성하기
			if(sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//private 생성자
	private MyBatisConnectionFactory() {}
	
	// 객체반환 메소드
	public static SqlSessionFactory getSessionFactory() {
		
		return sqlSessionFactory;
	}
	
}
