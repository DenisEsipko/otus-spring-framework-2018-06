package ru.otus.spring.sokolovsky.hw13.controllers;

import lombok.Data;
import lombok.Getter;

import java.util.Map;

@Data
public class ActionResult {

    @Getter
    private final boolean success;

    @Getter
    private final String message;

    @Getter
    private Map<String, Object> data;

    private ActionResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    static ActionResult ok(String message) {
        return new ActionResult(true, message);
    }

    static ActionResult ok() {
        return ok("");
    }

    static ActionResult error(String message) {
        return new ActionResult(false, message);
    }

    public ActionResult data(Map<String, Object> value) {
        this.data = value;
        return this;
    }
}