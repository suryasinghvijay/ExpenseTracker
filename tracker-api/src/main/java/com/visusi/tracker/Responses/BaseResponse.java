package com.visusi.tracker.Responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse {
    public int statusCode;
    public boolean success;
    public String id;

    public BaseResponse setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public BaseResponse setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public BaseResponse setId(String id) {
        this.id = id;
        return this;
    }
}
