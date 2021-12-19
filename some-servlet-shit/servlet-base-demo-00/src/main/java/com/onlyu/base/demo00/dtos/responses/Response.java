package com.onlyu.base.demo00.dtos.responses;

import com.onlyu.base.demo00.ultilities.DateUtils;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.function.Supplier;

@Data
@Builder
@AllArgsConstructor
@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
@SuppressWarnings({"unused"})
public class Response<T> implements Serializable {

    private String timestamp;
    private int status;

    @XmlAnyElement(lax = true)
    private T data;

    public Response() {
        this.timestamp = DateUtils.now();
        this.status = 0;
        this.data = null;
    }

    public Response(Supplier<? extends T> supplier) {
        this.timestamp = DateUtils.now();
        this.status = 0;
        this.data = supplier.get();
    }

    public Response(int status, Supplier<? extends T> supplier) {
        this.timestamp = DateUtils.now();
        this.status = status;
        this.data = supplier.get();
    }

    public Response(HttpServletResponse response, Supplier<? extends T> supplier) {
        this.timestamp = DateUtils.now();
        this.status = response.getStatus();
        this.data = supplier.get();
    }

    public static Response newInstance() {
        return new Response();
    }

    public static Response newInstance(Supplier supplier) {
        return new Response(supplier);
    }

    public static Response newInstance(int status, Supplier supplier) {
        return new Response(status, supplier);
    }

    public static Response newInstance(HttpServletResponse response, Supplier supplier) {
        return new Response(response, supplier);
    }
}
