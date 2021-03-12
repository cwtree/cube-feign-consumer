package com.cube.pojo.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * 
 * @author phoenix
 * @date 2021年3月10日
 */
@Getter
@Setter
@ToString
@Builder
@ApiModel("模板邮件内容的参数实体")
public class MailTemplateDTO {

	/**
	 * 模板邮件业务名称
	 */
	@ApiModelProperty("模板邮件业务名称")
	@NotNull(message = "模板邮件业务名称信息不能为空", groups = { MailTemplate.class })
	@Length(min = 1, max = 50, message = "模板邮件业务名称参数有误", groups = { MailTemplate.class })
	private String bizName;

	/**
	 * 模板邮件业务描述
	 */
	@ApiModelProperty("模板邮件业务描述详情")
	@NotNull(message = "模板邮件业务描述信息不能为空", groups = { MailTemplate.class })
	@Length(min = 1, max = 50, message = "模板邮件业务描述参数有误", groups = { MailTemplate.class })
	private String bizDesc;

}
