/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtime;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
@Named(value = "webTimeBean")
@Dependent
public class WebTimeBean {
    // return the time on the server at which the request was received
    public String getTime()
    {
        return DateFormat.getTimeInstance(DateFormat.LONG).format(
        new Date());
    }
    
}
