package com.example.model;

import com.baomidou.mybatisplus.annotation.TableName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import java.util.Date;

@TableName(value = "jimu_report")
public class ReportModel {
    private String id;
    //    编码
    private String code;
    //    名称
    private String name;
    //    说明
    private String note;
    //    状态
    private String status;
    //    类型
    private String type;
    //    json字符串
    private String jsonStr;
    //    请求地址
    private String apiUrl;
    //    缩略图
    private String thumb;
    //    创建人
    private String createBy;
    //    创建时间
    private Date createTime;
    //    修改人
    private String updateBy;
    //    修改时间
    private Date updateTime;
    //    删除标识0-正常,1-已删除
    private Boolean delFlag;
    //    请求方法0-get,1-post
    private String apiMethod;
    //    请求编码
    private String apiCode;
    //    是否是模板 0-是,1-不是
    private Boolean template;
    //    浏览次数
    private Long viewCount;
    //    css增强
    private String cssStr;
    //    js增强
    private String jsStr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getJsonStr() {
        return jsonStr;
    }

    public void setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public String getApiMethod() {
        return apiMethod;
    }

    public void setApiMethod(String apiMethod) {
        this.apiMethod = apiMethod;
    }

    public String getApiCode() {
        return apiCode;
    }

    public void setApiCode(String apiCode) {
        this.apiCode = apiCode;
    }

    public Boolean getTemplate() {
        return template;
    }

    public void setTemplate(Boolean template) {
        this.template = template;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    public String getCssStr() {
        return cssStr;
    }

    public void setCssStr(String cssStr) {
        this.cssStr = cssStr;
    }

    public String getJsStr() {
        return jsStr;
    }

    public void setJsStr(String jsStr) {
        this.jsStr = jsStr;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("code", code)
                .append("name", name)
                .append("note", note)
                .append("type", type)
                .append("jsonStr", jsonStr)
                .append("apiUrl", apiUrl)
                .append("thumb", thumb)
                .append("createBy", createBy)
                .append("createTime", createTime)
                .append("updateBy", updateBy)
                .append("updateTime", updateTime)
                .append("delFlag", delFlag)
                .append("apiMethod", apiMethod)
                .append("apiCode", apiCode)
                .append("template", template)
                .append("viewCount", viewCount)
                .append("cssStr", cssStr)
                .append("jsStr", jsStr)
                .toString();
    }
}
