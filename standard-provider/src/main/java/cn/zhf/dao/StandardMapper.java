package cn.zhf.dao;

import cn.zhf.entity.Standard;

import java.util.List;

public interface StandardMapper {
    //根据条件分页查询
    List<Standard> queryAllByPage(Standard standard);
    //添加
    Integer save(Standard standard);
    //根据id展示信息
    Standard queryById(Integer id);
    //修改
    Integer update(Standard standard);
    //删除
    Integer delete(Integer id);



}
