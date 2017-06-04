package id.sch.smktelkom_mlg.learn.timesheet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.learn.timesheet.adapter.DataAdapter;
import id.sch.smktelkom_mlg.learn.timesheet.model.DataModel;

public class LocationActivity extends AppCompatActivity {

    DataAdapter mDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mDataAdapter = new DataAdapter(getDataList());
        recyclerView.setAdapter(mDataAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        setTitle("Location Work");
    }


    public ArrayList<DataModel> getDataList() {
        ArrayList<DataModel> datas = new ArrayList<>();
        DataModel data = new DataModel("PT. Dirgantara Angkasa Raya Satu Dua", "Detail Goes Hereeeeeeeeee", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("PT. Maritim Samudra Raya Satu Dua", "Detail Goes Hereeeeeeeeee", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("PT. Bagaskara Surya Raya Satu Dua", "Detail Goes Hereeeeeeeeee", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("PT. Adi Suryatama Raya Satu Dua", "Detail Goes Hereeeeeeeeee", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("PT. Visionet Internasional Satu Dua", "Detail Goes Hereeeeeeeeee", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("PT. Bumi Indonesai Merdeka Satu Dua", "Detail Goes Hereeeeeeeeee", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("PT. Banyuwangi Indah Satu Dua", "Detail Goes Hereeeeeeeeee", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("PT. Laros Blambangan Satu Dua", "Detail Goes Hereeeeeeeeee", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("PT. Lare Osing Salawase Satu Dua", "Detail Goes Hereeeeeeeeee", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("PT. Minak Jinggo Baru Satu Dua", "Detail Goes Hereeeeeeeeee", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("PT. Persewangi Banyuwangi Satu Dua", "Detail Goes Hereeeeeeeeee", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("PT. Satu Dua Satu Dua Satu Dua", "Detail Goes Hereeeeeeeeee", ColorUtil.getRandomColor());
        datas.add(data);

        return datas;
    }
}
