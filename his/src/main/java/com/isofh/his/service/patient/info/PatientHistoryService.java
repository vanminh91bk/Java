package com.isofh.his.service.patient.info;

import com.isofh.his.dto.patient.info.PatientHistoryDto;
import com.isofh.his.model.patient.info.PatientHistory;
import com.isofh.his.repository.patient.info.PatientHistoryRepository;
import com.isofh.his.service.base.BaseService;
import com.isofh.his.service.base.IEnum;

import java.util.Date;

public interface PatientHistoryService extends BaseService<PatientHistory, PatientHistoryDto, PatientHistoryRepository> {

    Long create(PatientHistoryDto historyDto);

    Long update(PatientHistoryDto historyDto);

    Long create(PatientHistory history, boolean isCheckPortalInsurance);

    Long update(PatientHistory history, boolean isCheckPortalInsurance);

    PatientHistory findLastByIdNo(String idNo);

    PatientHistory findLastByPatientValue(String patientValue);

    boolean isInsurancePatient(PatientHistory history, Date actDate);

    enum PatientTypeEnum implements IEnum {
        SERVICE(1, "Service"), INSURANCE(2, "Insurance");

        private int value;
        private String name;

        PatientTypeEnum(int value, String name) {
            this.value = value;
            this.name = name;
        }

        @Override
        public int getValue() {
            return value;
        }

        @Override
        public String getName() {
            return name;
        }
    }
}