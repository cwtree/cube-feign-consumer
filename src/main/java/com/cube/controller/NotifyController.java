package com.cube.controller;

import javax.annotation.Resource;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cube.pojo.MyResp;
import com.cube.pojo.dto.MailSendDTO;
import com.cube.pojo.dto.MailTemplate;
import com.cube.pojo.dto.MailText;
import com.cube.pojo.dto.SmsSendDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年3月10日
 */
@RestController
@Slf4j
@RequestMapping("/notify")
@Api("消息通知")
public class NotifyController {

	@Resource
	private NotifyRpc notifyRpc;

	/**
	 * 发送文本邮件
	 * 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param dto
	 * @return
	 */
	@ApiOperation("发送文本邮件")
	@PostMapping("/mail/sendText")
	@ResponseBody
	public MyResp sendText(@RequestBody @Validated(MailText.class) MailSendDTO dto) {
		if (log.isInfoEnabled()) {
			log.info("发送文本邮件 feign 调用");
		}
		return notifyRpc.sendText(dto);
	}

	/**
	 * 发送文本邮件
	 * 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param dto
	 * @return
	 */
	@ApiOperation("发送模板邮件")
	@PostMapping("/mail/sendTemplate")
	@ResponseBody
	public MyResp sendTemplate(@RequestBody @Validated(MailTemplate.class) MailSendDTO dto) {
		if (log.isInfoEnabled()) {
			log.info("发送模板邮件 feign 调用");
		}
		return notifyRpc.sendTemplate(dto);
	}

	@ApiOperation("短信发送")
	@PostMapping("/sms/send")
	@ResponseBody
	public MyResp sendSms(@RequestBody @Validated SmsSendDTO dto) {
		if (log.isInfoEnabled()) {
			log.info("发送短信 feign 调用");
		}
		return notifyRpc.sendSms(dto);
	}

}
