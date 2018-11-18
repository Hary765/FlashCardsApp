package com.example.harpatel.flashcardsapp;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);
        findViewById(R.id.cancelCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddCardActivity.this, MainActivity.class);
                AddCardActivity.this.startActivityForResult(intent, 100);
            }
        });
        findViewById(R.id.saveCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent(); // create a new Intent, this is where we will put our data
                data.putExtra("string1", ((EditText) findViewById(R.id.question)).getText().toString()); // puts one string into the Intent, with the key as 'string1'
                data.putExtra("string2", ((EditText) findViewById(R.id.answer)).getText().toString());// puts another string into the Intent, with the key as 'string2
                setResult(RESULT_OK, data); // set result code and bundle data for response
                finish(); // closes this activity and pass data to the original activity that launched this activity

            }
        });
    }

}

