package boston.hackingforgood.resourceapp.components.profile_setup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;

import boston.hackingforgood.resourceapp.R;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfileSetupActivity extends AppCompatActivity {

    @Bind(R.id.image_profile)
    ImageView profileImage;

    @OnClick(R.id.button_change_photo)
    public void onChangePhotoButtonClicked() {

    }

    @Bind(R.id.edit_text_real_name)
    EditText realNameEditText;

    @Bind(R.id.edit_text_display_name)
    EditText displayNameEditText;

    @Bind(R.id.edit_text_email)
    EditText emailEditText;

    @Bind(R.id.edit_text_mobile)
    EditText mobileEditText;

    @Bind(R.id.autocomplete_organization)
    AutoCompleteTextView organizationAutocomplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_setup);
        ButterKnife.bind(this);
        configureOrganizationAutocomplete();
    }

    private void configureOrganizationAutocomplete() {
        String[] placeholderOrgs = {"Seattle Police", "WARN", "Take Action", "Seattle Against Slavery"};
        ArrayAdapter organizationAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                placeholderOrgs);
        organizationAutocomplete.setAdapter(organizationAdapter);
    }
}
