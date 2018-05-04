import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.srikar.freshmaps.R;

public class Map extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        String input = getIntent().getExtras().getString("room");
        String total;
        if (input.charAt(0) == 'A') {
            total = "This room is in the A-building and is Mr. Higgins room";
        } else if (input.charAt(0) == 'B') {
            total = "This room is in the B-building and is Mr. Higgins room";
        } else {
            total = "Where you trynna go bruh?";
        }
        TextView text = (TextView) findViewById(R.id.RoomDisplay);
        text.setText(total);
        Button back = (Button) findViewById(R.id.BackButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startIntent = new Intent(getApplicationContext(), com.example.srikar.myapplication.MainActivity.class);
                startActivity(startIntent);
            }
        });

    }
}
