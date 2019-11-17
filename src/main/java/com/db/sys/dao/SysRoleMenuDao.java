package com.db.sys.dao;

import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuDao {

    int deleteObjectsByMenuId(@Param("id") Integer id);

}
