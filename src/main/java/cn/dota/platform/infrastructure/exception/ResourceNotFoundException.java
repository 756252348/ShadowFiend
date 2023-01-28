package cn.dota.platform.infrastructure.exception;

import org.springframework.web.client.RestClientException;

public class ResourceNotFoundException extends RestClientException {
    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}