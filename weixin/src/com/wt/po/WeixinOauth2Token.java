package com.wt.po;
/**
 * @Description:
 * @author wt
 * @date 2018年6月11日
 */
public class WeixinOauth2Token {
	//网页授权接口调用凭证
	private String accessToken;
	//凭证有效时长
	private int expiresIn;
	//用于刷洗凭证
	private	String refreshToken;
	//用户标识
	private String openId;
	//用户授权作用域
	private String scope;
	
	public WeixinOauth2Token() {
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}
	
}
