package com.grokonez.jwtauthentication.message.response;

import com.grokonez.jwtauthentication.constants.Constants;

public class JwtResponse {
    private String token;
    private String type = Constants.TOKENTYPE;
    private Integer expires_in;
    private String issued;

    public JwtResponse(String accessToken,Integer expiresIn,String issuedOn) {
        this.token = accessToken;
        this.expires_in = expiresIn;
        this.issued = issuedOn;
    }

	public String getToken() {
		return token;
	}

	public String getType() {
		return type;
	}

	public Integer getExpires_in() {
		return expires_in;
	}

	public String getIssued() {
		return issued;
	}

}