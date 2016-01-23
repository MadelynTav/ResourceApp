package boston.hackingforgood.resourceapp.components.post;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import boston.hackingforgood.resourceapp.R;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PostActivity extends AppCompatActivity {

    @OnClick(R.id.button_pm)
    public void onPMButtonClicked() {
    }

    @OnClick(R.id.button_reply)
    public void onReplyButtonClicked() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        ButterKnife.bind(this);
    }
}
