package nkdroid.tutorial.floatinglabels;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity{

    private TextInputLayout mUserName,mPassword;
    private Button mLogin;
    private EditText etUsername,etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUserName= (TextInputLayout) findViewById(R.id.user_name);
        mPassword= (TextInputLayout) findViewById(R.id.password);
        etUsername= (EditText) findViewById(R.id.etusername);
        etPassword= (EditText) findViewById(R.id.etpassword);
        mLogin= (Button) findViewById(R.id.login);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(etUsername.getText().toString().length()==0){
                    //set error
                    mUserName.setError("Please Enter Username");
                }  else {
                    //remove error
                    mUserName.setError(null);
                }

                if(etPassword.getText().toString().length()==0){
                    mPassword.setError("Please Enter Password");
                } else {
                    mPassword.setError(null);
                }

            }
        });
    }
}
