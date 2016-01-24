package boston.hackingforgood.resourceapp.components.about;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import boston.hackingforgood.resourceapp.R;
import boston.hackingforgood.resourceapp.components.sign_up.SignUpActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AboutActivity extends AppCompatActivity {

    @OnClick(R.id.button_sign_up)
    public void onSignUpButtonClicked() {
        goToSignUp();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);
    }

    private void goToSignUp() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
        finish();
    }
}
