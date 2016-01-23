package boston.hackingforgood.resourceapp.components.launch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import boston.hackingforgood.resourceapp.R;
import boston.hackingforgood.resourceapp.components.about.AboutActivity;
import boston.hackingforgood.resourceapp.components.sign_up.SignUpActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.aboutUsButton)
    public void onClickAboutUs(){
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.applyNowButton)
    public void onClickApplyNow(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
