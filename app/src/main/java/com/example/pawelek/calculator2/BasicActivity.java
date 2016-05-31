package com.example.pawelek.calculator2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BasicActivity extends AppCompatActivity {

    private static float syntA = 0;
    private static float syntB = 0;
    private static float result = 0;

    private static StringBuilder mathText = new StringBuilder();

    private static View view;

    final private static int NOTHING = 0;
    final private static int PLUS = 1;
    final private static int MINUS = 2;
    final private static int DIVORCED = 3;
    final private static int MULTIPLE = 4;

    private int action = NOTHING;

    private static boolean dotPressed = false;
    private static boolean resultFlag = false;

    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;

    Button bDiv;
    Button bMul;
    Button bPlus;
    Button bMin;

    Button wynik;
    Button plusMinus;
    TextView wyswietlacz;
    Button dot;

    Button bClear;
    Button bbksp;


    private void isZero() {
        String tmp = wyswietlacz.getText().toString();
        if (tmp.indexOf('0') == 0 & (tmp.length() == 1)) {

            wyswietlacz.setText("");
            mathText.delete(0, mathText.length());
        }

    }

    private boolean isDot() {
        String tmp = wyswietlacz.getText().toString();
        int indexOfDot = tmp.lastIndexOf('.');

        if (indexOfDot == -1) {
            if (tmp.isEmpty()) setAndDisplay('0');
            return true;
        } else
            return false;
    }

    private boolean canZero() {
        String tmp = wyswietlacz.getText().toString();
        if ((tmp.indexOf('0') != 0) | tmp.isEmpty()) {
            return true;
        } else return false;
    }

    private void setAndDisplay(char ch) {
        mathText.append(ch);
        wyswietlacz.setText(mathText.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        bPlus = (Button) findViewById(R.id.bplus);
        bMin = (Button) findViewById(R.id.bminus);
        bMul = (Button) findViewById(R.id.bmult);
        bDiv = (Button) findViewById(R.id.bdiv);
        wynik = (Button) findViewById(R.id.bresult);
        wyswietlacz = (TextView) findViewById(R.id.result_view);
        plusMinus = (Button) findViewById(R.id.plus_minus);
        dot = (Button) findViewById(R.id.bdot);
        bClear = (Button) findViewById(R.id.bclear);
        bbksp = (Button) findViewById(R.id.bbksp);


    }


    @Override
    public void onResume() {
        super.onResume();
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (canZero()) mathText.append('0');
                wyswietlacz.setText(mathText.toString());
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isZero();
                setAndDisplay('1');
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isZero();
                setAndDisplay('2');
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isZero();
                setAndDisplay('3');
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isZero();
                setAndDisplay('4');
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isZero();
                setAndDisplay('5');
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isZero();
                setAndDisplay('6');
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isZero();
                setAndDisplay('7');
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isZero();
                setAndDisplay('8');
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isZero();
                setAndDisplay('9');
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isDot()) setAndDisplay('.');
            }
        });
        bbksp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!wyswietlacz.getText().toString().isEmpty()) {
                    mathText.replace(0, mathText.length(), wyswietlacz.getText().toString());
                    mathText.deleteCharAt(mathText.length() - 1);
                }
                wyswietlacz.setText(mathText);
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obliczaj();

                action = DIVORCED;
                try {
                    syntA = Float.valueOf(wyswietlacz.getText().toString());
                } catch (Exception e) {
                    syntA = 0;
                }
                mathText.delete(0, mathText.length());
                wyswietlacz.setText(mathText.toString());

            }
        });


        bPlus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                obliczaj();

                action = PLUS;
                try {
                    syntA = Float.valueOf(wyswietlacz.getText().toString());
                } catch (Exception e) {
                    syntA = 0;
                }
                mathText.delete(0, mathText.length());
                wyswietlacz.setText(mathText.toString());

            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obliczaj();

                action = MULTIPLE;
                try {
                    syntA = Float.valueOf(wyswietlacz.getText().toString());
                } catch (Exception e) {
                    syntA = 0;
                }
                mathText.delete(0, mathText.length());
                wyswietlacz.setText(mathText.toString());

            }
        });

        bMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obliczaj();

                action = MINUS;
                try {
                    syntA = Float.valueOf(wyswietlacz.getText().toString());
                } catch (Exception e) {
                    syntA = 0;
                }
                mathText.delete(0, mathText.length());
                wyswietlacz.setText(mathText.toString());

            }
        });
        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wyswietlacz.setText("");
                syntA = 0;
                syntB = 0;
                result = 0;
                mathText.delete(0, mathText.length());
            }
        });

        plusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            boolean prawda = !wyswietlacz.getText().toString().equals("0");
                if (!wyswietlacz.getText().toString().equals("0")& !wyswietlacz.getText().toString().isEmpty()) {
                    Float tmp = -1 * Float.valueOf(wyswietlacz.getText().toString());
                    wyswietlacz.setText(String.valueOf(tmp));
                }
                else wyswietlacz.setText("0");
            }
        });
        wynik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obliczaj();
            }
        });
    }

    private void obliczaj() {
        try {
            syntB = Float.valueOf(wyswietlacz.getText().toString());
        } catch (Exception e) {
            syntB = 0;
        }

        switch (action) {
            case PLUS:
                mathText.delete(0, mathText.length());
                result = syntA + syntB;
                wyswietlacz.setText(String.valueOf(result));
                action = NOTHING;
                break;

            case MINUS:
                mathText.delete(0, mathText.length());
                result = syntA - syntB;
                wyswietlacz.setText(String.valueOf(result));
                action = NOTHING;
                break;

            case MULTIPLE:
                mathText.delete(0, mathText.length());
                result = syntA * syntB;
                wyswietlacz.setText(String.valueOf(result));
                action = NOTHING;
                break;

            case DIVORCED:
                if (syntB != 0) {
                    mathText.delete(0, mathText.length());
                    result = syntA / syntB;
                    wyswietlacz.setText(String.valueOf(result));
                    action = NOTHING;
                } else {
                    Snackbar.make(findViewById(R.id.basic_layout), "you can't divorced 0", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                break;

            case NOTHING :
                break;
        }
    }


}



