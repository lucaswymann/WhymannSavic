package info.androidhive.imagefilters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity implements UserDao{

    Button backButton;
    Button signupButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        backButton = (Button)findViewById(R.id.backbutton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, Homepage.class));
            }
        });
        signupButton = (Button)findViewById(R.id.signupbutton);
        signupButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText username = (EditText)findViewById(R.id.usernameInput);
                EditText password = (EditText)findViewById(R.id.passwordInput);
                EditText passwordRepeat = (EditText)findViewById(R.id.passwordRepeatInput);
                EditText email = (EditText)findViewById(R.id.emailInput);

                String usernamestr = username.getText().toString();
                String passwordstr = password.getText().toString();
                String passwordRepeatstr = passwordRepeat.getText().toString();
                String emailstr = email.getText().toString();

                if(!passwordstr.equals(passwordRepeatstr)){
                    Context context = getApplicationContext();
                    CharSequence text = "Password doesn't match";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
    }

    @Override
    public User findByUsername(String username, String password) {
        return null;
    }

    @Override
    public int countUsers() {
        return 0;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void insertAll(User... users) {

    }
}
