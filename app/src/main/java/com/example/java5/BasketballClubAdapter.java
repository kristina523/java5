package com.example.java5;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class BasketballClubAdapter extends RecyclerView.Adapter<BasketballClubAdapter.ViewHolder> {

    private List<BasketballClub> basketballClub;
    private Context context;

    public BasketballClubAdapter(Context context, List<BasketballClub> basketballClub) {
        this.context = context;
        this.basketballClub = basketballClub;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_basketball_club, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BasketballClub club = basketballClub.get(position);
        holder.name.setText(club.getName());
        holder.stadium.setText(club.getStadium());
        holder.coach.setText(club.getCoach());
        holder.Yearfounded.setText(club.getFoundedYear());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, ClubDetailActivity.class);
            intent.putExtra("name", club.getName());
            intent.putExtra("stadium", club.getStadium());
            intent.putExtra("coach", club.getCoach());
            intent.putExtra("foundedYear", club.getFoundedYear());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return basketballClub.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView stadium;
        public TextView coach;
        public TextView Yearfounded;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.clubName);
            stadium = itemView.findViewById(R.id.clubStadium);
            coach = itemView.findViewById(R.id.clubCoach);
            Yearfounded = itemView.findViewById(R.id.clubFoundedYear);
        }
    }
}