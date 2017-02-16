package me.f1reking.smart_tool.module.wifi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import me.f1reking.smart_tool.R;
import me.f1reking.smart_tool.adapter.WifiListAdapter;
import me.f1reking.smart_tool.entity.WifiEntity;

public class WifiActivity extends AppCompatActivity {

    @BindView(R.id.rv_wifi)
    RecyclerView rvWifi;
    @BindView(R.id.activity_wifi)
    LinearLayout activityWifi;

    private List<WifiEntity> mWifiEntityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        WifiManager wifiManager = new WifiManager();
        try {
            mWifiEntityList = wifiManager.Read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(WifiActivity.this);
        rvWifi.setLayoutManager(layoutManager);
        WifiListAdapter adapter = new WifiListAdapter(WifiActivity.this, R.layout.item_list_wifi, mWifiEntityList);
        rvWifi.setAdapter(adapter);
    }
}
