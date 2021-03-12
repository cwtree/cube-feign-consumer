package com.cube.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import com.cube.pojo.MyResp;
import com.cube.pojo.dto.MailSendDTO;
import com.cube.pojo.dto.SmsSendDTO;

/**
 * 
 * 
 * @author phoenix
 * @date 2021-3-12
 */
@FeignClient(name = "cube-notify", url = "${cube.boot.rpc.notify.url}")
@Component
public interface NotifyRpc {

	/**
	 * 远程文本邮件发送
	 * 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param dto
	 * @return
	 */
	@PostMapping("/mail/sendText")
	public MyResp sendText(MailSendDTO dto);

	/**
	 * 远程模板邮件发送
	 * 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param dto
	 * @return
	 */
	@PostMapping("/mail/sendTemplate")
	public MyResp sendTemplate(MailSendDTO dto);

	/**
	 * 远程短信发送
	 * 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param dto
	 * @return
	 */
	@PostMapping("/sms/send")
	public MyResp sendSms(SmsSendDTO dto);

}
