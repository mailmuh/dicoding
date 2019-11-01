package Smartphone.com.submission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailSmartphone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buah);
        this.setTitle( "Detail Smartphone");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Smartphone smartphone = getIntent().getParcelableExtra("key");

        ImageView gamabar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView remarks = (TextView)findViewById(R.id.tv_item_remarks);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);
        TextView lahir = (TextView)findViewById(R.id.content_lahir);
        TextView pendiri = (TextView)findViewById(R.id.content_pendiri);

        Glide.with(this).load(smartphone.getPhoto()).override(350,550).into(gamabar);
        name.setText(smartphone.getName());
        remarks.setText(smartphone.getRemarks());
        deskripsi.setText(smartphone.getDeskripsi());
        lahir.setText(smartphone.getLahir());
        pendiri.setText(smartphone.getWafat());

        Log.i("photo", smartphone.getPhoto());
        Log.i("deskripsi", smartphone.getDeskripsi());
    }
}
