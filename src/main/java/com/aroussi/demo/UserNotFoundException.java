package com.aroussi.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

import java.net.URI;
import java.time.Instant;

public class UserNotFoundException extends ErrorResponseException {

    public UserNotFoundException(Long userId, String path) {
        super(HttpStatus.NOT_FOUND, problemDetailFrom("User with id " + userId + " not found", path), null);
    }

    private static ProblemDetail problemDetailFrom(String message, String path) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, message);
        problemDetail.setType(URI.create("http://localhost:8080/errors/not-found"));
        problemDetail.setTitle("User not found");
        problemDetail.setInstance(URI.create(path));
        problemDetail.setProperty("timestamp", Instant.now()); // additional data
        return problemDetail;
    }
}