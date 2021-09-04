package cn.zhf.service;

import cn.zhf.dao.StandardMapper;
import cn.zhf.entity.Standard;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class StandardServiceImpl implements StandardService {

    @Autowired
    private StandardMapper standardMapper;

    @Override
    public PageInfo<Standard> queryAllByPage(Standard standard, Integer start, Integer pageSize) {
        PageHelper.startPage(start,pageSize);
        List<Standard> list = standardMapper.queryAllByPage(standard);
        PageInfo<Standard> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Integer save(Standard standard) {
        return standardMapper.save(standard);
    }

    @Override
    public Standard queryById(Integer id) {
        return standardMapper.queryById(id);
    }

    @Override
    public Integer update(Standard standard) {
        return standardMapper.update(standard);
    }

    @Override
    public Integer delete(Integer id) {
        return standardMapper.delete(id);
    }
}
