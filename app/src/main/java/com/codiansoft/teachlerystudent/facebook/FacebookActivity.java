package com.codiansoft.teachlerystudent.facebook;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


import com.codiansoft.teachlerystudent.R;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.json.JSONException;
import org.json.JSONObject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class FacebookActivity extends AppCompatActivity {

    private static final String EMAIL = "email";
    private static final String USER_POSTS = "user_posts";
    private TextView tvfull_name, tvEmail;
    String email,name;
    private CallbackManager mCallbackManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        mCallbackManager = CallbackManager.Factory.create();

        final LoginButton mLoginButton = findViewById(R.id.login_button);


        tvfull_name         =  findViewById(R.id.full_name);
        tvEmail             =  findViewById(R.id.email);

        mLoginButton.setReadPermissions(Arrays.asList("public_profile","email"));

        // Register a callback to respond to the user
        mLoginButton.registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                setResult(RESULT_OK);
               // finish();
                Log.e("facebook","success");
               // mLoginButton.setVisibility(View.GONE);

                GraphRequest graphRequest   =   GraphRequest.newMeRequest(loginResult.getAccessToken(), new GraphRequest.GraphJSONObjectCallback()
                {
                    @Override
                    public void onCompleted(JSONObject object, GraphResponse response)
                    {
                        Log.d("JSON", ""+response.getJSONObject().toString());

                        try
                        {
                            email       =   object.getString("email");
                            name        =   object.getString("name");

                            tvEmail.setText(email);
                            tvfull_name.setText(name);
                            LoginManager.getInstance().logOut();
                        }
                        catch (JSONException e)
                        {
                            e.printStackTrace();
                        }
                    }
                });

                Bundle parameters = new Bundle();
                parameters.putString("fields", "id,name,first_name,last_name,email");
                graphRequest.setParameters(parameters);
                graphRequest.executeAsync();
            }

            @Override
            public void onCancel() {
                setResult(RESULT_CANCELED);
                Log.e("facebook","cancel");
                //finish();
            }

            @Override
            public void onError(FacebookException e) {
                // Handle exception
                Log.e("facebook","error");
            }
        });

//        printKeyhash();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mCallbackManager.onActivityResult(requestCode, resultCode, data);
    }
    private void printKeyhash() {
        try {
            PackageInfo info = getPackageManager().getPackageInfo("com.codiansoft.teachlerystudent", PackageManager.GET_SIGNATURES);
            for (Signature sign : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(sign.toByteArray());
                Log.e("Hash-key", Base64.encodeToString(md.digest(), Base64.DEFAULT));


            }

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }
}
