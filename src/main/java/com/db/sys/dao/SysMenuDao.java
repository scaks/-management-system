package com.db.sys.dao;

import com.db.common.vo.Node;
import com.db.sys.entity.SysMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SysMenuDao {

    List<Map<String,Object>> findObjects();

    int deleteObject(@Param("id") Integer id);

    int getChildCount(@Param("id") Integer id);

    List<Node> findZtreeMenuNodes();

    int insertObject(SysMenu sysMenu);

    int updateObject(SysMenu sysMenu);
}
