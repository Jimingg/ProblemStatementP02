package sg.edu.rp.c346.problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private ArrayList<Holiday> holiday;

    private Context context;
    private TextView tvname;
    private TextView tvdate;
    private ImageView ivholi;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holiday = objects;

        // Store Context object as we would need to use it later
        this.context = context;
    }



    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvname =         rowView.findViewById(R.id.tvname);
        // Get the ImageView object
        ivholi =             rowView.findViewById(R.id.ivholiday);

        tvdate = rowView.findViewById(R.id.tvdate);



        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holiday currentholiday = holiday.get(position);
        // Set the TextView to show the food



        tvname.setText(currentholiday.getName());
        tvdate.setText(currentholiday.getDate());
        String imagename = currentholiday.getImagename();




        if (currentholiday.getName().equalsIgnoreCase("New Year's Day")){
            ivholi.setImageResource(R.drawable.new_year);
        }else if (currentholiday.getName().equalsIgnoreCase("Labour Day")){
            ivholi.setImageResource(R.drawable.labour_day);
        }else if(currentholiday.getName().equalsIgnoreCase("Chinese New Year")){
            ivholi.setImageResource(R.drawable.cny);
        }else if(currentholiday.getName().equalsIgnoreCase("Good Friday")){
            ivholi.setImageResource(R.drawable.good_friday);
        }



        // Set the image to star or nostar accordingly

        // Return the nicely done up View to the ListView
        return rowView;
    }
}
