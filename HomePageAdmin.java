package Bootathon_1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HomePageAdmin {

	public HomePageAdmin(String lid, String namenow) {
		JFrame f=new JFrame();
    	f.setLayout(null);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	    f.setBounds(270, 50, 970, 750);
  	    f.setVisible(true);
  	    Container c1=f.getContentPane();
  	    JButton regis=new JButton(new ImageIcon("C:\\Users\\haren\\Desktop\\Bootathon_1\\register.png"));
  	    JButton insure=new JButton(new ImageIcon("C:\\Users\\haren\\Desktop\\Bootathon_1\\insurance.png\\"));
  	    JButton payroll=new JButton(new ImageIcon("C:\\Users\\haren\\Desktop\\Bootathon_1\\payroll.png\\"));
  	    JButton attendance=new JButton(new ImageIcon("C:\\Users\\haren\\Desktop\\Bootathon_1\\attendance.png\\"));
  	    JButton announcements=new JButton(new ImageIcon("C:\\Users\\haren\\Desktop\\Bootathon_1\\announcem_100x100.png\\"));
  	    JButton calendar=new JButton(new ImageIcon("C:\\Users\\haren\\Desktop\\Bootathon_1\\calendar-100.png\\"));
  	    JButton resign=new JButton(new ImageIcon("C:\\Users\\haren\\Desktop\\Bootathon_1\\resign.png\\"));
  	    JButton update=new JButton(new ImageIcon("C:\\Users\\haren\\Desktop\\Bootathon_1\\update.png\\"));
  	    JButton view=new JButton(new ImageIcon("C:\\Users\\haren\\Desktop\\Bootathon_1\\view.png\\"));
  	    c1.setBackground(new Color(223, 249, 251));
  	    ActionListener updt=(eme)->{
  	    f.dispose();
  	    new UpdateForm(lid,namenow);

      };
      update.addActionListener(updt);
      ActionListener cale=(eme)->{
  	    f.dispose();
  	    new CalendarPage(lid,namenow);

      };
      calendar.addActionListener(cale);
  	    ActionListener reg=(eme)->{
	  	    f.dispose();
	    	new RegistrationForm(lid,namenow);
	
       };
       regis.addActionListener(reg);
  	    ActionListener act=(eme)->{
  	    	  	    f.dispose();
	    	    	new Insurance_form(lid,namenow);
  	    	
  	    };
  	    
  	    ActionListener announ=(eme)->{
	  	   f.dispose();
	    	new AnnouncementPage(lid,namenow);
	
        };
       
        ActionListener att1=(eme)->{
	  	     f.dispose();
	    	AttendanceForm er = new AttendanceForm(lid,namenow);
        	er.setTitle("");
    		er.setSize(1602,800);
    		er.setVisible(true);
    		er.setResizable(true);
    		er.setLocationRelativeTo(null);
    		er.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   	
        };
        
        ActionListener resi=(eme)->{
	  	    f.dispose();
	    	new ResignForm(lid,namenow);
	
       };
       
       resign.addActionListener(resi);
       attendance.addActionListener(att1);
       announcements.addActionListener(announ);
       insure.addActionListener(act);
  	    JLabel home=new JLabel("ADMIN HOME PAGE");
  	    home.setBounds(280,50,400,50);
  	    home.setFont(new Font("Roboto Mono",Font.BOLD,40));
		home.setForeground(Color.black);
   	    regis.setBounds(40,150,110,110);
  	    insure.setBounds(230,150,110,110);
  	    announcements.setBounds(420,150,110,110);
  	    payroll.setBounds(610,150,110,110);
  	    calendar.setBounds(800, 150, 110, 110);
  	    attendance.setBounds(130,340,110,110);
  	    resign.setBounds(330,340,110,110);
  	    update.setBounds(515,340,110,110);
  	    view.setBounds(710,340,110,110);
  	    insure.setBackground(Color.white);
  	    announcements.setBackground(Color.white);
  	    payroll.setBackground(Color.white);
  	    calendar.setBackground(Color.white);
	    attendance.setBackground(Color.white);
	    resign.setBackground(Color.white);
	    update.setBackground(Color.white);
  	    view.setBackground(Color.white);
  	    regis.setBackground(Color.white);
  	    JLabel twi=new JLabel(new ImageIcon("C:\\Users\\haren\\Desktop\\Bootathon_1\\icons8-twitter.gif\\"));
  	    twi.setBounds(30, 500, 60, 60);
  	    JLabel wp=new JLabel(new ImageIcon("C:\\Users\\haren\\Desktop\\Bootathon_1\\icons8-whatsapp-25.png"));
	     wp.setBounds(30, 500, 50, 50);
	    JButton lout=new JButton("Log Out");
	    lout.setBounds(730,550,100,30);
	    ActionListener logout=(eme)->{
	    	f.dispose();
	 	    	new Login_form();
    	};
    	lout.addActionListener(logout);
    	JLabel re=new JLabel("Register");
  	    re.setBounds(65, 260, 150, 30);
   	    JLabel in=new JLabel("Insurance");
  	    in.setBounds(255, 260, 150, 30);
  	     JLabel ann=new JLabel("Announcements");
	    ann.setBounds(430, 260, 150, 30);
	    JLabel pay=new JLabel("Payroll");
  	    pay.setBounds(640, 260, 150, 30);
  	  JLabel cal=new JLabel("Calendar");
	    cal.setBounds(825, 260, 150, 30);
	    JLabel att=new JLabel("Attendance");
  	    att.setBounds(150, 455, 150, 30);
  	  JLabel res=new JLabel("Resignation");
	    res.setBounds(345, 455, 150, 30);
	    JLabel upd=new JLabel("Update");
  	    upd.setBounds(540, 455, 150, 30);
  	  JLabel vie=new JLabel("View Employee");
	    vie.setBounds(725, 455, 150, 30);
  	    f.add(in);f.add(re);	  	  
	    f.add(lout);f.add(ann);f.add(pay);f.add(cal);f.add(att);f.add(res);f.add(upd);f.add(vie);f.add(view);f.add(home);f.add(regis);
  	    f.add(insure);f.add(announcements);f.add(payroll);f.add(calendar);f.add(attendance);f.add(resign);f.add(update);
    }
	public static void main(String[] args) {
		new HomePageAdmin("","");
   }
	}


