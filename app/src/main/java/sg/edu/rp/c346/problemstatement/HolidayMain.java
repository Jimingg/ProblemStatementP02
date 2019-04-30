package sg.edu.rp.c346.problemstatement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayMain extends AppCompatActivity {
    ListView lv;
    TextView tvtypes;
    ArrayAdapter aa;
    ArrayList<Holiday> holiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday_main);
        lv = (ListView) this.findViewById(R.id.lvholiday);
        tvtypes = (TextView) findViewById(R.id.tvNametypes);

        Intent i = getIntent();
        String type = i.getStringExtra("type");
        tvtypes.setText(type);
        if (type.equalsIgnoreCase("Secular")){
            holiday = new ArrayList<Holiday>();
            holiday.add(new Holiday("new_year", "New Year's Day" , "1 Jan 2017"));
            holiday.add(new Holiday("labour_day", "Labour Day","1 May 2017"));

        }else {
            holiday = new ArrayList<Holiday>();
            holiday.add(new Holiday("cny", "Chinese New Year" , "28-19 Jan 2017"));
            holiday.add(new Holiday("good_friday", "Good Friday","14 April 2017"));


        }



        aa = new HolidayAdapter(this, R.layout.row, holiday);

        lv.setAdapter(aa);









    }


}

