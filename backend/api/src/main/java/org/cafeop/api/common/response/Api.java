package org.cafeop.api.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Api<T> {
    private Result meta;

    @Valid
    private T body;

    public static <T> Api<T> ok(T data) {
        var api = new Api<T>();
        api.meta = Result.ok();
        api.body = data;
        return api;
    }

}