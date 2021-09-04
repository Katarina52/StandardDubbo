package cn.zhf.service;

import cn.zhf.entity.Standard;
import com.github.pagehelper.PageInfo;

public interface StandardService {

    PageInfo<Standard> queryAllByPage(Standard standard, Integer start, Integer pageSize);

    Integer save(Standard standard);

    Standard queryById(Integer id);

    Integer update(Standard standard);

    Integer delete(Integer id);
}
