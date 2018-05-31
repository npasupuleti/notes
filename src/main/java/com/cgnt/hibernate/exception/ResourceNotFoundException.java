package com.cgnt.hibernate.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.xml.ws.ResponseWrapper;

@ResponseStatus(value =HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private String resourceName;

    private String fieldName;

    private Object feildValue;

    public ResourceNotFoundException(String resourceName, String fieldName, Object feildValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, feildValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.feildValue = feildValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Object getFeildValue() {
        return feildValue;
    }

    public void setFeildValue(Object feildValue) {
        this.feildValue = feildValue;
    }
}
