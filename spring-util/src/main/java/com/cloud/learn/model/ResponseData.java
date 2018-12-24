package com.cloud.learn.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * author zhanglikun
 * Title:数据传输基本封装类
 * Description:
 * date 2018/7/25
 */
public class ResponseData {

    private String msgCode;
    private String msg;
    private List<?> resp;
    private boolean success;
    private Integer total;

    public ResponseData() {
        this.success = true;
        this.total = Integer.valueOf(0);
    }

    public ResponseData(boolean success) {
        this.success = true;
        this.total = Integer.valueOf(0);
        this.setSuccess(success);
    }

    public ResponseData(List<?> list) {
        this(true);
        this.setResp(list);
        this.setTotal(Integer.valueOf(list.size()));
    }

    public ResponseData(boolean success, String msgCode) {
        this.success = true;
        this.total = Integer.valueOf(0);
        this.setSuccess(success);
        this.setMsgCode(msgCode);
    }

    public ResponseData(Map<String, ?> map) {
        this(true);
        List list = new ArrayList();
        list.add(map);
        this.setResp(list);
        this.setTotal(Integer.valueOf(1));
    }

    public ResponseData(String msgCode, String msg, boolean success) {
        this.msgCode = msgCode;
        this.msg = msg;
        this.success = success;
        this.total = 0;

    }

    public ResponseData(String msgCode, String msg, List<?> resp, boolean success, Integer total) {
        this.msgCode = msgCode;
        this.msg = msg;
        this.resp = resp;
        this.success = success;
        this.setTotal(total);
    }

    public ResponseData(String msgCode, String msg, List<?> resp, boolean success) {
        this.msgCode = msgCode;
        this.msg = msg;
        this.resp = resp;
        this.success = success;
        if (null != resp && resp.size() > 0) {
            this.total = resp.size();
        } else {
            this.total = 0;
        }
    }

    public String getMsgCode() {
        return this.msgCode;
    }

    public Integer getTotal() {
        return this.total;
    }

    public String getMsg() {
        return this.msg;
    }

    public List<?> getResp() {
        return this.resp;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setResp(List<?> resp) {
        this.resp = resp;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
