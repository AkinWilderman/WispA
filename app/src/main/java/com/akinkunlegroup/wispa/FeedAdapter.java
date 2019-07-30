package com.akinkunlegroup.wispa;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import java.util.ArrayList;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.MyViewHolder> {

    Context mContext;
    ArrayList<FeedModel> mFeedModels;
    RequestManager glide;

    public FeedAdapter(Context context, ArrayList<FeedModel> mFeedModels) {
        this.mContext = context;
        this.mFeedModels = mFeedModels;
        glide = Glide.with(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.timeline, viewGroup,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        final FeedModel feedModel = mFeedModels.get(i);

        holder.name.setText(feedModel.getName());
        holder.time.setText(feedModel.getTime());
        holder.remarks.setText(String.valueOf(feedModel.getComments()));
        holder.reactions.setText(String.valueOf(feedModel.getLikes()));
        holder.post.setText(feedModel.getStatus());

        glide.load(feedModel.getProfilePic()).into(holder.profilPic);

        if (feedModel.getPostPic() == 0){
            holder.postPic.setVisibility(View.GONE);
        }else{
            holder.postPic.setVisibility(View.VISIBLE);
            glide.load(feedModel.getPostPic()).into(holder.postPic);
        }
    }

    @Override
    public int getItemCount() {
        return mFeedModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name, time, reactions, remarks, post;
        ImageView profilPic, postPic;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            profilPic = this.itemView.findViewById(R.id.avatar);
            postPic = this.itemView.findViewById(R.id.picture_post);
            name = this.itemView.findViewById(R.id.name);
            time = this.itemView.findViewById(R.id.time);
            reactions = this.itemView.findViewById(R.id.reactons_count);
            remarks = this.itemView.findViewById(R.id.remarks_count);
            post = this.itemView.findViewById(R.id.posts);
        }
    }
}
