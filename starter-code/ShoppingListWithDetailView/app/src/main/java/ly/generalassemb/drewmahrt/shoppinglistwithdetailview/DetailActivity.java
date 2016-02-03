package ly.generalassemb.drewmahrt.shoppinglistwithdetailview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int id = getIntent().getIntExtra("ITEM_ID", -1);

        if (id >= 0) {
            String[] details = ShoppingSQLiteOpenHelper.getInstance(DetailActivity.this).getDetailsById(id);
            TextView detailTextView = (TextView)findViewById(R.id.detail_text_view);
            detailTextView.setText(details[0] + "\n" + details[1] + "\n" + details[2] + "\n" + details[3] + "\n"  );
        }
    }
}
