package com.db.sys.dao;
import com.db.common.vo.Node;
import com.db.sys.entity.SysDept;

import java.util.List;
import java.util.Map;
public interface SysDeptDao {

	int updateObject(SysDept entity);

	int insertObject(SysDept entity);

	List<Node> findZTreeNodes();

	List<Map<String,Object>> findObjects();

	int getChildCount(Integer id);

	int deleteObject(Integer id);

}
