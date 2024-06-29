import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

public class Delete extends JFrame implements ActionListener{
    JLabel id,name,post,salary;
    JTextField i,n,p,s;
    JButton btn_search,b1;

      public Delete()
	  {
          super("Search");
          
		  id = new JLabel("Enter ID:");
          id.setBounds(280, 80, 700, 40);
          id.setFont(new Font("",Font.BOLD,30));
		  
   		  i = new JTextField(20);
          i.setBounds(560, 80, 300, 40);
		  i.setFont(new Font("",Font.BOLD,30));
          
		  btn_search = new JButton("Search");
          btn_search.setBounds(880, 80, 80, 40);
		  id.setFont(new Font("",Font.BOLD,25));
          btn_search.addActionListener(this);
          
		  setVisible(true);
          setLocationRelativeTo(null);
		  getContentPane().setBackground(Color.decode("#c3f7e2"));
          setSize(1200,700);
          
          name = new JLabel("Employee Name: ");
          name.setBounds(280, 150, 700, 40);
		  name.setFont(new Font("",Font.BOLD,30));
          
		  n = new JTextField(20);
          n.setBounds(560, 150, 300, 40);
		  n.setFont(new Font("",Font.BOLD,30));
          
		  post = new JLabel("Employee Post: ");
          post.setBounds(280, 220, 700, 40);
		  post.setFont(new Font("",Font.BOLD,30));
          
		  p = new JTextField(20);
          p.setBounds(560, 220, 300, 40);
		  p.setFont(new Font("",Font.BOLD,30));
          
		  salary = new JLabel("Employee Salary: ");
          salary.setBounds(280, 290, 300, 40);
		  salary.setFont(new Font("",Font.BOLD,30));
          
		  s = new JTextField(20);
          s.setBounds(560, 290, 300, 40);
		  s.setFont(new Font("",Font.BOLD,30));
          
		  b1=new JButton("DELETE");
		  b1.setBounds(560,400,200,40);
		  b1.setFont(new Font("",Font.BOLD,25));
		  b1.addActionListener(this);
		  
		  setLayout(null);
          add(btn_search);
          add(name);
          add(n);
          add(post);
          add(p);
          add(salary);
          add(s);
          add(id);
          add(i);
		  add(b1);
    }

      public void actionPerformed(ActionEvent ae) 
  { 
	     if(ae.getSource()==btn_search){
    Function f = new Function();
    ResultSet rs = null;
    String fn = "name";
    String po = "post";
    String sa = "salary";
    
    rs = f.find(i.getText());
    try{
        if(rs.next()){
            n.setText(rs.getString("name"));
            p.setText(rs.getString("post"));
            s.setText(rs.getString("salary"));
        } 
    	else{
          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
             }
        }
	    catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
	   }
	   
	   else if(ae.getSource()==b1)
	   {
		   Statement st=null;
		    try {  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","123456");
		    st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            int id=Integer.parseInt(i.getText());
			String sql="delete from employee where id="+id+"";	
			
				st.executeUpdate(sql);
				JOptionPane.showMessageDialog(this,"Deleted Successfully","Delete",JOptionPane.WARNING_MESSAGE);
				

			}catch(Exception ex){}
	   }
		else
		{
			
		}
    }
   public class Function{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String ss){
           try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","123456");
           ps = con.prepareStatement("select * from employee where id = ?");
           ps.setString(1,ss);
           rs = ps.executeQuery();
           }catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs;
       }
   }
   
}