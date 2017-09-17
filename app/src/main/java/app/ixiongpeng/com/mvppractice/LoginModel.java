package app.ixiongpeng.com.mvppractice;

import android.os.Handler;

/**
 * Created by xiongpeng on 2017/9/17.
 */

public class LoginModel implements ILoginModel {

    private ILoginPresenter presenter;
    private Handler mHandler = new Handler();

    public LoginModel(ILoginPresenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void login(String name, String padssword) {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                presenter.loginSucceed();
            }
        }, 2000);

    }
}
