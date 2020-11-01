package com.bestbuy.diaspora.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ClusterNotFoundException extends RuntimeException {
	public ClusterNotFoundException(String message) {
		super(message);
	}
}
