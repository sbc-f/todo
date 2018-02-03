package com.sbc.todo.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.sbc.todo.entity.TodoEntity;

@Dao
@ConfigAutowireable
public interface TodoDao {

	@Select
	List<TodoEntity> selectAll();

	@Insert(sqlFile=true)
	int insert(String memo);

	@Delete(sqlFile=true)
	int delete(int id);

	@Update(sqlFile=true)
	int updDoneFlg(TodoEntity e);

	@Update(sqlFile=true)
	int updMemo(TodoEntity e);
}
