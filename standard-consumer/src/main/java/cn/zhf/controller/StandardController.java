package cn.zhf.controller;

import cn.zhf.entity.Standard;
import cn.zhf.service.StandardService;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("standard")
public class StandardController {

    @Reference
    private StandardService standardService;

    @GetMapping("queryAllByPage")
    public PageInfo<Standard> queryAllByPage(Standard standard,Integer start,Integer pageSize){
        if(start == null){
            start = 1;
        }
        if(pageSize == null){
            pageSize = 3;
        }
        return standardService.queryAllByPage(standard,start,pageSize);
    }

    @PostMapping("save")
    public Integer save(Standard standard){
        return standardService.save(standard);
    }

    @GetMapping("queryById")
    public Standard queryById(Integer id){
        return standardService.queryById(id);
    }

    @PostMapping("update")
    public Integer update(Standard standard){
        return standardService.update(standard);
    }

    @PostMapping("delete")
    public Integer delete(Integer id){
        return standardService.delete(id);
    }

}
