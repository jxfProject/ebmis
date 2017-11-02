/**
 * xiaolong.mxl @copyRight 2016-2017
 */
package com.cqu.edu.ebmis.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cqu.edu.ebmis.domain.CategoryManagerDO;

public interface CategoryManagerRepository {
	/**
	 * 添加类型节点
	 * @param categoryManager
	 */
	void save(CategoryManagerDO categoryManager);
	/**
	 * 添加新关键词
	 * @param categoryManager
	 */
	void saveNewKeyWord(CategoryManagerDO categoryManager);
	/**
	 * 修改类型节点
	 * @param categoryManager
	 */
	void update(CategoryManagerDO categoryManager);
	/**
	 * 修改新关键词
	 * @param categoryManager
	 */
	void updateNewKeyWord(HashMap map);
	/**
	 * 删除类型节点
	 * @param categoryManager
	 */
	void del(int categoryId);
	/**
	 * 根据categoryId查询CategoryManagerDO
	 * @param categoryManager
	 */
	CategoryManagerDO getById(int categoryId);
	/**
	 * 查询子级集合
	 * @param parentId
	 * @return
	 */
	List<CategoryManagerDO> getByParentId(int parentId);
	/**
	 * 修改父节点
	 * @param categoryManager
	 */
	void updateById(CategoryManagerDO categoryManager);
	/**
	 * 关联关键词
	 * @param categoryManager
	 */
	void editLinkNewKeyWord(CategoryManagerDO categoryManager);
	/**
	 *  将树转成表的清空表操作
	 */
	void transformTable();
	/**
	 * 将树转成表的数据插入操作
	 */
	void transformTableDate();
	/**
	 * 备份表的清空表操作
	 */
	void copyTruncateTable();
	/**
	 * 备份表的数据插入操作
	 */
	void copyTableDate();
	/**
	 * 还原表的数据插入操作
	 */
	void restoreTableDate();
	/**
	 * 查询新关键词
	 * @param parentId
	 * @return
	 */
	List<CategoryManagerDO> getNewKeyWordDate(int size,int offset,String word);
	/**
	 * 查询新关键词的条数
	 * @param parentId
	 * @return
	 */
	int getNewKeyWordNum(int size,int offset,String word);
	/**
	 * 获取树的所有二级数据
	 * @param categoryManager
	 */
	List<CategoryManagerDO> allLevel2Date();
	/**
	 * 获取树的所有三级数据
	 * @param categoryManager
	 */
	List<CategoryManagerDO> allLevel3Date();
	/**
	 * 删除新关键词
	 * @param categoryManager
	 */
	void delNewKeyWord(int categoryId);
	/**
	 * 查找第二级
	 * @param categoryManager
	 */
	CategoryManagerDO level3findId(Map map);
	/**
	 * 获取树的所有零级数据
	 * @param categoryManager
	 */
	List<CategoryManagerDO> allLevel0Date();
	/**
	 * 所有的新关键词
	 * @param categoryManager
	 */
	List<CategoryManagerDO> getAllNewKeyWordDate();
	/**
	 * 类型树上模糊查询关键词
	 * 
	 */
	List<CategoryManagerDO> searchAllLevel3Date(String searchWord);
}
