/**
 * xiaolong.mxl @copyRight 2016-2017
 */
package com.cqu.edu.ebmis.service;

import java.util.Date;
import java.util.List;

import com.cqu.edu.ebmis.domain.ProductBaseInfoDO;
import com.cqu.edu.ebmis.domain.ThreeClassificationDo;
import com.cqu.edu.ebmis.service.page.Page;

/**
 * 产品基本信息服务
 * 
 * @author mxl
 * @version $ ProductBaseInfoService.java v1.0, 2017年5月5日 下午11:19:01 mxl Exp $
 */
public interface ProductBaseInfoService {
	
	/**
	 * 删除
	 * 
	 * @param productInnerId
	 *            产品ID
	 * @return
	 */
	int delete(long productInnerId);
	
	/**
	 * 按照产品ID查找
	 * 
	 * @param productInnerId
	 *            产品ID
	 * @return
	 */
	ProductBaseInfoDO selectByInnerId(long productInnerId);
	
	/**
	 * 修改负面清单商品
	 * @param product
	 * @return
	 */
	void isNotUpdateProduct(ProductBaseInfoDO product);
	
	/**
	 * 更新
	 * 
	 * @param productInnerId
	 *            产品ID
	 * @param checked
	 *            检测状态 <li>0--未检测,1--已检测</li>
	 * @param isValid
	 *            校验属性<li>0--非农产品,1--农产品</li>
	 * @return
	 */
	int update(long productInnerId, int checked, int isValid,String userName,Date recheckPersonTime);
	/**
	 * 产品基本数据复核 修改关键词
	 * @param product
	 * @return
	 */
	void updateKeyWord(ProductBaseInfoDO product);
	
	/**
	 * 查找
	 * 
	 * @return
	 */
	List<ProductBaseInfoDO> findAllProduct();
	
		
	/**
	 * 分页查询
	 * 
	 * @param size
	 * @param offset
	 * @return
	 */
	Page<ProductBaseInfoDO> findByPage(Page<ProductBaseInfoDO> page);
	/**
	 * 复核人统计数量分页查询
	 * 
	 * @param size
	 * @param offset
	 * @return
	 */
	Page<ProductBaseInfoDO> findRecheckPersonNumByPage(Page<ProductBaseInfoDO> page);
	/**
	 * 初始分页模糊查询
	 * 
	 * @param size
	 * @param offset
	 * @return
	 */
	Page<ProductBaseInfoDO> findBySearchPage(String word,int checkedNum,Page<ProductBaseInfoDO> page);
	
	/**
	 * 分页查找复核的商品
	 * @param page
	 * @return
	 */
	Page<ProductBaseInfoDO> findCheckedByPage(int checked,Page<ProductBaseInfoDO> page);
	/**
	 * 层级分页查找全部商品
	 * @param size
	 * @param offset
	 * @return
	 */
	Page<ProductBaseInfoDO> getLevelList(String platform,int checkedNum,String level0,
			String level1, String level2, String level3,Page<ProductBaseInfoDO> page);
	/**
	 * 层级分页搜索查找商品
	 * @param size
	 * @param offset
	 * @return
	 */
	Page<ProductBaseInfoDO> getLevelSearchProduct(String word,String platform,int checkedNum,String level0,
			String level1, String level2, String level3,Page<ProductBaseInfoDO> page);
}
