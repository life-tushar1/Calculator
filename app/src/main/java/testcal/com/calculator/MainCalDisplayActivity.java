package testcal.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainCalDisplayActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bm,bs,be,bd,bc,bdel,bdot;
    EditText edt2;
    TextView edt1;
    float v1,v2;
    boolean add=false,mult=false,sub=false,div=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cal_display);
        b0=(Button)findViewById(R.id.Zero);
        b1=(Button)findViewById(R.id.One);
        b2=(Button)findViewById(R.id.Two);
        b3=(Button)findViewById(R.id.Three);
        b4=(Button)findViewById(R.id.Four);
        b5=(Button)findViewById(R.id.Five);
        b6=(Button)findViewById(R.id.Six);
        b7=(Button)findViewById(R.id.Seven);
        b8=(Button)findViewById(R.id.Eight);
        b9=(Button)findViewById(R.id.Nine);
        bp=(Button)findViewById(R.id.Add);
        bm=(Button)findViewById(R.id.Multiply);
        bs=(Button)findViewById(R.id.Substract);
        be=(Button)findViewById(R.id.Equal);
        bd=(Button)findViewById(R.id.Divide);
        bc=(Button)findViewById(R.id.Cancel);
        edt1=(TextView)findViewById(R.id.view);
        bdot=(Button)findViewById(R.id.Dot);
        edt2=(EditText)findViewById(R.id.text);
        bdel=(Button)findViewById(R.id.Del);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+".");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                edt2.setText("");
                v1=0;
                v2=0;
                mult=false;sub=false;add=false;div=false;
            }
        });
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=edt1.getText()+"";
                if(str!=""){
                str=str.substring(0,str.length()-1);
                edt1.setText(str);}
            }
        });
        bp.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                       if(add==true)
                       {
                           float temp=Float.parseFloat(edt1.getText()+"");
                           v1=v1+temp;
                           edt1.setText(null);
                           add=true;
                       }
                       else if(mult==true)
                       {
                           float temp=Float.parseFloat(edt1.getText()+"");
                           v1=v1*temp;
                           edt1.setText(null);
                           mult=false;
                           add=true;
                       }
                       else if(div ==true)
                       {
                           float temp=Float.parseFloat(edt1.getText()+"");
                           v1=v1/temp;
                           edt1.setText(null);
                           div=false;
                           add=true;
                       }
                       else if(sub==true)
                       {
                           float temp=Float.parseFloat(edt1.getText()+"");
                           v1=v1-temp;
                           edt1.setText(null);
                           sub=false;
                           add=true;
                       }
                       else if(edt1.getText()=="")
                       {

                       }

                    else {
                        v1 = Float.parseFloat(edt1.getText() + "");
                        add = true;
                     edt1.setText(null);
                    }

            }
        });

        bs.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                        if(add==true)
                        {
                            float temp=Float.parseFloat(edt1.getText()+"");
                            v1=v1+temp;
                            edt1.setText(null);
                            add=false;
                            sub=true;
                        }
                        else if(mult==true)
                        {
                            float temp=Float.parseFloat(edt1.getText()+"");
                            v1=v1*temp;
                            edt1.setText(null);
                            mult=false;
                            sub=true;
                        }
                        else if(div ==true)
                        {
                            float temp=Float.parseFloat(edt1.getText()+"");
                            v1=v1/temp;
                            edt1.setText(null);
                            div=false;
                            sub=true;
                        }
                        else if(sub==true)
                        {
                            float temp=Float.parseFloat(edt1.getText()+"");
                            v1=v1-temp;
                            sub=true;
                            edt1.setText(null);
                        }
                        else if(edt1.getText()=="")
                        {

                        }

                    else {
                        v1 = Float.parseFloat(edt1.getText() + "");
                        sub = true;
                        edt1.setText(null);
                    }

                }

        });

        bm.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                        if(add==true)
                        {
                            float temp=Float.parseFloat(edt1.getText()+"");
                            v1=v1+temp;
                            add=false;
                            mult=true;
                            edt1.setText(null);
                        }
                        else if(mult==true)
                        {
                            float temp=Float.parseFloat(edt1.getText()+"");
                            v1=v1*temp;
                            mult=true;
                            edt1.setText(null);
                        }
                        else if(div ==true)
                        {
                            float temp=Float.parseFloat(edt1.getText()+"");
                            v1=v1/temp;
                            div=false;
                            mult=true;edt1.setText(null);
                        }
                        else if(sub==true)
                        {
                            float temp=Float.parseFloat(edt1.getText()+"");
                            v1=v1-temp;
                            sub=false;
                            mult=true;edt1.setText(null);
                        }
                        else if(edt1.getText()=="")
                        {

                        }

                    else {
                        v1 = Float.parseFloat(edt1.getText() + "");
                        mult = true;edt1.setText(null);
                    }



        }});

        bd.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                        if(add==true)
                        {
                            float temp=Float.parseFloat(edt1.getText()+"");
                            v1=v1+temp;
                            add=false;
                            div=true;edt1.setText(null);
                        }
                        else if(mult==true)
                        {
                            float temp=Float.parseFloat(edt1.getText()+"");
                            v1=v1*temp;
                            mult=false;
                            div=true;edt1.setText(null);
                        }
                        else if(div ==true)
                        {
                            float temp=Float.parseFloat(edt1.getText()+"");
                            v1=v1/temp;

                            edt1.setText(null);div=true;
                        }
                        else if(sub==true)
                        {
                            float temp=Float.parseFloat(edt1.getText()+"");
                            v1=v1-temp;
                            sub=false;
                            div=true;edt1.setText(null);
                        }
                        else if(edt1.getText()=="")
                        {

                        }

                    else {
                        v1 = Float.parseFloat(edt1.getText() + "");
                        div = true;edt1.setText(null);
                    }


            }
        });
        be.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(add==true)
                {
                    float temp=Float.parseFloat(edt1.getText()+"");
                    v1=v1+temp;
                    add=false;
                    edt2.setText(null);
                    edt2.setText(v1+"");
                }
                else if(mult==true)
                {
                    float temp=Float.parseFloat(edt1.getText()+"");
                    v1=v1*temp;
                    mult=false;
                    edt2.setText(null);
                    edt2.setText(v1+"");
                }
                else if(div ==true)
                {
                    float temp=Float.parseFloat(edt1.getText()+"");
                    v1=v1/temp;
                    div=false;
                    edt2.setText(null);
                    edt2.setText(v1+"");
                }
                else if(sub==true)
                {
                    float temp=Float.parseFloat(edt1.getText()+"");
                    v1=v1-temp;
                    sub=false;
                    edt2.setText(null);
                    edt2.setText(v1+"");
                }
                else
                {
                    edt2.setText(edt1.getText());
                }
            }
        });



    }

}
