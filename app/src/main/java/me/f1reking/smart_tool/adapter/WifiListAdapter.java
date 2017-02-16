package me.f1reking.smart_tool.adapter;

import android.content.Context;
import java.util.List;
import me.f1reking.adapter.RecyclerAdapter;
import me.f1reking.adapter.RecyclerViewHolder;
import me.f1reking.smart_tool.R;
import me.f1reking.smart_tool.entity.WifiEntity;

/**
 * Author: HuangYH.
 * Date: 2017/2/4.
 * Desc: wifi列表适配器
 */

public class WifiListAdapter extends RecyclerAdapter<WifiEntity> {

    public WifiListAdapter(Context context, int layoutId, List<WifiEntity> datas) {
        super(context, layoutId, datas);
    }

    @Override
    public void convert(RecyclerViewHolder holder, WifiEntity wifiEntity) {
        holder.setText(R.id.tv_ssid,"wifi："+ wifiEntity.getSsid());
        holder.setText(R.id.tv_psk,"密码："+ wifiEntity.getPsk());
    }
}
