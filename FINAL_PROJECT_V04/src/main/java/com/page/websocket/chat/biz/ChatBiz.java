package com.page.websocket.chat.biz;

import java.util.List;

import com.page.user.dto.UserVO;
import com.page.websocket.chat.dto.ChatDto;

public interface ChatBiz {	
	
	public List<ChatDto> selectList();	
	public int insert(ChatDto dto);
	public List<ChatDto> ChatSelectPageList(int pageno);
	
	public UserVO chatSelectID(int user_no);
	
	public int CheckSaveChat(int user_no);
	public int CheckSavePaint(int user_no);

}
