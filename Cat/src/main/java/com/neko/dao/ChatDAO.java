package com.neko.dao;
import com.neko.model.Chat;
import java.util.List;
public interface ChatDAO
{
	public List <Chat> getAllcat();
	public void enregistrerChat (Chat c);
}
