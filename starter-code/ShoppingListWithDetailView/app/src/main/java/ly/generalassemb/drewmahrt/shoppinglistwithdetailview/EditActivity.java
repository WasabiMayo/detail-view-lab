package ly.generalassemb.drewmahrt.shoppinglistwithdetailview;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    EditText mNameEditText, mDescriptionEditText, mPriceEditText, mTypeEditText;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        mNameEditText = (EditText) findViewById(R.id.name_edittext);
        mDescriptionEditText = (EditText) findViewById(R.id.description_edittext);
        mPriceEditText = (EditText) findViewById(R.id.price_edittext);
        mTypeEditText = (EditText) findViewById(R.id.type_edittext);
        addButton = (Button) findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShoppingSQLiteOpenHelper helper = ShoppingSQLiteOpenHelper.getInstance(EditActivity.this);
                helper.addItem(mNameEditText.getText().toString(), mDescriptionEditText.getText().toString(), mPriceEditText.getText().toString(), mTypeEditText.getText().toString());
                finish();
            }
        });


    }
}
