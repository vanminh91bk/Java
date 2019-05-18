package com.isofh.his.controller.category;

import com.isofh.his.controller.base.BaseController;
import com.isofh.his.dto.base.ResponseMsg;
import com.isofh.his.dto.category.UOMDto;
import com.isofh.his.service.category.UOMService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

@RestController
public class UOMController extends BaseController {

    private final static Logger logger = LoggerFactory.getLogger(UOMController.class);

    private final String DATA_FIELD = "uom";

    @Autowired
    private UOMService service;

    @GetMapping("/uoms/{id}")
    public ResponseEntity<ResponseMsg> getById(@PathVariable Long id) {
        return response(DATA_FIELD, service.findDtoById(id));
    }

    @PostMapping("/uoms")
    public ResponseEntity<ResponseMsg> create(@Valid @RequestBody UOMDto dto) {
        return response(DATA_FIELD, service.createDto(dto));
    }

    @PutMapping("/uoms")
    public ResponseEntity<ResponseMsg> update(@Valid @RequestBody UOMDto dto) {
        return response(DATA_FIELD, service.updateDto(dto));
    }

    @PostMapping("/uoms/excel")
    public ResponseEntity<InputStreamResource> importExcel(@RequestParam("file") MultipartFile file) {
        return response(service.importExcel(file, 1, 1));
    }
}