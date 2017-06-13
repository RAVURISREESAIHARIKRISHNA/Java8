package powerfulcalculator;

import static java.lang.System.exit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorController
{
    @FXML
    private Label Display;
    private String Infix;
    private String Postfix;
    private String Answer;
    private int Infix_status = 0;
    private int Postfix_status=0;
    private int Answer_status=0;
    private int open_bra=0;
    private int close_bra=0;
    
    public boolean isOperator(char ch)
    {
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^')
        {
            return true;
        }
        return false;
    }
    
    public void LabelDisplay(String data)
    {
        Display.setText(data);
    }
    public void one()
    {
        if(Infix_status==0)//No Data
        {
            Infix = "1";
            Infix_status=1;//Valid Data Set
            return;
        }
        if(Infix_status==1)
        {
            Infix = Infix+"1";
            
        }
    }
    public void two()
    {
        if(Infix_status==0)
        {
            Infix="2";
            Infix_status=1;
            return;
        }
        if(Infix_status==1)
        {
            Infix=Infix+"2";
        }
    }
    public void three()
    {
        if(Infix_status==0){
            Infix="3";
            Infix_status=1;
            return;
        }
        if(Infix_status==1){
            Infix = Infix+"3";
        }
    }
    public void four(){
        if(Infix_status==0){
            Infix="4";
            Infix_status=1;
            return;
        }
        if(Infix_status==1){
            Infix=Infix+"4";
        }
    }
    public void five(){
        if(Infix_status==0){
            Infix="5";
            Infix_status=1;
            return;
        }
        if(Infix_status==1){
            Infix=Infix+"5";
        }
    }
    public void six(){
        if(Infix_status==0){
            Infix="6";
            Infix_status=1;
            return;
        }
        if(Infix_status==1){
            Infix=Infix+"6";
        }
    }
    public void seven(){
        if(Infix_status==0){
            Infix="7";
            Infix_status=1;
            return;
        }
        if(Infix_status==1){
            Infix=Infix+"7";
        }
    }
    public void eight(){
        if(Infix_status==0){
            Infix="8";
            Infix_status=1;
            return;
        }
        if(Infix_status==1){
            Infix=Infix+"8";
        }
    }
    public void nine(){
        if(Infix_status==0){
            Infix="9";
            Infix_status=1;
            return;
        }
        if(Infix_status==1){
            Infix=Infix+"9";
        }
    }
    public void zero(){
        if(Infix_status==0){
            Infix="0";
            Infix_status=1;
            return;
        }
        if(Infix_status==1){
            Infix=Infix+"0";
        }
    }
    
    public void dot(){
        if(Infix_status==0){
            Infix=".";
            Infix_status=1;
            return;
        }
        if(Infix_status==1){
            Infix=Infix+".";
        }
    }
    
    public void open_brack(){
        if(Infix_status==0){
            Infix="(";
            open_bra++;
            Infix_status=1;
            return;
        }
        if(Infix_status==1){
            Infix=Infix+"(";
            open_bra++;
        }
    }
    public void close_brack(){
        if(Infix_status==0){
            return;
        }
        if(Infix_status==1){
            Infix=Infix+")";
            close_bra++;
        }
    }
    
    public void mul(){
        if(Answer_status ==1){
            Infix = Answer+"*";
            Infix_status=1;
            return;
        }
        if(Infix_status==0){
            return;
        }
        if(Infix_status==1){
            if(isOperator(Infix.charAt(Infix.length()-1))){
                Infix = Infix.substring(0,Infix.length()-1)+"*";
            }
            else{
                Infix=Infix+"*";
            }
        }
    }
    public void div(){
        if(Answer_status ==1){
            Infix = Answer+"/";
            Infix_status=1;
            return;
        }
        if(Infix_status==0){
            return;
        }
        if(Infix_status==1){
            if(isOperator(Infix.charAt(Infix.length()-1))){
                Infix = Infix.substring(0,Infix.length()-1)+"/";
            }
            else{
                Infix=Infix+"/";
            }
        }
    }
    public void minus(){
        if(Answer_status ==1){
            Infix = Answer+"-";
            Infix_status=1;
            return;
        }
        if(Infix_status==0){
            Infix="-";
            Infix_status=1;
            return;
        }
        if(Infix_status==1){
            if(isOperator(Infix.charAt(Infix.length()-1))){
                Infix = Infix.substring(0,Infix.length()-1)+"-";
            }
            else{
                Infix=Infix+"-";
            }
        }
    }
    public void plus(){
        if(Answer_status ==1){
            Infix = Answer+"+";
            Infix_status=1;
            return;
        }
        if(Infix_status==0){
            return;
        }
        if(Infix_status==1){
           if(isOperator(Infix.charAt(Infix.length()-1))){
                Infix = Infix.substring(0,Infix.length()-1)+"+";
            }
            else{
                Infix=Infix+"+";
            }
        }
    }
    
    public void mod(){
        if(Infix_status==0){
            return;
        }
        if(Infix_status==1){
            if(isOperator(Infix.charAt(Infix.length()-1))){
                Infix = Infix.substring(0,Infix.length()-1)+"%";
            }
            else{
                Infix=Infix+"%";
            }
        }
    }
    
    public void pow(){
        if(Infix_status==0){
            return;
        }
        if(Infix_status==1){
            if(isOperator(Infix.charAt(Infix.length()-1))){
                Infix = Infix.substring(0,Infix.length()-1)+"^";
            }
            else{
                Infix=Infix+"^";
            }
        }
    }
    
    public void clear(){
        Infix = null;
        Postfix = null;
        Answer = null;
        Infix_status=0;
        Postfix_status=0;
        Answer_status=0;
        open_bra=0;
        close_bra=0;
    }
    
    public void Del(){
        if(Infix_status==1&&Infix.length()-1>=0)
        {
            if(Infix.charAt(Infix.length()-1)=='(')
            {
                open_bra--;
            }
            if(Infix.charAt(Infix.length()-1)==')')
            {
                close_bra--;
            }
            Infix = Infix.substring(0,Infix.length()-1);
            //LabelDispla();
        }
    }
    
    public void equal()
    {
        if(open_bra!=close_bra)
        {
            LabelDisplay("Error");
            try
            {
                Thread.sleep(400);
            } catch (InterruptedException ex)
            {
                System.out.println("Interrupted Exception");
                exit(0);
            }
            LabelDisplay(Infix);
            return;
        }
        if(open_bra==close_bra)
        {
            /*
            {
                In Function PostFix will be Stored and Postfix_status =1;
            Infix = null;Infix_status=0;Answer=null;Answer_status=0;
            }
            
            {
                PostFix Evaluation....
                String(Posfix Evaluation ) --> Answer & Answer_status=1;
            }
            */
        }
    }
}
