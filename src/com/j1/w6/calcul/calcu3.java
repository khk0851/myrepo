
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class calcu3 extends JFrame { 
   private final JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0; 
   private final JButton plusBtn, minusBtn, multiplyBtn, divideBtn, solveBtn; 
   private JTextField resultField; 
   private double value1, value2; 
   Boolean Plus = false; 
   Boolean minus = false; 
   Boolean div = false; 
   Boolean mul = false; 
   String display = ""; 
   public calcu3() { 
      JPanel numpan = new JPanel(); 
      numpan.setLayout(new GridLayout(4, 3)); 
      numpan.add(num1 = new JButton("1")); 
      numpan.add(num2 = new JButton("2")); 
      numpan.add(num3 = new JButton("3")); 
      numpan.add(num4 = new JButton("4")); 
      numpan.add(num5 = new JButton("5")); 
      numpan.add(num6 = new JButton("6")); 
      numpan.add(num7 = new JButton("7")); 
      numpan.add(num8 = new JButton("8")); 
      numpan.add(num9 = new JButton("9")); 
      numpan.add(num0 = new JButton("0")); 
      
      JPanel resP = new JPanel(); 
      resP.setLayout(new FlowLayout()); 
      resP.add(resultField = new JTextField(16)); 
      resultField.setHorizontalAlignment(JTextField.RIGHT); 
      resultField.setEditable(false); 
      JPanel operater = new JPanel(); 
      operater.setLayout(new GridLayout(2, 3)); 
      operater.add(plusBtn = new JButton("+")); 
      operater.add(minusBtn = new JButton("-")); 
      operater.add(multiplyBtn = new JButton("*")); 
      operater.add(divideBtn = new JButton("/")); 
      operater.add(solveBtn = new JButton("=")); 

      JPanel panel = new JPanel(); 
      getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS)); 
      getContentPane().add(resP); 
      getContentPane().add(numpan); 
      getContentPane().add(operater); 
      add(panel); 
      num1.addActionListener(new ListenToOne()); 
      num2.addActionListener(new ListenToTwo()); 
      num3.addActionListener(new ListenToThree()); 
      num4.addActionListener(new ListenToFour()); 
      num5.addActionListener(new ListenToFive()); 
      num6.addActionListener(new ListenToSix()); 
      num7.addActionListener(new ListenToSeven()); 
      num8.addActionListener(new ListenToEight()); 
      num9.addActionListener(new ListenToNine()); 
      num0.addActionListener(new ListenToZero()); 
      plusBtn.addActionListener(new ListenToAdd()); 
      minusBtn.addActionListener(new ListenToSubtract()); 
      multiplyBtn.addActionListener(new ListenToMultiply()); 
      divideBtn.addActionListener(new ListenToDivide()); 
      solveBtn.addActionListener(new ListenToSolve()); 
   } 

   class ListenToOne implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         display = resultField.getText(); 
         resultField.setText(display + "1"); 
      } 
   } 
   class ListenToTwo implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         display = resultField.getText(); 
         resultField.setText(display + "2"); 
      } 
   } 
   class ListenToThree implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         display = resultField.getText(); 
         resultField.setText(display + "3"); 
      } 
   } 
   class ListenToFour implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         display = resultField.getText(); 
         resultField.setText(display + "4"); 
      } 
   } 
   class ListenToFive implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         display = resultField.getText(); 
         resultField.setText(display + "5"); 
      } 
   } 
   class ListenToSix implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         display = resultField.getText(); 
         resultField.setText(display + "6"); 
      } 
   } 
   class ListenToSeven implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         display = resultField.getText(); 
         resultField.setText(display + "7"); 
      } 
   } 
   class ListenToEight implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         display = resultField.getText(); 
         resultField.setText(display + "8"); 
      } 
   } 
   class ListenToNine implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         display = resultField.getText(); 
         resultField.setText(display + "9"); 
      } 
   } 
   class ListenToZero implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         display = resultField.getText(); 
         resultField.setText(display + "0"); 
      } 
   } 
   class ListenToAdd implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         value1 = Double.parseDouble(resultField.getText()); 
         resultField.setText(""); 
         Plus = true; 
      } 
   } 
   class ListenToSubtract implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         value1 = Double.parseDouble(resultField.getText()); 
         resultField.setText(""); 
         minus = true; 
      } 
   } 
   class ListenToMultiply implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         value1 = Double.parseDouble(resultField.getText()); 
         resultField.setText(""); 
         mul = true; 
      } 
   } 
   class ListenToDivide implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         value1 = Double.parseDouble(resultField.getText()); 
         resultField.setText(""); 
         div = true; 
      } 
   } 
   class ListenToSolve implements ActionListener { 
      @Override 
      public void actionPerformed(ActionEvent e) { 
         value2 = Double.parseDouble(resultField.getText()); 
         if (Plus == true) { 
            value2 = value2 + value1; 
            } else if (minus == true) { 
            value2 = value2 - value1; 
            } else if (mul == true) { 
            value2 = value2 * value1; 
            } else if (div == true) { 
            value2 = value2 / value1; 
         } 
         resultField.setText(Double.toString(value2)); 
         Plus = false; 
         minus = false; 
         mul = false; 
         div = false; 
      } 
   } 
   public static void main(String[] args) { 
      calcu3 calc = new calcu3(); 
      calc.pack(); 
      calc.setLocationRelativeTo(null); 
      calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      calc.setVisible(true); 
   } 
} 