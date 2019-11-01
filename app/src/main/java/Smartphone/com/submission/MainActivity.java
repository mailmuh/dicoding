package Smartphone.com.submission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Smartphone>list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle( "Daftar Smartphone Favorite");

        rvCategory = (RecyclerView)findViewById(R.id.listtampil);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(DataSmartphone.getListData());
        showRecylerCardView();
    }

    private void showRecylerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewLaguAdapter cardViewLaguAdapter = new CardViewLaguAdapter(this);
        cardViewLaguAdapter.setListSmartphone(list);
        rvCategory.setAdapter(cardViewLaguAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Membaca file menu dan menambahkan isinya ke action bar jika ada.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onAbout(MenuItem mi) {
        // pengecekannya di sini
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

}
