package com.deng.commons.common;

/**
 * 树结构实体接口
 */
public interface ITreeObject {
	/**
	 * id
	 */
	 String getId();
	/**
	 *
	 * 父id
	 */
	 String getParentId();
	/**
	 *
	 * 名称
	 */
	 String getName();

	/**
	 *
	 * 结点类型
	 */
	 String getNodeType();
}
