package org.alex.platform.controller;

import org.alex.platform.common.Result;
import org.alex.platform.pojo.InterfaceCaseExecuteLogListDTO;
import org.alex.platform.service.InterfaceCaseExecuteLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterfaceCaseExecuteLogController {
    @Autowired
    InterfaceCaseExecuteLogService executeLogService;

    /**
     * 获取接口执行日志详情
     *
     * @param executeId
     * @return
     */
    @GetMapping("/interface/log/{executeId}")
    public Result findInterfaceCaseExecuteLog(@PathVariable Integer executeId) {
        return Result.success(executeLogService.findExecute(executeId));
    }

    /**
     * 获取接口执行日志列表
     *
     * @param executeLogListDTO
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/interface/log/list")
    public Result findInterfaceCaseExecuteLogList(InterfaceCaseExecuteLogListDTO executeLogListDTO, Integer pageNum,
                                                  Integer pageSize) {
        Integer num = pageNum == null ? 1 : pageNum;
        Integer size = pageSize == null ? 10 : pageSize;
        return Result.success(executeLogService.findExecuteList(executeLogListDTO, num, size));
    }
}