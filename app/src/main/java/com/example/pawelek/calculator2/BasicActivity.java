package com.example.pawelek.calculator2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BasicActivity extends AppCompatActivity {

    private float syntA = 0;
    private float syntB = 0;
    private float result = 0;
    private StringBuilder mathText = new StringBuilder();

    private static View view;

    final private static int NOTHING = 0;
    final private static int PLUS = 1;
    final private static int MINUS = 2;
    final private static int DIVORCED = 3;
    final private static int MULTIPLE = 4;

    private int action = NOTHING;

    private static boolean dotPressed = false;
    private static boolean resultFlag = false;

    private void handleOperations(TextView tv) {

        try {
            if (!resultFlag) {
                this.syntA = Float.parseFloat(mathText.toString());
            } else syntA = result;

        } catch (Exception e) {
            this.syntA = 0;
        }

        mathText.delete(0, mathText.length());
        tv.setText(mathText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    private void clear(TextView tv) {
        tv.setText("");
    }

    @Override
    public void onResume() {
        super.onResume();


        final TextView resultView = (TextView) findViewById(R.id.result_view);
        resultView.setHint("0");

        Button b0 = (Button) findViewById(R.id.b0);
        if (b0 != null) {
            b0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mathText.append(getString(R.string.button_0));
                    resultView.setText(mathText);
                }
            });
        }
        Button b1 = (Button) findViewById(R.id.b1);
        if (b1 != null) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append(getString(R.string.button_1));
                    resultView.setText(mathText);
                }
            });
        }
        Button b2 = (Button) findViewById(R.id.b2);

        if (b2 != null) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append(getString(R.string.button_2));
                    resultView.setText(mathText);
                }
            });
        }
        Button b3 = (Button) findViewById(R.id.b3);
        if (b3 != null) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append(getString(R.string.button_3));
                    resultView.setText(mathText);
                }
            });
        }
        Button b4 = (Button) findViewById(R.id.b4);
        if (b4 != null) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append(getString(R.string.button_4));
                    resultView.setText(mathText);
                }
            });
        }
        Button b5 = (Button) findViewById(R.id.b5);
        if (b5 != null) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append(getString(R.string.button_5));
                    resultView.setText(mathText);
                }
            });
        }
        Button b6 = (Button) findViewById(R.id.b6);
        if (b6 != null) {
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append(getString(R.string.button_6));
                    resultView.setText(mathText);
                }
            });
        }
        Button b7 = (Button) findViewById(R.id.b7);
        if (b7 != null) {
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append(getString(R.string.button_7));
                    resultView.setText(mathText);
                }
            });
        }
        Button b8 = (Button) findViewById(R.id.b8);
        if (b8 != null) {
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append(getString(R.string.button_8));
                    resultView.setText(mathText);
                }
            });
        }
        Button b9 = (Button) findViewById(R.id.b9);
        if (b9 != null) {
            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append(getString(R.string.button_9));
                    resultView.setText(mathText);
                }
            });
        }

        Button bplus = (Button) findViewById(R.id.bplus);
        if (bplus != null) {
            bplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    handleOperations(resultView);
                    action = PLUS;

                }
            });
        }

        Button bminus = (Button) findViewById(R.id.bminus);
        if (bminus != null) {
            bminus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    handleOperations(resultView);
                    action = MINUS;

                }
            });
        }
        Button bdiv = (Button) findViewById(R.id.bdiv);
        if (bdiv != null) {
            bdiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    handleOperations(resultView);
                    action = DIVORCED;

                }


            });
        }
        Button bexp = (Button) findViewById(R.id.bmult);
        if (bexp != null) {
            bexp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    handleOperations(resultView);

                    action = MULTIPLE;

                }
            });
        }

        Button bclear = (Button) findViewById(R.id.bclear);
        if (bclear != null) {
            bclear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.delete(0, mathText.length());
                    resultView.setText(mathText);
                    resultFlag = false;
                    syntA = 0;
                    syntB = 0;
                    result = 0;
                }
            });
        }

        Button bBsp = (Button) findViewById(R.id.bbksp);
        if (bBsp != null) {
            bBsp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mathText.length() != 0) {
                        mathText.deleteCharAt(mathText.length() - 1);
                        resultView.setText(mathText);
                    }
                }
            });
        }

        Button bdot = (Button) findViewById(R.id.bdot);

        if (bdot != null) {
            bdot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (dotPressed == false) {
                        dotPressed = true;
                        mathText.append('.');
                        resultView.setText(mathText);
                    }
                }
            });
        }
        Button bresult = (Button) findViewById(R.id.bresult);
        if (bresult != null) {
            if (mathText.toString().isEmpty()) {
                syntA = 0;
            }
            bresult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    resultFlag = true;
                    switch (action) {
                        case PLUS:
                            try {
                                syntB = Float.parseFloat(mathText.toString());
                            } catch (Exception e) {
                                resultView.setText("0");
                            }
                            result = syntA + syntB;
                            syntA = result;
                            resultView.setText(Float.toString(result));
                            break;

                        case MINUS:
                            try {
                                syntB = Float.parseFloat(mathText.toString());
                            } catch (Exception e) {
                                resultView.setText("0");
                            }
                            result = syntA - syntB;
                            syntA = result;
                            resultView.setText(Float.toString(result));
                            break;

                        case MULTIPLE:
                            try {
                                syntB = Float.parseFloat(mathText.toString());
                            } catch (Exception e) {
                                resultView.setText("0");
                            }
                            result = syntA * syntB;
                            syntA = result;
                            resultView.setText(Float.toString(result));
                            break;

                        case DIVORCED:
                            try {
                                syntB = Float.parseFloat(mathText.toString());
                            } catch (Exception e) {
                                resultView.setText("0");
                            }
                            if (syntB == 0) {
                                Snackbar.make(findViewById(R.id.basic_layout), "you can't divorced 0", Snackbar.LENGTH_LONG)
                                        .setAction("Action", null).show();
                                break;
                            } else {
                                result = syntA / syntB;
                                syntA = result;
                                resultView.setText(Float.toString(result));
                            }
                            break;
                        case NOTHING:

                            if (resultView.toString().isEmpty())
                                resultView.setText("0");
                            break;
                    }

                }
            });
        }

        Button bplusminus = (Button) findViewById(R.id.plus_minus);

        bplusminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float tmp = new Float(resultView.getText().toString());
                resultView.setText(Float.toString(-1 * tmp));

            }
        });


    }
}
