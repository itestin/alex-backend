package org.alex.platform.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class PostProcessorLogDO implements Serializable {
    private Integer id;
    private Integer postProcessorId;
    private Integer caseId;
    private Integer caseExecuteLogId;
    private String name;
    private String value;
    private Byte type;
    private String expression;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPostProcessorId() {
        return postProcessorId;
    }

    public void setPostProcessorId(Integer postProcessorId) {
        this.postProcessorId = postProcessorId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getCaseExecuteLogId() {
        return caseExecuteLogId;
    }

    public void setCaseExecuteLogId(Integer caseExecuteLogId) {
        this.caseExecuteLogId = caseExecuteLogId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
