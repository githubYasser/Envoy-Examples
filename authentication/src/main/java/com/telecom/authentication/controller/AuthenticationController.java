package com.telecom.authentication.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticationController {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);

    @RequestMapping(value = "/cert/service/1", method = RequestMethod.GET)
    public ResponseEntity<String> checkCertificateService1(@RequestHeader HttpHeaders headers) {
       return checkCertificate(headers);
    }

    @RequestMapping(value = "/cert/service/2", method = RequestMethod.GET)
    public ResponseEntity<String> checkCertificateService2(@RequestHeader HttpHeaders headers) {
        return checkCertificate(headers);
    }

    private ResponseEntity<String> checkCertificate(@RequestHeader HttpHeaders headers) {
        log.info("Request Headers output inside AuthenticationController:" + headers);
        log.debug("Request Headers output inside AuthenticationController:" + headers);
        if (headers.containsKey("x-forwarded-client-cert"))
        {
            return new ResponseEntity(HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
    }



}