
package boletin7.pkg2;

import javax.swing.JOptionPane;


public class Visualizar {
  short num1, num2;
  
public Visualizar(){    
}
public Visualizar(short num1, short num2){
    this.num1=num1;
    this.num2=num2;
}
public void pedir(){
    String respuesta= JOptionPane.showInputDialog("introduzca numero 1");
    num1= Short.parseShort(respuesta);
    
    String respuesta2= JOptionPane.showInputDialog("introduzca numero 2");
    num2= Short.parseShort(respuesta2);

}
public void operacion(){
    if (num1>=num2){
        JOptionPane.showMessageDialog(null,"la resta es:"+(num1-num2));
    }else if (num1<num2){
        JOptionPane.showMessageDialog(null,"la suma es: " +(num1+num2));
    }
    
    
}
}
