package com.example.worldclock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
    public ConstraintLayout timeBox1;
    public ConstraintLayout timeBox2;
    public ConstraintLayout timeBox3;
    public ConstraintLayout timeBox4;
    public ConstraintLayout timeBox5;
    public ConstraintLayout timeBox6;
    public ConstraintLayout timeBox7;

    public TextView city;

    public TextView time1;
    public TextView time2;
    public TextView time3;
    public TextView time4;
    public TextView time5;
    public TextView time6;
    public TextView time7;

    public ImageView cityPic1;
    public ImageView cityPic2;
    public ImageView cityPic3;
    public ImageView cityPic4;
    public ImageView cityPic5;
    public ImageView cityPic6;
    public ImageView cityPic7;

    public ImageButton plusBtn1;
    public ImageButton minusBtn1;
    public ImageButton plusBtn2;
    public ImageButton minusBtn2;
    public ImageButton plusBtn3;
    public ImageButton minusBtn3;
    public ImageButton plusBtn4;
    public ImageButton minusBtn4;
    public ImageButton plusBtn5;
    public ImageButton minusBtn5;
    public ImageButton plusBtn6;
    public ImageButton minusBtn6;
    public ImageButton plusBtn7;
    public ImageButton minusBtn7;

    public Button twleveHrBtn;
    public Button twentyFourHrBtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        twleveHourBtn();

        twleveHrBtn = findViewById(R.id.twleveHrBtn);//locating the buttons on the activity_main
        twleveHrBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                twleveHourBtn();
                v.setBackgroundColor(getResources().getColor(R.color.yellow)); //changes the button colour when it's been selected
                findViewById(R.id.twentyFourHrBtn).setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
        });

        twentyFourHrBtn = findViewById(R.id.twentyFourHrBtn);
        twentyFourHrBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                twentyFourHourBtn();
                v.setBackgroundColor(getResources().getColor(R.color.yellow));
                findViewById(R.id.twleveHrBtn).setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
        });

    }

    public void twleveHourBtn (){
        timeBox1("h:mm a");
        timeBox2("h:mm a");
        timeBox3("h:mm a");
        timeBox4("h:mm a");
        timeBox5("h:mm a");
        timeBox6("h:mm a");
        timeBox7("h:mm a");
    }
    public void twentyFourHourBtn (){
        timeBox1("HH:mm");
        timeBox2("HH:mm");
        timeBox3("HH:mm");
        timeBox4("HH:mm");
        timeBox5("HH:mm");
        timeBox6("HH:mm");
        timeBox7("HH:mm");
    }
    /*I've made a little method for each layout box, this allows each layout to be controlled individually
    especially for functions such as to hide and show the time of cities.
     */

    private void timeBox1(String s) {
        timeBox1 = findViewById(R.id.sydneyTime);//identify layout in activity_main
        city = timeBox1.findViewById(R.id.cityName);//identify textView box of city name in the same layout
        city.setText("SYDNEY");
        time1 = timeBox1.findViewById(R.id.timeTxt);//identify textView box of time in the same layout
        SimpleDateFormat sydneyDate = new SimpleDateFormat(s); //formatting the output time
        sydneyDate.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));//set the timezone, I used Sydney instead of local is because in the Emulator sometimes loads a different timezone
        String sydney = sydneyDate.format(new Date());
        time1.setText(sydney);
        cityPic1 = timeBox1.findViewById(R.id.imageView);//identify imageView for city's picture
        cityPic1.setImageResource(R.drawable.sydney);//load picture from drawable
        minusBtn1 = timeBox1.findViewById(R.id.imageMinus);
        /*the follow section is the code i use to hide and show time. This hides the time and the picture,
        but the city name remained unhidden this is to allow the user to locate the hidden city more easily
         */
        minusBtn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn1.setVisibility(View.GONE);
                plusBtn1.setVisibility(View.VISIBLE);
                time1.setVisibility(View.GONE);
                cityPic1.setVisibility(View.GONE);
            }
        });
        plusBtn1 = timeBox1.findViewById(R.id.imagePlus);
        plusBtn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn1.setVisibility(View.VISIBLE);
                plusBtn1.setVisibility(View.GONE);
                time1.setVisibility(View.VISIBLE);
                cityPic1.setVisibility(View.VISIBLE);
            }
        });
    }

    private void timeBox2(String s) {
        timeBox2 = findViewById(R.id.londonTime);
        city = timeBox2.findViewById(R.id.cityName);
        city.setText("LONDON");
        time2 = timeBox2.findViewById(R.id.timeTxt);
        SimpleDateFormat londonDate = new SimpleDateFormat(s);
        londonDate.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        String london = londonDate.format(new Date());
        time2.setText(london);
        cityPic2 = timeBox2.findViewById(R.id.imageView);
        cityPic2.setImageResource(R.drawable.london);
        minusBtn2 = timeBox2.findViewById(R.id.imageMinus);
        minusBtn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn2.setVisibility(View.GONE);
                plusBtn2.setVisibility(View.VISIBLE);
                time2.setVisibility(View.GONE);
                cityPic2.setVisibility(View.GONE);
            }
        });
        plusBtn2 = timeBox2.findViewById(R.id.imagePlus);
        plusBtn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn2.setVisibility(View.VISIBLE);
                plusBtn2.setVisibility(View.GONE);
                time2.setVisibility(View.VISIBLE);
                cityPic2.setVisibility(View.VISIBLE);
            }
        });
    }

    private void timeBox3(String s){
        timeBox3 = findViewById(R.id.parisTime);
        city = timeBox3.findViewById(R.id.cityName);
        city.setText("PARIS");
        time3 = timeBox3.findViewById(R.id.timeTxt);
        SimpleDateFormat parisDate = new SimpleDateFormat(s);
        parisDate.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        String paris = parisDate.format(new Date());
        time3.setText(paris);
        cityPic3 = timeBox3.findViewById(R.id.imageView);
        cityPic3.setImageResource(R.drawable.paris);
        minusBtn3 = timeBox3.findViewById(R.id.imageMinus);
        minusBtn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn3.setVisibility(View.GONE);
                plusBtn3.setVisibility(View.VISIBLE);
                time3.setVisibility(View.GONE);
                cityPic3.setVisibility(View.GONE);
            }
        });
        plusBtn3 = timeBox3.findViewById(R.id.imagePlus);
        plusBtn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn3.setVisibility(View.VISIBLE);
                plusBtn3.setVisibility(View.GONE);
                time3.setVisibility(View.VISIBLE);
                cityPic3.setVisibility(View.VISIBLE);
            }
        });
    }

    private void timeBox4(String s) {
        timeBox4 = findViewById(R.id.tokyoTime);
        city = timeBox4.findViewById(R.id.cityName);
        city.setText("TOKYO");
        time4 = timeBox4.findViewById(R.id.timeTxt);
        SimpleDateFormat tokyoDate = new SimpleDateFormat(s);
        tokyoDate.setTimeZone(TimeZone.getTimeZone("Japan"));
        String tokyo = tokyoDate.format(new Date());
        time4.setText(tokyo);
        cityPic4 = timeBox4.findViewById(R.id.imageView);
        cityPic4.setImageResource(R.drawable.tokyo);
        minusBtn4 = timeBox4.findViewById(R.id.imageMinus);
        minusBtn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn4.setVisibility(View.GONE);
                plusBtn4.setVisibility(View.VISIBLE);
                time4.setVisibility(View.GONE);
                cityPic4.setVisibility(View.GONE);
            }
        });
        plusBtn4 = timeBox4.findViewById(R.id.imagePlus);
        plusBtn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn4.setVisibility(View.VISIBLE);
                plusBtn4.setVisibility(View.GONE);
                time4.setVisibility(View.VISIBLE);
                cityPic4.setVisibility(View.VISIBLE);
            }
        });
    }

    private void timeBox5(String s) {
        timeBox5 = findViewById(R.id.shanghaiTime);
        city = timeBox5.findViewById(R.id.cityName);
        city.setText("SHANGHAI");
        time5 = timeBox5.findViewById(R.id.timeTxt);
        SimpleDateFormat shanghaiDate = new SimpleDateFormat(s);
        shanghaiDate.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        String shanghai = shanghaiDate.format(new Date());
        time5.setText(shanghai);
        cityPic5 = timeBox5.findViewById(R.id.imageView);
        cityPic5.setImageResource(R.drawable.shanghai);
        minusBtn5 = timeBox5.findViewById(R.id.imageMinus);
        minusBtn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn5.setVisibility(View.GONE);
                plusBtn5.setVisibility(View.VISIBLE);
                time5.setVisibility(View.GONE);
                cityPic5.setVisibility(View.GONE);
            }
        });
        plusBtn5 = timeBox5.findViewById(R.id.imagePlus);
        plusBtn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn5.setVisibility(View.VISIBLE);
                plusBtn5.setVisibility(View.GONE);
                time5.setVisibility(View.VISIBLE);
                cityPic5.setVisibility(View.VISIBLE);
            }
        });
    }

    private void timeBox6(String s) {
        timeBox6 = findViewById(R.id.newyorkTime);
        city = timeBox6.findViewById(R.id.cityName);
        city.setText("NEW YORK");
        time6 = timeBox6.findViewById(R.id.timeTxt);
        SimpleDateFormat nyDate = new SimpleDateFormat(s);
        nyDate.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String ny = nyDate.format(new Date());
        time6.setText(ny);
        cityPic6 = timeBox6.findViewById(R.id.imageView);
        cityPic6.setImageResource(R.drawable.newyork);
        minusBtn6 = timeBox6.findViewById(R.id.imageMinus);
        minusBtn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn6.setVisibility(View.GONE);
                plusBtn6.setVisibility(View.VISIBLE);
                time6.setVisibility(View.GONE);
                cityPic6.setVisibility(View.GONE);
            }
        });
        plusBtn6 = timeBox6.findViewById(R.id.imagePlus);
        plusBtn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn6.setVisibility(View.VISIBLE);
                plusBtn6.setVisibility(View.GONE);
                time6.setVisibility(View.VISIBLE);
                cityPic6.setVisibility(View.VISIBLE);
            }
        });
    }

    private void timeBox7(String s) {
        timeBox7 = findViewById(R.id.romeTime);
        city = timeBox7.findViewById(R.id.cityName);
        city.setText("ROME");
        time7 = timeBox7.findViewById(R.id.timeTxt);
        SimpleDateFormat romeDate = new SimpleDateFormat(s);
        romeDate.setTimeZone(TimeZone.getTimeZone("Europe/Rome"));
        String rome = romeDate.format(new Date());
        time7.setText(rome);
        cityPic7 = timeBox7.findViewById(R.id.imageView);
        cityPic7.setImageResource(R.drawable.rome);
        minusBtn7 = timeBox7.findViewById(R.id.imageMinus);
        minusBtn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn7.setVisibility(View.GONE);
                plusBtn7.setVisibility(View.VISIBLE);
                time7.setVisibility(View.GONE);
                cityPic7.setVisibility(View.GONE);
            }
        });
        plusBtn7 = timeBox7.findViewById(R.id.imagePlus);
        plusBtn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                minusBtn7.setVisibility(View.VISIBLE);
                plusBtn7.setVisibility(View.GONE);
                time7.setVisibility(View.VISIBLE);
                cityPic7.setVisibility(View.VISIBLE);
            }
        });
    }

}
