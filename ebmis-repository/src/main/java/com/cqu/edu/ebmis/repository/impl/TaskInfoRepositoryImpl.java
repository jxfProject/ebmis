package com.cqu.edu.ebmis.repository.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cqu.edu.ebmis.domain.TaskInfoDO;
import com.cqu.edu.ebmis.mapper.TaskInfoMapper;
import com.cqu.edu.ebmis.repository.TaskInfoRepository;

@Repository
public class TaskInfoRepositoryImpl  implements TaskInfoRepository {
	@Resource
	private TaskInfoMapper taskInfoMapper;

	@Override
	public int findAwaitTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findAwaitTaskNum(taskIfoDO);
	}

	@Override
	public int findExecutedTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findExecutedTaskNum(taskIfoDO);
	}

	@Override
	public int findExecutingTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findExecutingTaskNum(taskIfoDO);
	}

	@Override
	public int findDefultAwaitTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findDefultAwaitTaskNum(taskIfoDO);
	}

	@Override
	public int findDefultExecutedTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findDefultExecutedTaskNum(taskIfoDO);
	}

	@Override
	public int findDefultExecutingTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findDefultExecutingTaskNum(taskIfoDO);
	}

	@Override
	public int findAllExecutTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findAllExecutTaskNum(taskIfoDO);
	}

	@Override
	public int findDefultAllExecutTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findDefultAllExecutTaskNum(taskIfoDO);
	}

	@Override
	public int findProjectExecutPeriod(Integer projectID) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findProjectExecutPeriod(projectID);
	}

	@Override
	public List<TaskInfoDO> findDefultUserTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findDefultUserTaskNum(taskIfoDO);
	}

	@Override
	public List<TaskInfoDO> findUserTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findUserTaskNum(taskIfoDO);
	}

	@Override
	public int findDefultAllAwaitTaskNum() {
		// TODO Auto-generated method stub
		return taskInfoMapper.findDefultAllAwaitTaskNum();
	}

	@Override
	public int findDefultAllExecutedTaskNum() {
		// TODO Auto-generated method stub
		return taskInfoMapper.findDefultAllExecutedTaskNum();
	}

	@Override
	public int findDefultAllExecutingTaskNum() {
		// TODO Auto-generated method stub
		return taskInfoMapper.findDefultAllExecutingTaskNum();
	}

	@Override
	public int findDefultAllProjectExecutTaskNum() {
		// TODO Auto-generated method stub
		return taskInfoMapper.findDefultAllProjectExecutTaskNum();
	}

	@Override
	public List<TaskInfoDO> findDefultAllUserTaskNum() {
		// TODO Auto-generated method stub
		return taskInfoMapper.findDefultAllUserTaskNum();
	}

	@Override
	public int findAllAwaitTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findAllAwaitTaskNum(taskIfoDO);
	}

	@Override
	public int findAllExecutedTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findAllExecutedTaskNum(taskIfoDO);
	}

	@Override
	public int findAllExecutingTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findAllExecutingTaskNum(taskIfoDO);
	}

	@Override
	public int findAllProjectExecutTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findAllProjectExecutTaskNum(taskIfoDO);
	}

	@Override
	public List<TaskInfoDO> findAllUserTaskNum(TaskInfoDO taskIfoDO) {
		// TODO Auto-generated method stub
		return taskInfoMapper.findAllUserTaskNum(taskIfoDO);
	}

	
	

	
}
