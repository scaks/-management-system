package com.db.sys.service;

import com.db.common.vo.Node;
import com.db.sys.entity.SysMenu;

import java.util.List;
import java.util.Map;

public interface SysMenuService {

    List<Map<String,Object>> findObjects();

    int deleteObject(Integer id);

    List<Node> findZtreeMenuNodes();

    int insertObject(SysMenu sysMenu);

    int updateObject(SysMenu sysMenu);
}
