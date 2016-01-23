package boston.hackingforgood.resourceapp.components.launch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import boston.hackingforgood.resourceapp.R;
import boston.hackingforgood.resourceapp.components.about.AboutPage;
import boston.hackingforgood.resourceapp.components.signup.SignUpActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LaunchScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.aboutUsButton)
    public void onClickAboutUs(){
        Intent intent = new Intent(this, AboutPage.class);
        startActivity(intent);
    }

    @OnClick(R.id.applyNowButton)
    public void onClickApplyNow(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
