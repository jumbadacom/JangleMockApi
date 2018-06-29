package com.example.apidemo.aws;

import org.springframework.http.ResponseEntity;

import com.example.apidemo.aws.request.BasicMailModel;
import com.example.apidemo.aws.request.ManagedUserVM;
import com.example.apidemo.aws.request.BasicPhoneModel;
import com.example.apidemo.aws.request.TokenRequestModel;
import com.example.apidemo.aws.response.JWTToken;
import com.example.apidemo.aws.response.KeyAndShortMessageVM;
import com.example.apidemo.aws.response.ResultVM;
import com.example.apidemo.aws.response.TokenResponseModel;

public interface EntryService {

	public ResponseEntity<TokenResponseModel> authenticate(TokenRequestModel model);

	/*
	 * Response'u No-content oldugu icin sonra duzenlenecek.
	 * 
	 * public ResponseEntity<ResultVM> changePassword(PasswordStringModel model);
	 */

	public ResponseEntity<ResultVM> checkEmailInUser(BasicMailModel model);

	public ResponseEntity<ResultVM> checkPhoneInUser(BasicPhoneModel model);

	/*
	 * Response'u No-content oldugu icin sonra duzenlenecek.
	 * 
	 * public ResponseEntity<ResultVM> requestPasswordReset(PasswordStringModel
	 * model);
	 */

	public ResponseEntity<KeyAndShortMessageVM> requestPasswordResetBySMS(BasicPhoneModel model);

	/*
	 * Response (status : 200 icin) nesnesini "key" parametresi olmadigi icin
	 * gorememistik. Sonra duzenlenecek.
	 * 
	 * public ResponseEntity<KeyAndShortMessageVM>
	 * finishPasswordReset(KeyAndPasswordVM model);
	 */

	public ResponseEntity<ResultVM> isAuthenticated();

	public ResponseEntity<JWTToken> registerAccount(ManagedUserVM model);
}
