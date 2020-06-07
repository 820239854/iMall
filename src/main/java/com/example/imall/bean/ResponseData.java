package com.example.imall.bean;

import lombok.Data;

@Data
public class ResponseData<T> {
    int errno;
    String errmsg;
    T data;
}
