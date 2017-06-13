package basicguidemo;

import static java.lang.System.exit;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController
{

    @FXML
    private Label Display;
    private String number;
    private int count = 0;
    private double operand1;
    private double operand2;
    private int operandstatus = 1;
    private char op;

    public String Calculate()
    {
        String ans = null;
        double result;
        switch (op)
        {
            case '+':
                result = (double) operand1 + operand2;
                ans = String.valueOf(result);
                break;
            case '-':
                result = (double) operand1 - operand2;
                ans = String.valueOf(result);
                break;
            case '*':
                result = (double) operand1 * operand2;
                ans = String.valueOf(result);
                break;
            case '/':
                result = (double) operand1 / operand2;
                ans = String.valueOf(result);
                break;
            case '%':
                result = (double) operand1 % operand2;
                ans = String.valueOf(result);
                break;

        }
        op = '\0';
        return ans;
    }

    public void LabelDisplay()
    {
        Display.setText(number);
    }

    public void LabelDisplay(String data)
    {
        Display.setText(data);
    }

    public void storeOperand()
    {
        if (operandstatus == 1)
        {
            operand1 = Double.parseDouble(number);
            operandstatus = 2;
            return;
        }
        if (operandstatus == 2)
        {
            operand2 = Double.parseDouble(number);
            operandstatus = 1;
        }
    }

    public void one()
    {
        if (count == 0)
        {
            number = "1";
            count = 1;
        } else
        {
            number = number + "1";
        }
        LabelDisplay();
    }

    public void two()
    {
        if (count == 0)
        {
            number = "2";
            count = 1;
        } else
        {
            number = number + "2";
        }
        LabelDisplay();

    }

    public void three()
    {
        if (count == 0)
        {
            number = "3";
            count = 1;
        } else
        {
            number = number + "3";
        }
        LabelDisplay();

    }

    public void four()
    {
        if (count == 0)
        {
            number = "4";
            count = 1;
        } else
        {
            number = number + "4";
        }
        LabelDisplay();
    }

    public void five()
    {
        if (count == 0)
        {
            number = "5";
            count = 1;
        } else
        {
            number = number + "5";
        }
        LabelDisplay();
    }

    public void six()
    {
        if (count == 0)
        {
            number = "6";
            count = 1;
        } else
        {
            number = number + "6";
        }
        LabelDisplay();
    }

    public void seven()
    {
        if (count == 0)
        {
            number = "7";
            count = 1;
        } else
        {
            number = number + "7";
        }
        LabelDisplay();
    }

    public void eight()
    {
        if (count == 0)
        {
            number = "8";
            count = 1;
        } else
        {
            number = number + "8";
        }
        LabelDisplay();
    }

    public void nine()
    {
        if (count == 0)
        {
            number = "9";
            count = 1;
        } else
        {
            number = number + "9";
        }
        LabelDisplay();
    }

    public void zero()
    {
        if (count == 0)
        {
            number = "0";
            count = 1;
        } else
        {
            number = number + "0";
        }
        LabelDisplay();
    }

    public void plus()
    {
        Display.setText("+");
        storeOperand();
        op = '+';
        number = "";
        count = 0;

    }

    public void minus()
    {
        Display.setText("-");
        storeOperand();
        op = '-';
        number = "";
        count = 0;
    }

    public void mul()
    {
        Display.setText("*");
        storeOperand();
        op = '*';
        number = "";
        count = 0;
    }

    public void div()
    {
        Display.setText("/");
        storeOperand();
        op = '/';
        number = "";
        count = 0;
    }

    public void dot()
    {
        Display.setText(".");
        if (count == 0)
        {
            number = ".";
            count = 1;
        } else
        {
            number = number + ".";
        }
        LabelDisplay();
    }

    public void Exit()
    {
        exit(0);
    }

    public void equal()
    {
        storeOperand();
        LabelDisplay(Calculate());
        number = "";
        count = 0;
        operand1 = operand2 = 0;
    }

    public void Del()
    {
        if (count == 1 && number.length() - 1 >= 0)
        {
            number = number.substring(0, number.length() - 1);
            LabelDisplay();
        }
    }

    public void clear()
    {
        number = null;
        count = 0;
        LabelDisplay("");
    }

    public void mod()
    {
        Display.setText("%");
        storeOperand();
        op = '%';
        number = "";
        count = 0;
    }

}
