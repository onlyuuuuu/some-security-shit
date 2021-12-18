package com.onlyu.oauth2demo01.dtos.responses;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Data
@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({
        AppResp.class
})
public class Response<T> implements Serializable {

    private String timestamp;
    private int status;

    @XmlAnyElement(lax = true)
    private T data;

}
