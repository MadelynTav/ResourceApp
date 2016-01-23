package boston.hackingforgood.resourceapp.components.home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import boston.hackingforgood.resourceapp.R;
import butterknife.Bind;
import butterknife.ButterKnife;

public class HomeActivityFragment extends Fragment {
    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;


    public HomeActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_activity, container, false);
        ButterKnife.bind(this, view);

        List<Object> objects = new ArrayList<>();
        objects.add("Message One");
        objects.add("Message Two");
        objects.add("Message Three");
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getActivity(), objects);
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

}
