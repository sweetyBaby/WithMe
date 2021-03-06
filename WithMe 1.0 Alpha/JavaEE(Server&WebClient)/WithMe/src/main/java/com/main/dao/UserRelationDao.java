package com.main.dao;

import java.util.List;

import com.main.entity.UserRelation;

public interface UserRelationDao {
	//���id��ȡ�û�
	public UserRelation getUserRelation(int idA,int idB);
	//����û�
	public void addUserRelation(UserRelation userRelation);
	//ɾ���û�
	public boolean deleteUserRelation(int idA,int idB);
	//�����û�
	public boolean updateUser(UserRelation userRelation);
	//��ȡ�����û�
	@SuppressWarnings("rawtypes")
	public List getAllFriends(int id);
}
