package app.ixiongpeng.com.mvppractice;

/**
 * Created by xiongpeng on 2017/9/17.
 */

public interface ILoginPresenter {
    void loginToServer(String userName, String password);
    void loginSucceed();
}
