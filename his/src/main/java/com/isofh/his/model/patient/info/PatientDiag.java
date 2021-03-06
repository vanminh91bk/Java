package com.isofh.his.model.patient.info;

import com.isofh.his.model.base.patient.BasePatientModel;
import com.isofh.his.model.patient.service.PatientServiceCheckUp;
import org.hibernate.annotations.Where;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "his_patient_diag")
@Where(clause = "deleted=0")
public class PatientDiag extends BasePatientModel {

    @Id
    @GeneratedValue(generator = "patient_diag_generator")
    @SequenceGenerator(
            name = "patient_diag_generator",
            sequenceName = "patient_diag_sq",
            initialValue = 1000000
    )
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "patientDiag")
    private PatientHistory patientHistory;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "patientDiag")
    private PatientServiceCheckUp patientServiceCheckUp;

    @Column(name = "first_diagnostic")
    @Audited
    private String firstDiagnostic;

    @Column(name = "diagnostic")
    @Audited
    private String diagnostic;

    // ICD, separate ID by ','
    @Column(name = "disease_diagnostic")
    @Audited
    private String diseaseDiagnostic;

    @Column(name = "other_disease_diagnostic")
    @Audited
    private String otherDiseaseDiagnostic;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public PatientHistory getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(PatientHistory patientHistory) {
        this.patientHistory = patientHistory;
    }

    public PatientServiceCheckUp getPatientServiceCheckUp() {
        return patientServiceCheckUp;
    }

    public void setPatientServiceCheckUp(PatientServiceCheckUp patientServiceCheckUp) {
        this.patientServiceCheckUp = patientServiceCheckUp;
    }

    public String getFirstDiagnostic() {
        return firstDiagnostic;
    }

    public void setFirstDiagnostic(String firstDiagnostic) {
        this.firstDiagnostic = firstDiagnostic;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getDiseaseDiagnostic() {
        return diseaseDiagnostic;
    }

    public void setDiseaseDiagnostic(String diseaseDiagnostic) {
        this.diseaseDiagnostic = diseaseDiagnostic;
    }

    public String getOtherDiseaseDiagnostic() {
        return otherDiseaseDiagnostic;
    }

    public void setOtherDiseaseDiagnostic(String otherDiseaseDiagnostic) {
        this.otherDiseaseDiagnostic = otherDiseaseDiagnostic;
    }
}