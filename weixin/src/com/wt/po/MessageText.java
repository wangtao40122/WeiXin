package com.wt.po;
/**
 * @Description:
 * @author wt
 * @date 2018年5月24日 下午8:47:56
 */
public class MessageText {
	private String ToUserName;			//开发者微信号
	private String FromUserName;		//发送方帐号（一个OpenID）
	private String CreateTime;			//消息创建时间 （整型）
	private String MsgType;				//text
	private String Content;				//文本消息内容
	private String MsgId;				//消息id，64位整型
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getMsgId() {
		return MsgId;
	}
	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
	
}	