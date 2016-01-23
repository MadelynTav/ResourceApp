package boston.hackingforgood.resourceapp.components.sign_up;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import boston.hackingforgood.resourceapp.R;
import boston.hackingforgood.resourceapp.components.organization_profile_setup.OrganizationProfileActivity;
import boston.hackingforgood.resourceapp.components.profile_setup.ProfileSetupActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignUpActivity extends AppCompatActivity {

    @OnClick(R.id.becomeAPartnerButton)
    public void onBecomeAPartnerButtonClicked() {
        enterOrgCreation();
    }

    @OnClick(R.id.createAUserAccountButton)
    public void onCreateAUserAccountButtonClicked() {
        enterUserCreation();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
    }

    private void enterOrgCreation() {
        Intent intent = new Intent(this, OrganizationProfileActivity.class);
        startActivity(intent);
        finish();
    }

    private void enterUserCreation() {
        Intent intent = new Intent(this, ProfileSetupActivity.class);
        startActivity(intent);
        finish();
    }
}
