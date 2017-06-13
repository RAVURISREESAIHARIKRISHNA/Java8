/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloscenebuilder;

import static java.lang.System.exit;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author HARI
 */
public class MainController
{
    @FXML
    private Label MyLabel;
    public void output()
    {
        MyLabel.setText("Hello World");
    }
    public void Exit()
    {
        exit(0);
    }
    
    public void HelloJava()
    {
        MyLabel.setText("Hello Java");
    }
}
