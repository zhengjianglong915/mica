package com.along.mica.dal.dao;

import com.along.mica.dal.dataobject.JobDO;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author zhengjianglong
 * @since 2019-06-16
 */
@MapperScan
public interface JobDAO {

    /**
     * insert data
     * @param jobDO
     * @return
     */
    int insert(JobDO jobDO);

    /**
     * query by id
     * @param id
     * @return
     */
    JobDO queryById(@Param("id") int id);
}
