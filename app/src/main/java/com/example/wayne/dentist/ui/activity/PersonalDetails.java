package com.example.wayne.dentist.ui.activity;

import android.Manifest;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wayne.dentist.R;
import com.example.wayne.dentist.base.BaseActivity;
import com.example.wayne.dentist.mvp.PersonalDetails.PersonalPre;
import com.example.wayne.dentist.mvp.PersonalDetails.PersonalView;
import com.example.wayne.dentist.util.ImageLoader;
import com.example.wayne.dentist.util.SpUtil;
import com.google.gson.Gson;
import com.jaeger.library.StatusBarUtil;

import java.io.File;
import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class PersonalDetails extends BaseActivity<PersonalView, PersonalPre> implements PersonalView {

    @BindView(R.id.mIv_getBack)
    ImageView mIvGetBack;
    @BindView(R.id.preserve)
    TextView preserve;
    @BindView(R.id.mTool)
    Toolbar mTool;
    @BindView(R.id.mIv_setPhoto)
    ImageView mIvSetPhoto;
    @BindView(R.id.set_photo)
    RelativeLayout setPhoto;
    @BindView(R.id.mTv_phone)
    TextView mTvPhone;
    @BindView(R.id.set_phone)
    RelativeLayout setPhone;
    @BindView(R.id.mTv_UserName)
    TextView mTvUserName;
    @BindView(R.id.set_name)
    RelativeLayout setName;
    @BindView(R.id.mTv_RealName)
    TextView mTvRealName;
    @BindView(R.id.set_RealName)
    RelativeLayout setRealName;
    @BindView(R.id.mTv_Sex)
    TextView mTvSex;
    @BindView(R.id.set_Sex)
    RelativeLayout setSex;
    @BindView(R.id.mTv_Age)
    TextView mTvAge;
    @BindView(R.id.set_Year)
    RelativeLayout setYear;
    private static final int CAMERA_CODE = 100;
    private static final int ALBUM_CODE = 200;
    private PopupWindow mWindow;
    private File mFile;
    private Uri mImageUri;

    @Override
    protected PersonalPre getPresenter() {
        return new PersonalPre();
    }

    @Override
    protected int getId() {
        return R.layout.activity_personal_details;
    }

    @Override
    public void initView() {
        mTool.setTitle("");
        setSupportActionBar(mTool);
        StatusBarUtil.setLightMode(this);
    }

    @OnClick({R.id.mIv_getBack, R.id.preserve, R.id.set_photo, R.id.set_phone, R.id.set_name, R.id.set_RealName, R.id.set_Sex, R.id.set_Year})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mIv_getBack:
                break;
            case R.id.preserve:
                break;
            case R.id.set_photo:
                initpopupPhoto();
                break;
            case R.id.set_phone:
                startActivity(new Intent(PersonalDetails.this,SetDetailsActivity.class));
                break;
            case R.id.set_name:
                break;
            case R.id.set_RealName:
                break;
            case R.id.set_Sex:
                break;
            case R.id.set_Year:
                break;
        }
    }

    private void initpopupPhoto() {
        View view = LayoutInflater.from(this).inflate(R.layout.item_popup_photo, null);
        mWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        TextView tv_no = view.findViewById(R.id.mTv_noss);
        TextView tv_camera = view.findViewById(R.id.mTv_camera);
        TextView tv_photo = view.findViewById(R.id.mTv_photo);

        mWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.c_60s)));
        mWindow.setOutsideTouchable(true);
        //设置除布局外的点击事件
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关闭popop
                mWindow.dismiss();
            }
        });
        mWindow.showAtLocation(view, 0, 0, Gravity.BOTTOM);

        tv_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWindow.dismiss();
            }
        });

        //相机
        tv_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWindow.dismiss();
                takePhoto();
            }
        });
        //相册
        tv_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWindow.dismiss();
                takePICK();
            }
        });
    }

    // 相机权限
    private void takePhoto() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
            openCamera();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 100);
        }
    }

    // 相册权限
    private void takePICK() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            openAlbum();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 200);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            if (requestCode == 100) {
                openCamera();
            } else if (requestCode == 200) {
                openAlbum();
            }
        }
    }

    //打开相机
    private void openCamera() {

        //创建文件用于保存图片
        mFile = new File(getExternalCacheDir(), System.currentTimeMillis() + ".jpg");
        if (!mFile.exists()) {
            try {
                mFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //适配7.0,  等到对应的mImageUri路径地址
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            mImageUri = Uri.fromFile(mFile);
        } else {
            //第二个参数要和清单文件中的配置保持一致
            mImageUri = FileProvider.getUriForFile(this, "com.baidu.upload.provider", mFile);
        }

        //启动相机
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, mImageUri);//将拍照图片存入mImageUri
        startActivityForResult(intent, CAMERA_CODE);
    }


    //打开相册
    private void openAlbum() {

        //启动相册
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, ALBUM_CODE);
    }


    //获取回传数据
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {//判断回调成功

            if (requestCode == CAMERA_CODE) {//拍照

                //显示拍照后的图片
                /*try {
                    Bitmap bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(mImageUri));
                    img.setImageBitmap(bitmap);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }*/

                //拍照后的图片上传
                //uploadFile(mFile);
            } else if (requestCode == ALBUM_CODE) {//相册

                //获取到相册选中后的图片URI路径
                Uri imageUri = data.getData();

                //显示相册选中后的图片
                /*try {
                    Bitmap bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri));
                    img.setImageBitmap(bitmap);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }*/

                //文件上传，将Uri路径转换为File对象
                //处理uri,7.0以后的fileProvider 把URI 以content provider 方式 对外提供的解析方法
                File file = getFileFromUri(imageUri, this);

                if (file.exists()) {
                    uploadFile(file);
                }
            }
            showLoading();
        }
    }

    public File getFileFromUri(Uri uri, Context context) {
        if (uri == null) {
            return null;
        }
        switch (uri.getScheme()) {
            case "content":
                return getFileFromContentUri(uri, context);
            case "file":
                return new File(uri.getPath());
            default:
                return null;
        }
    }

    /**
     * 通过内容解析中查询uri中的文件路径
     */
    private File getFileFromContentUri(Uri contentUri, Context context) {
        if (contentUri == null) {
            return null;
        }
        File file = null;
        String filePath;
        String[] filePathColumn = {MediaStore.MediaColumns.DATA};
        ContentResolver contentResolver = getContentResolver();
        Cursor cursor = contentResolver.query(contentUri, filePathColumn, null,
                null, null);
        if (cursor != null) {
            cursor.moveToFirst();
            filePath = cursor.getString(cursor.getColumnIndex(filePathColumn[0]));
            cursor.close();

            if (!TextUtils.isEmpty(filePath)) {
                file = new File(filePath);
            }
        }
        return file;
    }


    //上传
    private void uploadFile(File mFile) {

       /* String url = "http://yun918.cn/study/public/file_upload.php";

        OkHttpClient client = new OkHttpClient.Builder()
                .build();

        //  file-->RequestBody
        RequestBody requestBody = RequestBody.create(MediaType.parse("image/jpg"), mFile);

        // 创建多媒体 请求对象
        MultipartBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("key", "H1808C")
                .addFormDataPart("file", mFile.getName(), requestBody)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        Call call = client.newCall(request);

        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e(TAG, "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Gson gson = new Gson();
                final UpLoadBean upLoadBean = gson.fromJson(string, UpLoadBean.class);

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (upLoadBean != null) {
                            if (upLoadBean.getCode() == 200) {
                                Toast.makeText(HeadActivity.this, upLoadBean.getRes(), Toast.LENGTH_SHORT).show();

                                //返回的文件位置
                                String url1 = upLoadBean.getData().getUrl();
                                SpUtil.setParam(Constants.PHOTO, url1);
                                //上传到伴米接口
                                mPresenter.outData();

                                ImageLoader.setImage(HeadActivity.this,url1,mImgHead,R.mipmap.ee);

                                hideLoading();
                                mTv.setVisibility(GridView.VISIBLE);
                                mImgPopup.setVisibility(GridView.GONE);
                                Log.e(TAG, "run: " + upLoadBean.getData().getUrl());
                            } else {
                                Toast.makeText(HeadActivity.this, upLoadBean.getRes(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                });
            }
        });*/
    }

}
