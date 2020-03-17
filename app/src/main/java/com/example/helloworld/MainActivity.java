package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CanBo dsCB[] = new CanBo[5];
        dsCB[0] = new CongNhan("Trọng Văn",18,"Nam","Hải An - Hải Phòng", 5,"Tốt");
        dsCB[1] = new KySu("Huy Hùng",21,"Nam","Thủy Nguyên - Hải Phòng","CNTT","Iltes 8.0, CCNA");
        dsCB[2] = new CanBo("Vũ The",22,"Nữ","Lê Chân - Hải Phòng");
        dsCB[3] = new CongNhan("Đỗ Đức",31,"Nam","Hải Hậu - Nam Định",8,"Ho, khó thở, sốt cao");
        dsCB[4] = new NhanVien("Khắc Phú",53,"Nam","Long Biên - Hà Nội","Trưởng thôn",12);

        Log.e(TAG,"--------------DANH SÁCH CÁN BỘ------------");
        for(int i = 0;i<dsCB.length;i++){
            Log.e(TAG,"||||----Cán bộ thứ " + (i+1) + " ---------");
            dsCB[i].display();
            Log.e(TAG,"------------------------------------------");
        }

        String nameTS = "Trọng Văn";

        Log.e(TAG,"Cán bộ có tên " + nameTS + " có thông tin dưới đây !!");
        for(int i = 0;i<dsCB.length;i++){
            if(dsCB[i].getName() == nameTS){
                dsCB[i].display();
                Log.e(TAG,"----------------------------------");
            }
        }


        setContentView(R.layout.activity_main);
    }
}
