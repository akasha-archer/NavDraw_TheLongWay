package nyc.c4q.akashaarcher.final_apppractice1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Akasha on 2/10/17.
 */

public class NavAdapter extends RecyclerView.Adapter<NavAdapter.NavViewHolder> {

    private ArrayList<String> navList = new ArrayList<>();

    public NavAdapter(ArrayList<String> navList) {
        this.navList = navList;
    }


    @Override
    public NavViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        NavViewHolder navViewHolder = new NavViewHolder(view);
        return navViewHolder;
    }

    @Override
    public void onBindViewHolder(NavViewHolder holder, int position) {
        holder.tvNavItem.setText(navList.get(position));
    }

    @Override
    public int getItemCount() {
        return navList.size();
    }




    public class NavViewHolder extends RecyclerView.ViewHolder {

        TextView tvNavItem;


        public NavViewHolder(View itemView) {
            super(itemView);
            tvNavItem = (TextView) itemView.findViewById(R.id.text_item);
        }


    }

}

