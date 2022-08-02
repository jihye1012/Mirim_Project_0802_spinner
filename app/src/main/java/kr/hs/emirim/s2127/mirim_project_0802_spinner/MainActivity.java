package kr.hs.emirim.s2127.mirim_project_0802_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    int[] posterId={R.drawable.movieposter01,R.drawable.movieposter02,R.drawable.movieposter03,R.drawable.movieposter09,
            R.drawable.movieposter05,R.drawable.movieposter06,R.drawable.movieposter07,R.drawable.movieposter08,R.drawable.movieposter11,R.drawable.movieposter12,};
    String[] items={  "꽃의 하늘 떡잎 학원", "금창용사", "핸더랜드의 대모험", "B급 음식 서바이벌", "신혼여행 허리케인",
            "온천 부글부글 대작전", "노래하는 엉덩이 폭탄", "부리부리 왕국의 숨겨진 보물", "흑부리 마왕의 야망", "액션가면 VS 그래그래 마왕"};
    ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgv=findViewById(R.id.imgv);
        Spinner spinner= findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,items);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                imgv.setImageResource(posterId[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}