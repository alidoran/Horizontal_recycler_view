package alidoran.ir.horizontalrecyclerview;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.NewsViewHolder> {

    ArrayList <News> newsArrayList;
    Context context;

    public RecyclerAdapter ( ArrayList <News> news , Context context ) {
        newsArrayList = new ArrayList <> ( );
        newsArrayList = news;
        this.context = context;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder ( @NonNull ViewGroup viewGroup , int i ) {
        View view = LayoutInflater.from ( viewGroup.getContext ( ) ).inflate ( R.layout.activity_recyclerview , viewGroup , false );
        return new NewsViewHolder ( view );
    }

    @Override
    public void onBindViewHolder ( @NonNull NewsViewHolder newsViewHolder , final int i ) {             //i=now posation
        News datamodel = newsArrayList.get ( i );
        newsViewHolder.txtrecyclernew.setText ( datamodel.getTitle ( ) );
        newsViewHolder.txtrecyclerdocsnew.setText ( datamodel.getDesc ( ) );

        newsViewHolder.click.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                Toast.makeText ( context , String.valueOf ( i ) , Toast.LENGTH_LONG ).show ( );
            }
        } );

    }

    @Override
    public int getItemCount ( ) {
        return newsArrayList.size ( );
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {

        TextView txtrecyclernew;
        TextView txtrecyclerdocsnew;
        ImageView imgrecyclernews;
        LinearLayout click;

        public NewsViewHolder ( @NonNull View itemView ) {
            super ( itemView );

            txtrecyclernew = itemView.findViewById ( R.id.txtrecyclernew );
            txtrecyclerdocsnew = itemView.findViewById ( R.id.txtrecyclerdocsnew );
            imgrecyclernews = itemView.findViewById ( R.id.imgrecyclernews );
            click = itemView.findViewById ( R.id.click );
        }
    }
}





/* first add implementation 'com.android.support:recyclerview-v7:28.0.0-rc02'
1-extends RecyclerView.Adapter<> !!extend class from this and not importent "<>" error
2-create class NewsViewHolder extends RecyclerView.ViewHolder in the RecyclerAdapter and create constrator by alt+enter !!NewsViewHolder muset inner of RecyclerAdapter class & not out of class
3-input RecyclerAdapter.NewsViewHolder to <> and implement method
4-constractor for method for NewsViewHolder by alt+enter
5-write constractor for RecyclerAdapter method and "ArrayList<News> new" in input method               !!each of data give in News frome java News
6-identify ArrayList<News> news; and give data in constractor
7-View view ... give xml from layout and send it.
8-create and connect widgetin NewsViewHolder class. !!findviewbyid
9-getItemCount return number of News size
10-fill the bine method
ADAPTER FINISH



oncreateviewholder =create data fom xml
onbindviewholder =create data from oncreateviewholder
getItemCount =number of row


*/
