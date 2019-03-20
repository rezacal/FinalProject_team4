package com.websocket.file.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.websocket.file.dto.FileDto;

@Repository
public class FileDaoImpl implements FileDao {
	
	@Autowired
	@Qualifier("fileSqlSessionTemplate")
	private SqlSessionTemplate sqlSession;

	@Override
	public List<FileDto> FileSelectList() {
		
		List<FileDto> list = new ArrayList<FileDto>();		
		list = sqlSession.selectList(NAMESPACE+"fileSelectList");
		
		return list;
	}

	@Override
	public int FileInsert(FileDto dto) {		
		int res = 0;
		try {
			res = sqlSession.insert(NAMESPACE + "fileInsert", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return res;
	}

	@Override
	public FileDto FileSelectOne(int fileno) {
		
		FileDto dto = new FileDto();
		dto = sqlSession.selectOne(NAMESPACE + "fileSelectOne", fileno);		
		return dto;
	}

	@Override
	public int FileSelectFileno(String filesavename) {		
		int res = 0;
		try {
			res = sqlSession.selectOne(NAMESPACE + "fileSelectFileno", filesavename);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return res;
	}

}
