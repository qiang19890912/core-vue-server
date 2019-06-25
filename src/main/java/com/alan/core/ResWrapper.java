package com.alan.core;

public class ResWrapper<T> {

    public enum StatusCode{

        SUCCESS("成功", "0000"),
        BUSINESS_ERROR("业务错误", "9999");

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        private String name;
        private String code;

        StatusCode(String name,String code){
            this.name = name;
            this.code = code;
        }
    }


    public ResWrapper(String code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResWrapper(String code, String message) {
        this.code = code;
        this.message = message;
    }


    public static <T> ResWrapper Success(T data){
        return new ResWrapper<>(StatusCode.SUCCESS.getCode(),"",data);
    }
    public static ResWrapper Success(){
        return new ResWrapper(StatusCode.SUCCESS.getCode(),"");
    }

    public static <T> ResWrapper BuineseError(String message,T data){
        return new ResWrapper<>(StatusCode.BUSINESS_ERROR.getCode(),message,data);
    }


    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private T data;


}
