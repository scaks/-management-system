package com.db.sys.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SysMenuDao {

    List<Map<String,Object>> findObjects();

    int deleteObject(@Param("id") Integer id);

    int getChildCount(@Param("id") Integer id);
}
