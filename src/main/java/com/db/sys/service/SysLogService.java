package com.db.sys.service;

import com.db.common.vo.PageObject;
import com.db.sys.entity.SysLog;

public interface SysLogService {

    /**
     * 通过此方法实现分页查询操作
     * @param username 基于条件查询时的参数名
     * @param pageCurrent 当前的页码值
     * @return 当前页记录+分页信息
     */
    PageObject<SysLog> findObjects(String username , Integer pageCurrent);

    int deleteObjects(Integer... ids);

}
