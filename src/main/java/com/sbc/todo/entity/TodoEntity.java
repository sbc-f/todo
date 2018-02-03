package com.sbc.todo.entity;

import org.seasar.doma.Entity;

@Entity
public class TodoEntity {

	/** ID */
	public int id;

	/** メモ */
	public String memo;

	/** 完了フラグ */
	public boolean doneFlg;
}
