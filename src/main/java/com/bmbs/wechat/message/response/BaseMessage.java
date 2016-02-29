package com.bmbs.wechat.message.response;

public class BaseMessage {
	
	private String ToUserName;
	private String FromUserName;
	private Long CreateTime;
	private String MsgType;
	private int FuncFlg;
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
	public Long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Long createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public int getFuncFlg() {
		return FuncFlg;
	}
	public void setFuncFlg(int funcFlg) {
		FuncFlg = funcFlg;
	}
}
