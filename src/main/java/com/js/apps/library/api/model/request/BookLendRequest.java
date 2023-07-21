package com.js.apps.library.api.model.request;

import java.util.List;

import lombok.Data;

@Data
public class BookLendRequest {
    private List<String> bookIds;
    private String memberId;
}
