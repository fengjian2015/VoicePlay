package com.lucksoft.luckvoice.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.lucksoft.luckvoice.lib.VoicePlay;
import com.lucksoft.luckvoice.lib.util.VoiceCons;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText et;
    private TextView tvContent;
    private CheckBox money;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.et);
        tvContent = findViewById(R.id.tvContent);
        money = findViewById(R.id.money);
        arrayList = new ArrayList();

    }

    public void add(View view){
        String s = et.getText().toString();
        arrayList.add(s);
        tvContent.append(s);
        et.setText("");
    }

    public void play(View view){
        if (arrayList.isEmpty()){
            Toast.makeText(this,"请添加播放内容",Toast.LENGTH_SHORT).show();
        }
        VoicePlay.with(this).play(arrayList,money.isChecked());
        arrayList.clear();
        et.setText("");
        tvContent.append("\n");
    }


    public void cng_(View view){
        arrayList.add(VoiceCons.CNG);
        tvContent.append("CNG");
    }

    public void lng_(View view){
        arrayList.add(VoiceCons.LNG);
        tvContent.append("LNG");
    }

    public void chaiyou_(View view){
        arrayList.add(VoiceCons.CHAIYOU);
        tvContent.append("柴油");
    }

    public void gongjin_(View view){
        arrayList.add(VoiceCons.GONGJIN);
        tvContent.append("公斤");
    }
    public void hao_(View view){
        arrayList.add(VoiceCons.HAO);
        tvContent.append("号");
    }

    public void haoqiang_(View view){
        arrayList.add(VoiceCons.HAOQIANG);
        tvContent.append("号枪");
    }

    public void jifendikou_(View view){
        arrayList.add(VoiceCons.JIFENDIKOU);
        tvContent.append("积分抵扣");
    }

    public void jin_(View view){
        arrayList.add(VoiceCons.JIN);
        tvContent.append("斤");
    }

    public void lifang_(View view){
        arrayList.add(VoiceCons.LIFANG);
        tvContent.append("立方");
    }
    public void niyouyibixindingdan_(View view){
        arrayList.add(VoiceCons.NIYOUYIBIXINDINGDAN);
        tvContent.append("你有一笔新订单");
    }
    public void qiyou_(View view){
        arrayList.add(VoiceCons.QIYOU);
        tvContent.append("汽油");
    }

    public void qingqucan_(View view){
        arrayList.add(VoiceCons.QINGQUCAN);
        tvContent.append("请取餐");
    }

    public void qingzhunbeijiucan_(View view){
        arrayList.add(VoiceCons.QINGZHUNBEIJIUCAN);
        tvContent.append("请准备就餐");
    }

    public void sheng_(View view){
        arrayList.add(VoiceCons.SHENG);
        tvContent.append("升");
    }
    public void shoukuan_(View view){
        arrayList.add(VoiceCons.SHOUKUAN);
        tvContent.append("收款");
    }
    public void shouyin_(View view){
        arrayList.add(VoiceCons.SHOUYIN);
        tvContent.append("收银");
    }

    public void weixin_(View view){
        arrayList.add(VoiceCons.WEIXIN);
        tvContent.append("微信");
    }

    public void xianjin_(View view){
        arrayList.add(VoiceCons.XIANJIN);
        tvContent.append("现金");
    }

    public void yinhangka_(View view){
        arrayList.add(VoiceCons.YINHANGKA);
        tvContent.append("银行卡");
    }
    public void youhui_(View view){
        arrayList.add(VoiceCons.YOUHUI);
        tvContent.append("优惠");
    }
    public void yue_(View view){
        arrayList.add(VoiceCons.YUE);
        tvContent.append("余额");
    }
    public void yuan_(View view){
        arrayList.add(VoiceCons.YUAN);
        tvContent.append("元");
    }
    public void zhifu_(View view){
        arrayList.add(VoiceCons.ZHIFU);
        tvContent.append("支付");
    }
    public void zhifubao_(View view){
        arrayList.add(VoiceCons.ZHIFUBAO);
        tvContent.append("支付宝");
    }
}