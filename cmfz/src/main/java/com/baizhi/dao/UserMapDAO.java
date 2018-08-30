package com.baizhi.dao;

import com.baizhi.entity.UserMap;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapDAO {
    List<UserMap> queryMan();
    List<UserMap> queryWomen();
}
