package com.sbc.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbc.todo.dao.TodoDao;
import com.sbc.todo.entity.TodoEntity;

@Service
public class TodoService {

	@Autowired
	TodoDao todoDao;

	/**
	 * 全件取得
	 *
	 * @return
	 */
	public List<TodoEntity> selectAll(){
		return todoDao.selectAll();
	}

	/**
	 * メモ登録
	 *
	 * @param memo
	 * @return
	 */
	public int insert(String memo){
		return todoDao.insert(memo);
	}

	/**
	 * メモ削除
	 *
	 * @param memo
	 * @return
	 */
	public int delete(int id){
		return todoDao.delete(id);
	}

	/**
	 * 完了フラグ更新
	 *
	 * @param entity
	 * @return
	 */
	public int updDoneFlg(TodoEntity entity){
		return todoDao.updDoneFlg(entity);
	}

	/**
	 * メモ更新
	 *
	 * @param entity
	 * @return
	 */
	public int updMemo(TodoEntity entity){
		return todoDao.updMemo(entity);
	}
}
