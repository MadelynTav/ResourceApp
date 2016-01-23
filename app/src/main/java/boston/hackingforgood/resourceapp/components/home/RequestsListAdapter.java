package boston.hackingforgood.resourceapp.components.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import boston.hackingforgood.resourceapp.R;

public class RequestsListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Object> objectList;
    Context context;

    public RequestsListAdapter(Context context, List<Object> objects){
        this.context= context;
        objectList= objects;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_holder, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //TODO set info about messages, events, etc

    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

}
