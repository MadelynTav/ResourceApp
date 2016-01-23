package boston.hackingforgood.resourceapp.components.account_created;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import boston.hackingforgood.resourceapp.R;
import boston.hackingforgood.resourceapp.components.profile_setup.ProfileSetupActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AccountCreatedActivity extends AppCompatActivity {

    @OnClick(R.id.button_setup_profile)
    public void onSetupProfileButtonClicked() {
        goToProfileSetup();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_created);
        ButterKnife.bind(this);
    }

    private void goToProfileSetup() {
        Intent intent = new Intent(this, ProfileSetupActivity.class);
        startActivity(intent);
        finish();
    }
}
