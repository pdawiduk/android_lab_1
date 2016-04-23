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

public class AdvancedActivity extends AppCompatActivity {
    private float syntA = 0;
    private static final String LOG_TAG = AdvancedActivity.class.getSimpleName();
    private float syntB = 0;
    private double result = 0;
    private StringBuilder mathText = new StringBuilder();
    private int action = NOTHING;

    private static View view;
    final private static int NOTHING = 0;
    final private static int PLUS = 1;
    final private static int MINUS = 2;
    final private static int DIVORCED = 3;
    final private static int MULTIPLE = 4;
    final private static int POW2 = 5;
    final private static int SQRT = 6;
    final private static int POW_Y = 7;
    final private static int SIN = 8;
    final private static int COS = 9;
    final private static int TAN = 10;
    final private static int LN = 11;
    final private static int LOG = 12;
    private static boolean dotPressed = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
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
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public void onResume() {
        super.onResume();


        final TextView resultView = (TextView) findViewById(R.id.result_view);

        Button b0 = (Button) findViewById(R.id.b0);
        if (b0 != null) {
            b0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mathText.append("0");

                    resultView.setText(mathText);
                }
            });
        }
        Button b1 = (Button) findViewById(R.id.b1);
        if (b1 != null) {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append("1");
                    resultView.setText(mathText);
                }
            });
        }
        Button b2 = (Button) findViewById(R.id.b2);

        if (b2 != null) {
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append("2");
                    resultView.setText(mathText);
                }
            });
        }
        Button b3 = (Button) findViewById(R.id.b3);
        if (b3 != null) {
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append("3");
                    resultView.setText(mathText);
                }
            });
        }
        Button b4 = (Button) findViewById(R.id.b4);
        if (b4 != null) {
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append("4");
                    resultView.setText(mathText);
                }
            });
        }
        Button b5 = (Button) findViewById(R.id.b5);
        if (b5 != null) {
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append("5");
                    resultView.setText(mathText);
                }
            });
        }
        Button b6 = (Button) findViewById(R.id.b6);
        if (b6 != null) {
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append("6");
                    resultView.setText(mathText);
                }
            });
        }
        Button b7 = (Button) findViewById(R.id.b7);
        if (b7 != null) {
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append("7");
                    resultView.setText(mathText);
                }
            });
        }
        Button b8 = (Button) findViewById(R.id.b8);
        if (b8 != null) {
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append("8");
                    resultView.setText(mathText);
                }
            });
        }
        Button b9 = (Button) findViewById(R.id.b9);
        if (b9 != null) {
            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mathText.append("9");
                    resultView.setText(mathText);
                }
            });
        }

        Button bplus = (Button) findViewById(R.id.bplus);
        if (bplus != null) {
            bplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        syntA = Float.parseFloat(mathText.toString());
                    } catch (Exception e) {
                        syntA = 0;
                    }
                    mathText.delete(0, mathText.length());
                    resultView.setText(mathText);
                    action = PLUS;

                }
            });
        }

        Button bminus = (Button) findViewById(R.id.bminus);
        if (bminus != null) {
            bminus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        syntA = Float.parseFloat(mathText.toString());
                    } catch (Exception e) {
                        syntA = 0;
                    }
                    action = MINUS;
                    mathText.delete(0, mathText.length());
                    resultView.setText(mathText);
                }
            });
        }
        Button bdiv = (Button) findViewById(R.id.bdiv);
        if (bdiv != null) {
            bdiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        syntA = Float.parseFloat(mathText.toString());
                    } catch (Exception e) {
                        syntA = 0;
                    }
                    action = DIVORCED;
                    mathText.delete(0, mathText.length());
                    resultView.setText(mathText);
                }
            });
        }
        Button bexp = (Button) findViewById(R.id.bmult);
        if (bexp != null) {
            bexp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        syntA = Float.parseFloat(mathText.toString());
                    } catch (Exception e) {
                        syntA = 0;
                    }
                    action = MULTIPLE;
                    mathText.delete(0, mathText.length());
                    resultView.setText(mathText);
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

        Button bSin = (Button) findViewById(R.id.b_sin);
        bSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action = SIN;
                double tmp = new Float(mathText.toString());
                double radians = Math.toRadians(tmp);
                result = Math.sin(radians);
                resultView.setText(Double.toString(result));
            }
        });

        Button bcos = (Button) findViewById(R.id.b_cos);
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action = COS;
                double tmp = new Float(mathText.toString());
                double radians = Math.toRadians(tmp);
                result = Math.cos(radians);
                resultView.setText(Double.toString(result));

            }
        });
        Button btan = (Button) findViewById(R.id.b_tan);
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action = TAN;
                double tmp = new Float(mathText.toString());
                double radians = Math.toRadians(tmp);
                result = Math.tan(radians);
                resultView.setText(Double.toString(result));
            }
        });
        Button bln = (Button) findViewById(R.id.b_ln);
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action = LN;
                double tmp = new Float(mathText.toString());

                result = Math.log(tmp);
                resultView.setText(Double.toString(result));
            }
        });

        Button bSqrt = (Button) findViewById(R.id.b_sqrt);
        bSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action = SQRT;
                double tmp;
                try {
                    tmp = new Float(mathText.toString());
                    result = Math.sqrt(tmp);
                } catch (Exception e) {
                    result = Math.sqrt(0);
                }
                resultView.setText(Double.toString(result));
            }
        });
        Button bX2 = (Button) findViewById(R.id.b_pow2);
        bX2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action = POW2;
                double tmp;
                try {
                    tmp = new Float(mathText.toString());
                    result = Math.pow(tmp, 2);
                } catch (Exception e) {
                    result = Math.pow(0, 2);
                }
                resultView.setText(Double.toString(result));


            }
        });
        Button bXY = (Button) findViewById(R.id.b_powy);
        bXY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    syntA = Float.parseFloat(mathText.toString());
                } catch (Exception e) {
                    syntA = 0;
                }
                action = POW_Y;
                mathText.delete(0, mathText.length());
                resultView.setText(mathText);
            }
        });
        Button bLog = (Button) findViewById(R.id.b_log);
        bLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action = LOG;
                double tmp;
                try {
                     tmp = new Float(mathText.toString());
                } catch (Exception e) {
                    result = Math.log(0);}
                    resultView.setText(Double.toString(result));


            }
        });

        Button bresult = (Button) findViewById(R.id.bresult);
        if (bresult != null) {
            bresult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i(LOG_TAG, "tutaj masz problem " + mathText.toString());

                    switch (action) {
                        case PLUS:
                            try {
                                syntB = Float.parseFloat(mathText.toString());
                            } catch (Exception e) {
                                resultView.setText("0");
                            }
                            result = syntA + syntB;
                            resultView.setText(Double.toString(result));
                            break;
                        case MINUS:
                            try {
                                syntB = Float.parseFloat(mathText.toString());
                            } catch (Exception e) {
                                resultView.setText("0");
                            }
                            result = syntA - syntB;
                            resultView.setText(Double.toString(result));
                            break;
                        case MULTIPLE:
                            try {
                                syntB = Float.parseFloat(mathText.toString());
                            } catch (Exception e) {
                                resultView.setText("0");
                            }
                            result = syntA * syntB;
                            resultView.setText(Double.toString(result));
                            break;

                        case POW_Y:
                            try {
                                syntB = Float.parseFloat(mathText.toString());
                            } catch (Exception e) {
                                resultView.setText("0");
                            }
                            result = Math.pow(syntA, syntB);
                            resultView.setText(Double.toString(result));
                            break;

                        case DIVORCED:
                            if (syntB == 0) {
                                Snackbar.make(findViewById(R.id.advanced_layout), "illegal operation", Snackbar.LENGTH_LONG).show();

                                break;
                            } else {
                                try {
                                    syntB = Float.parseFloat(mathText.toString());
                                } catch (Exception e) {
                                    resultView.setText("0");
                                }
                                result = syntA / syntB;
                                resultView.setText(Double.toString(result));
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
