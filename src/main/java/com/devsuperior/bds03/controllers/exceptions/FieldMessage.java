package com.devsuperior.bds03.controllers.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
    private String fieldName;
    private String message;


    public FieldMessage() {
    }

    public FieldMessage(String fieldName, String fieldMessage) {
        this.fieldName = fieldName;
        this.message = fieldMessage;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
