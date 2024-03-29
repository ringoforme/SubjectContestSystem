package com.yjq.programmer.controller;

import com.yjq.programmer.dto.AnnounceDTO;
import com.yjq.programmer.dto.PageDTO;
import com.yjq.programmer.dto.ResponseDTO;
import com.yjq.programmer.service.IAnnounceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yue
 * @create 2023-04-27 10:38
 */
@RestController //这是一个控制器类，用于处理http请求
@RequestMapping("/announce") //基础url路径
public class AnnounceController {


    @Resource
    private IAnnounceService announceService;


    /**
     * 分页获取公告数据
     * @param pageDTO
     * @return
     */
    @PostMapping("/list")
    public ResponseDTO<PageDTO<AnnounceDTO>> getAnnounceList(@RequestBody PageDTO<AnnounceDTO> pageDTO){
        return announceService.getAnnounceList(pageDTO);
    }

    /**
     * 保存公告信息
     * @param announceDTO
     * @return
     */
    @PostMapping("/save")
    public ResponseDTO<Boolean> saveAnnounce(@RequestBody AnnounceDTO announceDTO){
        return announceService.saveAnnounce(announceDTO);
    }

    /**
     * 删除公告信息
     * @param announceDTO
     * @return
     */
    @PostMapping("/delete")
    public ResponseDTO<Boolean> deleteAnnounce(@RequestBody AnnounceDTO announceDTO){
        return announceService.deleteAnnounce(announceDTO);
    }

}
