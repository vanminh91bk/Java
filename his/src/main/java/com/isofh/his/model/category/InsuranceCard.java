package com.isofh.his.model.category;

import com.isofh.his.model.base.BaseCategoryModel;
import org.hibernate.annotations.Where;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "his_insurance_card", uniqueConstraints={@UniqueConstraint(columnNames = {"value", "deleted"})})
@Where(clause = "deleted=0")
public class InsuranceCard extends BaseCategoryModel {
    @Id
    @GeneratedValue(generator = "insurance_card_generator")
    @SequenceGenerator(
            name = "insurance_card_generator",
            sequenceName = "insurance_card_sq",
            initialValue = 1000000
    )
    private Long id;

    @Column(name = "percent")
    @Audited
    private int percent;

    @Column(name = "job_id")
    @Audited
    private Long jobId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id", insertable = false, updatable = false)
    private Job job;

    @Column(name = "description")
    @Audited
    private String description;

    @Column(name = "check_ignore")
    @Audited
    private boolean checkIgnore;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCheckIgnore() {
        return checkIgnore;
    }

    public void setCheckIgnore(boolean checkIgnore) {
        this.checkIgnore = checkIgnore;
    }
}
