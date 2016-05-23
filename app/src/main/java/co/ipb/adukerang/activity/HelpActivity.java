package co.ipb.adukerang.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;
import co.ipb.adukerang.GMailSender;
import co.ipb.adukerang.R;
import co.ipb.adukerang.SendMail;
import co.ipb.adukerang.controller.AppConfig;

public class HelpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        ButterKnife.inject(this);


    }
}
