package com.sms.Controller;

import com.sms.Payload.SmsRequest;
import com.sms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SmsController {

    @Autowired
    private SmsService smsService;

    @PostMapping("/sendsms")
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        smsService.sendSms(smsRequest.getTo(), smsRequest.getMessage());
    }
}
