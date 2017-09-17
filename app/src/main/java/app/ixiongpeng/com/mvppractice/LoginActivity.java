package app.ixiongpeng.com.mvppractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, ILoginView{


    EditText userName = null;
    EditText pswd = null;
    Button login = null;
    ProgressBar progressbar = null;
    LinearLayout loginLayout = null;
    LoginPresenter loginPresenter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText)findViewById(R.id.id_userName);
        pswd = (EditText)findViewById(R.id.id_pswd);
        login = (Button)findViewById(R.id.id_login);
        login.setOnClickListener(this);
        progressbar = (ProgressBar)findViewById(R.id.id_progressBar);
        loginLayout = (LinearLayout)findViewById(R.id.loginLayout);
        loginPresenter = new LoginPresenter(LoginActivity.this);
    }


    @Override
    public void onClick(View v) {
        loginPresenter.loginToServer("", "");

    }

    @Override
    public void showProgress(boolean enable) {
        if(enable){
            progressbar.setVisibility(View.VISIBLE);
            loginLayout.setVisibility(View.GONE);

        }else{
            progressbar.setVisibility(View.GONE);
            loginLayout.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public void showLoginView() {
        Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT);
        finish();
    }
}
