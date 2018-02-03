package com.sbc.todo.form;

import lombok.Data;

@Data
public class TodoForm {

	private int id;
	private String memo;
	private boolean doneFlg;
}
