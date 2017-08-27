/**
 * xiaolong.mxl @copyRight 2016-2017
 */
package com.cqu.edu.ebmis.service;

import java.util.HashMap;
import java.util.List;

import com.cqu.edu.ebmis.domain.CategoryDO;
import com.cqu.edu.ebmis.domain.CategoryManagerDO;
import com.cqu.edu.ebmis.domain.ProjectDO;
import com.cqu.edu.ebmis.service.page.Page;

/**
 * 类型树
 * 
 * @author mxl
 */
public interface CategoryManagerService {
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
	 * 分页新字段查询
	 * 
	 * @param size
	 * @param offset
	 * @return
	 */
	Page<CategoryManagerDO> findNewKeyWordByPage(Page<CategoryManagerDO> page,String word);
	/**
	 * 获取树的所有二级数据
	 * @param categoryManager
	 */
	List<CategoryManagerDO> allLevel2Date();
	/**
	 * 关联关键词
	 * @param categoryManager
	 */
	void editLinkNewKeyWord(CategoryManagerDO categoryManager);
	/**
	 * 删除新关键词
	 * @param categoryManager
	 */
	void delNewKeyWord(String categoryName);
}
