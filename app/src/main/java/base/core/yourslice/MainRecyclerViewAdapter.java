package base.core.yourslice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class MainRecyclerViewAdapter extends RecyclerView.Adapter<MainRecyclerViewAdapter.ViewHolder>{



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_cards, parent, AttachToRoot: false);
        ViewHolder holder = new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        TextView item;
        EditText itemCost;

        public ViewHolder(View itemView) {
            super(itemView);
        }

    }
}
