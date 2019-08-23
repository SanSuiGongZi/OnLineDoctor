package com.example.wayne.dentist.ui.activity;

import android.Manifest;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapOptions;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.navi.AmapNaviParams;
import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseActivity;
import com.example.wayne.dentist.mvp.Preselection.PreselectionPre;
import com.example.wayne.dentist.mvp.Preselection.PreselectionView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PreselectionActivity extends BaseActivity<PreselectionView, PreselectionPre> implements PreselectionView {

    @BindView(R.id.map)
    MapView map;
    //操作地图的类
    private AMap aMap;
    //高德自带搜索
    private AmapNaviParams mParams;
    private UiSettings mUiSettings;

    @Override
    protected PreselectionPre getPresenter() {
        return new PreselectionPre();
    }

    @Override
    protected int getId() {
        return R.layout.activity_preselection;
    }

    //权限
    private void initPer() {
        String[] per = {Manifest.permission.READ_PHONE_STATE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.CAMERA};

        ActivityCompat.requestPermissions(this, per, 100);
    }

    @Override
    public void initView(Bundle savedInstanceState) {

        initPer();

        mParams = new AmapNaviParams(null);
        map.onCreate(savedInstanceState);
        //初始化地图控制器对象
        if (aMap == null) {
            aMap = map.getMap();
        }
        //改变地图默认显示区域
        initLatng(savedInstanceState);

        aMap.setMapType(AMap.MAP_TYPE_NORMAL);
        aMap.setTrafficEnabled(true);// 显示实时交通状况
        aMap.moveCamera(CameraUpdateFactory.zoomTo(16));//地图缩放级别
        //蓝点定位设置
        MyLocationStyle myLocationStyle;
        //初始化定位蓝点样式类myLocationStyle.myLocationType(MyLocationStyle.LOCATION_TYPE_LOCATION_ROTATE);
        //连续定位、且将视角移动到地图中心点，定位点依照设备方向旋转，并且会跟随设备移动。（1秒1次定位）如果不设置myLocationType，默认也会执行此种模式。
        myLocationStyle = new MyLocationStyle();
        myLocationStyle.interval(2000); //设置连续定位模式下的定位间隔，只在连续定位模式下生效，单次定位模式下不会生效。单位为毫秒。
        myLocationStyle.myLocationType(MyLocationStyle.LOCATION_TYPE_LOCATION_ROTATE);
        //myLocationStyle.strokeColor(getResources().getColor(R.color.blue));//设置定位蓝点精度圆圈的边框颜色的方法。
        //myLocationStyle.radiusFillColor(getResources().getColor(R.color.c_CFDEED));//设置定位蓝点精度圆圈的填充颜色的方法。
        //隐藏精度圈
        myLocationStyle.strokeColor(Color.argb(0,0,0,0));
        myLocationStyle.radiusFillColor(Color.argb(0,0,0,0));;
        aMap.setMyLocationStyle(myLocationStyle);//设置定位蓝点的Style
        aMap.setMyLocationEnabled(true);// 设置为true表示启动显示定位蓝点，false表示隐藏定位蓝点并不进行定位，默认是false。

        //实例化UiSettings类对象
        mUiSettings = aMap.getUiSettings();
        mUiSettings.setZoomControlsEnabled(false);//缩放按钮
        mUiSettings.setCompassEnabled(true);//指南针
        mUiSettings.setScaleControlsEnabled(true);//比例尺
        mUiSettings.setMyLocationButtonEnabled(true);//设置默认定位按钮是否显示，非必需设置。
    }

    private void initLatng(Bundle savedInstanceState) {

        // 定义北京市经纬度坐标（此处以北京坐标为例）
        LatLng centerBJPoint = new LatLng(39.904989, 116.405285);
        // 定义了一个配置 AMap 对象的参数类
        AMapOptions mapOptions = new AMapOptions();
        // 设置了一个可视范围的初始化位置
        // CameraPosition 第一个参数： 目标位置的屏幕中心点经纬度坐标。
        // CameraPosition 第二个参数： 目标可视区域的缩放级别
        // CameraPosition 第三个参数： 目标可视区域的倾斜度，以角度为单位。
        // CameraPosition 第四个参数： 可视区域指向的方向，以角度为单位，从正北向顺时针方向计算，从0度到360度
        mapOptions.camera(new CameraPosition(centerBJPoint, 10f, 0, 0));
        // 定义一个 MapView 对象，构造方法中传入 mapOptions 参数类
        MapView mapView = new MapView(this, mapOptions);
        // 调用 onCreate方法 对 MapView LayoutParams 设置
        mapView.onCreate(savedInstanceState);

    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，销毁地图
        map.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView.onResume ()，重新绘制加载地图
        map.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView.onPause ()，暂停地图的绘制
        map.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
        map.onSaveInstanceState(outState);
    }

}
