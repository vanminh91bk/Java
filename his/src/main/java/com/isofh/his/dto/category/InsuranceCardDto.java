package com.isofh.his.dto.category;

import com.isofh.his.dto.base.BaseCategoryDto;

public class InsuranceCardDto extends BaseCategoryDto {

    public InsuranceCardDto() {
    }

    private int percent;

    private Long jobId;

    private JobDto job;

    private String description;

    private boolean checkIgnore;

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

    public JobDto getJob() {
        return job;
    }

    public void setJob(JobDto job) {
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
