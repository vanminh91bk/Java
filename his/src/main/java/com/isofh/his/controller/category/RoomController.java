package com.isofh.his.controller.category;

import com.isofh.his.controller.base.BaseCategoryController;
import com.isofh.his.dto.category.RoomDto;
import com.isofh.his.service.category.RoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rooms")
public class RoomController extends BaseCategoryController<RoomDto, RoomService> {

    private final static Logger logger = LoggerFactory.getLogger(RoomController.class);

    @Autowired
    private RoomService service;

    @Override
    protected RoomService getService() {
        return this.service;
    }

    @Override
    protected Logger getLogger() {
        return this.logger;
    }
}
