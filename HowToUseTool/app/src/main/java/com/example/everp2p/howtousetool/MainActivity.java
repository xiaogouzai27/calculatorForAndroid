package com.example.everp2p.howtousetool;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

//导入页面中写的Button、EditText、TextView、AlerDialog
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    private EditText num1;        //创建EditText对象num1
    private EditText num2;        //创建EditText对象num2
    private int result;           //定义result为int类型
    private TextView resultView;  // 创建TextView对象resultView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        resultView = (TextView) findViewById(R.id.fortuneText);  //findViewById() 根据id获取视图，获取页面中id为fortuneText的控件
        resultView.setText(String.valueOf(result));              //setText()给resultView设置值得方法，String.valueOf(result)返回result的字符串表示形式
        num1 = (EditText) findViewById(R.id.num1);               //获取页面中id为num1的控件
        num2 = (EditText) findViewById(R.id.num2);               //获取页面中id为num2的控件
    }
    //加法
    public void addFunc(View view){
        //System.out.println(1);
        //getText()获取num1值得方法，String.valueOf(num1.getText())返回num1的字符串表示形式，equals("")判断num1值是否为空，即未输入
        if (String.valueOf(num1.getText()).equals("") || String.valueOf(num2.getText()).equals("")){
            //弹窗
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("警告").setMessage("输入不能为空，请重新输入！！！！")
                    .setPositiveButton("确定",null).show();
        }else {
            //Integer.paseInt()
            result = Integer.parseInt(String.valueOf(num1.getText())) + Integer.parseInt(String.valueOf(num2.getText()));
            resultView.setText(String.valueOf(result));
        }
    }
    //减法
    public void subFunc(View view){
        if (String.valueOf(num1.getText()).equals("") || String.valueOf(num2.getText()).equals("")){
            //弹窗
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("警告").setMessage("输入不能为空，请重新输入！！！！")
                    .setPositiveButton("确定",null).show();
        }else {
            //Integer.paseInt()
            result = Integer.parseInt(String.valueOf(num1.getText())) - Integer.parseInt(String.valueOf(num2.getText()));
            resultView.setText(String.valueOf(result));
        }
    }
    //乘法
    public void mulFunc(View view){
        if (String.valueOf(num1.getText()).equals("") || String.valueOf(num2.getText()).equals("")){
            //弹窗
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("警告").setMessage("输入不能为空，请重新输入！！！！")
                    .setPositiveButton("确定",null).show();
        }else {
            //Integer.paseInt()
            result = Integer.parseInt(String.valueOf(num1.getText())) * Integer.parseInt(String.valueOf(num2.getText()));
            resultView.setText(String.valueOf(result));
        }
    }
    //除法
    public void divFunc(View view){
        if (String.valueOf(num1.getText()).equals("") || String.valueOf(num2.getText()).equals("")){
            //弹窗
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("警告").setMessage("输入不能为空，请重新输入！！！！")
                    .setPositiveButton("确定",null).show();
        }else {
            if (String.valueOf(num2.getText()).equals("0")){
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("警告").setMessage("除数不能为0，请重新输入！！！！")
                        .setPositiveButton("确定",null).show();
            }else {
                //Integer.paseInt()
                result = Integer.parseInt(String.valueOf(num1.getText())) / Integer.parseInt(String.valueOf(num2.getText()));
                resultView.setText(String.valueOf(result));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
