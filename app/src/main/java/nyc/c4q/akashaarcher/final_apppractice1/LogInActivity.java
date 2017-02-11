package nyc.c4q.akashaarcher.final_apppractice1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by akashaarcher on 2/7/17.
 */

public class LogInActivity extends AppCompatActivity {

    private Button logIn;
    private Button logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        logIn = (Button) findViewById(R.id.login_btn);
        logOut = (Button) findViewById(R.id.logout_btn);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logInIntent = new Intent(LogInActivity.this, MainActivity.class);
                startActivity(logInIntent);
            }
        });


        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}

