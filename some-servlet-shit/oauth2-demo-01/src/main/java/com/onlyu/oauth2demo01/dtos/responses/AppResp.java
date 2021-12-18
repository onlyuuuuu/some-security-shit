package com.onlyu.oauth2demo01.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "appResp")
@XmlAccessorType(XmlAccessType.FIELD)
public class AppResp {

    public String text;
    public String desc;

}
