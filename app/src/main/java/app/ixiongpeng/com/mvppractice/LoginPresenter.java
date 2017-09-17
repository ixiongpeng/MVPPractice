package app.ixiongpeng.com.mvppractice;

/**
 * Created by xiongpeng on 2017/9/17.
 */

public class LoginPresenter implements ILoginPresenter {
    private ILoginModel loginModel;
    private ILoginView loginView;

    public LoginPresenter(ILoginView loginView){
        this.loginView = loginView;
        this.loginModel = new LoginModel(this);
    }

    @Override
    public void loginToServer(String userName, String password) {
        loginView.showProgress(true);
        loginModel.login(userName,password);
    }

    @Override
    public void loginSucceed() {
        loginView.showProgress(false);
        loginView.showLoginView();

    }
}
