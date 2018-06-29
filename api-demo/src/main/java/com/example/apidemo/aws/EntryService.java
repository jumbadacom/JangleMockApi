package com.example.apidemo.aws;

import org.springframework.http.ResponseEntity;

import com.example.apidemo.aws.request.MailStringModel;
import com.example.apidemo.aws.request.PhoneStringModel;
import com.example.apidemo.aws.request.TokenRequestModel;
import com.example.apidemo.aws.response.ResultVM;
import com.example.apidemo.aws.response.TokenResponseModel;

public interface EntryService {

	public ResponseEntity<TokenResponseModel> authenticate(TokenRequestModel model);

	public ResponseEntity<ResultVM> checkEmailInUser(MailStringModel model);

	public ResponseEntity<ResultVM> checkPhoneInUser(PhoneStringModel model);

}
