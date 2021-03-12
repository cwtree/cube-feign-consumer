package com.cube.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cube.pojo.MyResp;
import com.cube.pojo.dto.MailSendDTO;
import com.cube.pojo.dto.MailTemplate;
import com.cube.pojo.dto.MailText;
import com.cube.pojo.dto.SmsSendDTO;

/**
 * 
 * 
 * @author phoenix
 * @date 2021-3-12
 */
@FeignClient(name = "cube-notify", url = "http://172.30.6.181:9208/cube-feign-provider/notify")
@Component
public interface NotifyRpc {

	/**
	 * 远程文本邮件发送
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param dto
	 * @return
	 */
	@PostMapping("/mail/sendText")
	public MyResp sendText(@RequestBody @Validated(MailText.class) MailSendDTO dto);

	/**
	 * 远程模板邮件发送
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param dto
	 * @return
	 */
	@PostMapping("/mail/sendTemplate")
	public MyResp sendTemplate(@RequestBody @Validated(MailTemplate.class) MailSendDTO dto);

	/**
	 * 远程短信发送
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param dto
	 * @return
	 */
	@PostMapping("/sms/send")
	public MyResp sendSms(@RequestBody @Validated SmsSendDTO dto);

}
