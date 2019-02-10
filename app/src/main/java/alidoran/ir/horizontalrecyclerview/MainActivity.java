package alidoran.ir.horizontalrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    ArrayList<News> samplenews;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        samplenews=new ArrayList <News> (  );
        recyclerView=findViewById ( R.id.recyclerview );

        RecyclerAdapter recyclerAdapter=new RecyclerAdapter ( samplenews,this );   //in () you must enter source of data
        recyclerView.setAdapter ( recyclerAdapter );
        recyclerView.setLayoutManager ( new LinearLayoutManager ( this , LinearLayoutManager.HORIZONTAL , false ) );

//create data for show in program

        for (int i=0;i<10;i++)
        {
            News news = new News ();
            news.setId ( i+1 );
            news.setTitle ( "sampleTitle" + i );
            news.setDesc ( "sampleDecs" +1 );

            samplenews.add ( news );
        }
    }
}
/*
موارد مورد نیاز

1- xml
2- datamodel = news
3-adapter    =
arraylist
layoutmanager
recyclerview

 */