package com.isofh.his.model.patient;

import com.isofh.his.model.base.patient.BasePatientModel;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "his_patient_type", indexes = {@Index(name = "pt_patient_history_id", columnList = "patient_history_id")})
public class PatientType extends BasePatientModel {

    @Id
    @GeneratedValue(generator = "patient_type_generator")
    @SequenceGenerator(
            name = "patient_type_generator",
            sequenceName = "patient_type_sq",
            initialValue = 1000000
    )
    private Long id;

    @Column(name = "patient_history_id", unique = true)
    @Audited
    private Long patientHistoryId;

    @OneToOne
    @JoinColumn(name = "patient_history_id", insertable = false, updatable = false)
    private PatientHistory patientHistory;

    @Column(name = "patient_type")
    @Audited
    private int patientType;

    @Column(name = "act_date")
    @Audited
    private Timestamp actDate;

    // insurance info
    @Column(name = "patient_insurance_id", unique = true)
    @Audited
    private Long patientInsuranceId;

    @OneToOne
    @JoinColumn(name = "patient_insurance_id", insertable = false, updatable = false)
    private PatientInsurance patientInsurance;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}