package com.sbc.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbc.todo.entity.TodoEntity;
import com.sbc.todo.form.TodoForm;
import com.sbc.todo.service.TodoService;

@Controller
public class AppController {

	@Autowired
	TodoService todoService;

	//-------------------------
	// 画面
	//-------------------------
	@RequestMapping("/")
	public String todo(Model model){
		List<TodoEntity>todoList = todoService.selectAll();
		model.addAttribute("todoList", todoList);
		return "todo";
	}

	@RequestMapping("/add")
	public String add(@ModelAttribute TodoForm form, Model model){

		// 追加
		todoService.insert(form.getMemo());

		List<TodoEntity>todoList = todoService.selectAll();
		model.addAttribute("todoList", todoList);
		return "todo";
	}

	@RequestMapping("/del")
	public String del(@ModelAttribute TodoForm form, Model model){

		// 削除
		todoService.delete(form.getId());

		List<TodoEntity>todoList = todoService.selectAll();
		model.addAttribute("todoList", todoList);
		return "todo";
	}

	@RequestMapping("/updDoneFlg")
	public String updDoneFlg(@ModelAttribute TodoForm form, Model model){

		// 削除
		TodoEntity entity = new TodoEntity();
		entity.id = form.getId();
		entity.doneFlg = true;
		todoService.updDoneFlg(entity);

		List<TodoEntity>todoList = todoService.selectAll();
		model.addAttribute("todoList", todoList);
		return "todo";
	}

}
